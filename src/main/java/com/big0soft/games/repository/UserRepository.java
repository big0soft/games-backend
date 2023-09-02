package com.big0soft.games.repository;

import com.big0soft.games.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {


    @Query("select u from UserEntity u where u.username = ?1 and u.password = ?2")
    Optional<UserEntity> findByUsernameAndPassword(String username, String password);
    @Query("select u from UserEntity u where u.email = ?1 and u.password = ?2")
    Optional<UserEntity> findByEmailAndPassword(String email, String password);

    @Query("select (count(u) > 0) from UserEntity u where u.username = ?1")
    boolean existsByUsername(String username);
    @Query("select (count(u) > 0) from UserEntity u where u.email = ?1")
    boolean existsByEmail(String email);

    @Query("select u from UserEntity u where u.email = ?1 limit 1")
    Optional<UserEntity> findByEmail(String email);
}
