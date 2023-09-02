package com.big0soft.games.handle;

import java.util.Map;

public abstract class IResponseMessage {
    public static final String ARABIC = "ar";
    public static final String ENGLISH = "en";

    public static final String ADS_ERROR = "ads_error";
    public static final String PASSWORD_NOT_PROVIDED = "PASSWORD_NOT_PROVIDED";
    public static final String PASSWORD_EMPTY = "PASSWORD_EMPTY";
    public static final String USERNAME_ALREADY_EXISTS = "USERNAME_ALREADY_EXISTS";
    public static final String USERNAME_EMPTY = "USERNAME_EMPTY";
    public static final String USER_NOT_FOUND = "USER_NOT_FOUND";
    public static final String USERNAME_AVAILABLE = "USERNAME_AVAILABLE";
    public static final String USER_NOT_PROVIDED = "USER_NOT_PROVIDED";
    public static final String EMAIL_NOT_PROVIDED = "EMAIL_NOT_PROVIDED";
    public static final String EMAIL_ALREADY_EXISTS = "EMAIL_ALREADY_EXISTS";
    public static final String FAILED_TO_REGISTER_USER = "FAILED_TO_REGISTER_USER";
    public static final String UID_NOT_PROVIDED = "UID_NOT_PROVIDED";
    public static final String UID_EMPTY = "UID_EMPTY";
    public static final String GAME_NOT_FOUND = "GAME_NOT_FOUND";
    public static final String GAME_NOT_PROVIDED = "GAME_NOT_PROVIDED";

    public static final String APP_NAME_NOT_PROVIDED = "APP_NAME_NOT_PROVIDED";
    public static final String App_VERSION_NOT_PROVIDED = "App_VERSION_NOT_PROVIDED";

    public static final String FAILED_PLAYER_CONNECT = "FAILED_PLAYER_CONNECT";

    public static final String ROOM_OWNER_NOT_FOUND = "ROOM_OWNER_NOT_FOUND";
    public static final String ROOM_OWNER_NOT_PROVIDED = "ROOM_OWNER_NOT_PROVIDED";
    public static final String ROOM_ID_NOT_PROVIDED = "ROOM_ID_NOT_PROVIDED";

    public static final String ROOM_ENTER_PLAYER_NOT_FOUND = "ROOM_ENTER_PLAYER_NOT_FOUND";
    public static final String ROOM_ENTER_PLAYER_NOT_PROVIDED = "ROOM_ENTER_PLAYER_NOT_PROVIDED";
    public static final String NO_GAME_ROOM_FOUND_FOR_THE_OWNER = "NO_GAME_ROOM_FOUND_FOR_THE_OWNER";

    public static final String FAILED_CREATE_ROOM = "FAILED_CREATE_ROOM";
    public static final String FAILED_JOIN_ROOM = "FAILED_JOIN_ROOM";
    public static final String FAILED_UPDATE_PLAYER = "FAILED_UPDATE_PLAYER";
    public static final String FAILED_DELETE_ROOM = "FAILED_DELETE_ROOM";
    public static final String ROOM_BUSY = "ROOM_BUSY";
    public static final String CANNOT_PLAY_WITH_YOURSELF = "CANNOT_PLAY_WITH_YOURSELF";
    public static final String COINS_NOT_PROVIDED = "COINS_NOT_PROVIDED";
    public static final String COINS_NOT_UPDATED = "COINS_NOT_UPDATED";

    public static final String SERVER_IS_IN_MAINTENANCE = "SERVER_IS_IN_MAINTENANCE";
    public static final String USERNAME_INVALID = "USERNAME_INVALID";
    public static final String UUID_NULL = "UUID_NULL";
    public static final String USERNAME_NOT_REGISTERED = "USERNAME_NOT_REGISTERED";
    public static final String UUID_INVALID = "UUID_INVALID";

    public static final String USER_REGISTERED = "USER_REGISTERED";
    public static final String LEVEL_INVALID = "LEVEL_INVALID";
    public static final String LEVEL_NOT_FOUND = "LEVEL_NOT_FOUND";
    public static final String LEVEL_EXISTS = "LEVEL_EXISTS";

    public abstract Map<String, ResponseCode> translateMap();

    public abstract ResponseCode getResponseCode(String key);

}
