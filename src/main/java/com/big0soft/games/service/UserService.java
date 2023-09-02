package com.big0soft.games.service;

import com.big0soft.games.dto.*;
import com.big0soft.games.handle.IResponseMessage;
import com.big0soft.games.handle.ResponseCode;
import com.big0soft.games.model.UserEntity;
import com.big0soft.games.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.big0soft.games.handle.IResponseMessage.*;
import static com.big0soft.games.utils.RegularUtils.isEmail;
import static org.springframework.util.ObjectUtils.isEmpty;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final IResponseMessage responseMessage;

    public UserDto registerUser(UserEntity user) {
        emailValidation(user);
        usernameValidation(user);
        if (userRepository.existsByUsername(user.getUsername())) {
            getResponseCode(USERNAME_ALREADY_EXISTS);
            ResponseCode responseCode = responseMessage.getResponseCode(USERNAME_ALREADY_EXISTS);
            throw new UsernameExistsException(responseCode.message(), responseCode.stateCode());
        }
        if (userRepository.existsByEmail(user.getEmail())) {
            ResponseCode responseCode = responseMessage.getResponseCode(USERNAME_ALREADY_EXISTS);
            throw new EmailExistsException(responseCode.message(), responseCode.stateCode());
        }
        passwordValidation(user);
        uidValidation(user);
        return new UserDto(userRepository.save(user));
    }

    private void getResponseCode(String key) {

    }

    private void emailValidation(UserEntity user) {
        if (!isEmail(user.getEmail())) {
            ResponseCode responseCode = responseMessage.getResponseCode(USERNAME_ALREADY_EXISTS);
            throw new EmptyValueException(responseCode.message(), responseCode.stateCode());
        }
    }

    private void uidValidation(UserEntity user) {

        if (isEmpty(user.getUid())) {
            ResponseCode responseCode = responseMessage.getResponseCode(UID_EMPTY);
            throw new EmptyValueException(responseCode.message(), responseCode.stateCode());
        }
    }

    private void usernameValidation(UserEntity user) {
        if (isEmpty(user.getUsername())) {
            ResponseCode responseCode = responseMessage.getResponseCode(USERNAME_EMPTY);
            throw new EmptyValueException(responseCode.message(), responseCode.stateCode());
        }
    }

    private void passwordValidation(UserEntity user) {
        if (isEmpty(user.getPassword())) {
            ResponseCode responseCode = responseMessage.getResponseCode(PASSWORD_EMPTY);
            throw new EmptyValueException(responseCode.message(), responseCode.stateCode());
        }
    }

    public UserDto login(UserEntity user, String provider) {

        emailValidation(user);
        if (provider.equals("google")) {
            return new UserDto(googleLogin(user));
        }
        if (isEmail(user.getEmail())) {
            return new UserDto(emailLogin(user));
        }
        passwordValidation(user);
        usernameValidation(user);
        return new UserDto(usernameLogin(user));
    }

    public UserEntity googleLogin(UserEntity user) {
        if (!userRepository.existsByEmail(user.getEmail())) {
            return userRepository.save(user);
        }
        ResponseCode responseCode = responseMessage.getResponseCode(USER_NOT_FOUND);

        return userRepository.findByEmail(user.getEmail())
                .orElseThrow(() -> new NotFoundException(responseCode.message(), responseCode.stateCode()));
    }


    private UserEntity usernameLogin(UserEntity user) {
        ResponseCode responseCode = responseMessage.getResponseCode(USER_NOT_FOUND);
        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword())
                .orElseThrow(() -> new NotFoundException(responseCode.message(), responseCode.stateCode()));
    }

    private UserEntity emailLogin(UserEntity user) {
        ResponseCode responseCode = responseMessage.getResponseCode(USER_NOT_FOUND);
        return userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword())
                .orElseThrow(() -> new NotFoundException(responseCode.message(), responseCode.stateCode()));
    }
}
