package com.digitalinnovatione.personapi.utils;

import com.digitalinnovatione.personapi.dto.request.PhoneDTO;
import com.digitalinnovatione.personapi.entity.Phone;
import com.digitalinnovatione.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final Long PHONE_ID = 1L;
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final  String PHONE_NUMBER = "(11)0000011010";

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .type(PHONE_TYPE)
                .number(PHONE_NUMBER)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .type(PHONE_TYPE)
                .number(PHONE_NUMBER)
                .build();
    }
}
