package com.big0soft.games.handle;

import java.util.HashMap;
import java.util.Map;

public class ArabicResponseMessage extends IResponseMessage {
    @Override
    public Map<String, ResponseCode> translateMap() {
        Map<String, ResponseCode> map = new HashMap<>();
        map.put(ADS_ERROR, new ResponseCode("حدث خطأ اثناء استرداد بيانات الإعلانات", 1));
        map.put(USER_NOT_FOUND, new ResponseCode("المستخدم غير موجود", ResponseCode.USERNAME_NOT_FOUND));
        map.put(USER_NOT_PROVIDED, new ResponseCode("لم يتم توفير اسم المستخدم", ResponseCode.USERNAME_NOT_PROVIDED));
        map.put(USERNAME_INVALID, new ResponseCode("خطأ اسم المستخدم فارغ", ResponseCode.USERNAME_EMPTY));
        map.put(USERNAME_NOT_REGISTERED, new ResponseCode("لم يتم تسجيل اسم لاعب", ResponseCode.USERNAME_NOT_REGISTERED));
        map.put(USER_REGISTERED, new ResponseCode("اسم لاعب مسجل", ResponseCode.USERNAME_EXISTS));
        map.put(USERNAME_ALREADY_EXISTS, new ResponseCode("اسم المستخدم مسجل مسبقا", ResponseCode.USERNAME_EXISTS));
        map.put(UID_EMPTY, new ResponseCode("اي دي الجهاز خطأ", ResponseCode.UID_EMPTY));
        map.put(PASSWORD_EMPTY, new ResponseCode("كلمة فارغة", ResponseCode.PASSWORD_EMPTY));
        map.put(FAILED_TO_REGISTER_USER, new ResponseCode("فشل تسجيل المستخدم", ResponseCode.USERNAME_NOT_REGISTERED));
        map.put(PASSWORD_NOT_PROVIDED, new ResponseCode("الرجاء ادخال كلمة السر", ResponseCode.PASSWORD_NOT_PROVIDED));
        map.put(EMAIL_NOT_PROVIDED, new ResponseCode("لم يتم توفير الايميل", ResponseCode.EMAIL_NOT_PROVIDED));
        map.put(EMAIL_ALREADY_EXISTS, new ResponseCode("الايميل مسجل مسبقا", ResponseCode.EMAIL_ALREADY_EXISTS));
        map.put(UID_NOT_PROVIDED, new ResponseCode("لم يتم توفير اي دي لاعب", ResponseCode.UID_NOT_PROVIDED));
        map.put(GAME_NOT_PROVIDED, new ResponseCode("لم يتم توفير اسم اللعبة", 1));
        map.put(GAME_NOT_FOUND, new ResponseCode("لم يتم العثور على اللعبة", 1));
        map.put(FAILED_PLAYER_CONNECT, new ResponseCode("فشل الاتصال با لاعب", 1));
        map.put(ROOM_OWNER_NOT_FOUND, new ResponseCode("المستخدم غير موجود", 1));
        map.put(ROOM_OWNER_NOT_PROVIDED, new ResponseCode("لم يتم توفير اسم المستخدم", 1));
        map.put(ROOM_ENTER_PLAYER_NOT_PROVIDED, new ResponseCode("لم يتم توفير اسم المستخدم", 1));
        map.put(ROOM_ENTER_PLAYER_NOT_FOUND, new ResponseCode("المستخدم غير موجود", 1));
        map.put(FAILED_CREATE_ROOM, new ResponseCode("فشل إنشاء الغرفة", 1));
        map.put(FAILED_JOIN_ROOM, new ResponseCode("فشل الانضمام إلى الغرفة", 1));
        map.put(FAILED_DELETE_ROOM, new ResponseCode("فشل حذف الغرفة", 1));
        map.put(FAILED_UPDATE_PLAYER, new ResponseCode("فشل تحديث معلومات لاعب", 1));
        map.put(CANNOT_PLAY_WITH_YOURSELF, new ResponseCode("لا يمكن اللعب بنفس اسم المستخدم", 1));
        map.put(COINS_NOT_PROVIDED, new ResponseCode("لم يتم توفير العملات", 1));
        map.put(COINS_NOT_UPDATED, new ResponseCode("لم يتم تحديث العملات", 1));
        map.put(SERVER_IS_IN_MAINTENANCE, new ResponseCode("التطبيق في الصيانة الان", 1));
        map.put(UUID_NULL, new ResponseCode("خطأ في البيانات لاعب", 1));

        map.put(UUID_INVALID, new ResponseCode("لا يمكنك التسجيل بنفس الحساب اكثر من مرة", 1));

        map.put(NO_GAME_ROOM_FOUND_FOR_THE_OWNER, new ResponseCode("لم يتم العثور على غرفة", 1));
        map.put(ROOM_ID_NOT_PROVIDED, new ResponseCode("لم يتم توفير معرف الغرفة", 1));
        map.put(App_VERSION_NOT_PROVIDED, new ResponseCode("لم يتم توفير رقم نسخة التطبيق", 1));
        map.put(APP_NAME_NOT_PROVIDED, new ResponseCode("لم يتم توفير اسم تطبيق", 1));
        map.put(LEVEL_INVALID, new ResponseCode("لم يتم توفير مستوى اللعبة", 1));
        map.put(LEVEL_NOT_FOUND, new ResponseCode("مستوى اللعبة غير موجود", 1));
        map.put(LEVEL_EXISTS, new ResponseCode("مستوى اللعبة تم تخطيه", 1));

        return map;
    }

    @Override
    public ResponseCode getResponseCode(String key) {
        if (key == null || key.isEmpty()) throw new NullPointerException("key");
        Map<String, ResponseCode> map = translateMap();
        return map.get(key);
    }
}
