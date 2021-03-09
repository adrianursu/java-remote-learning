package com.iquestgroup;

public class StringMatcher {

    public boolean isEmailValid(String s) {
        return s.matches("^[^.]([A-Za-z0-9.]+)@([\\w]+)((\\.(\\w){2,3})+)$");
    }

    public boolean isPasswordValid(String s) {
        return s.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[: !#$%&'()*+,-./:;<=>?@\\^_`{|}~])[A-Za-z !\\#$%&'()*+,-./:;<=>?@\\]^_`{|}~]{10,}$");
    }

    public boolean isPhoneNumberValid(String s) {
        return s.matches("^(\\+\\d{1,3}\\s)?(\\d{1,4}\\s)?\\(?\\d{3}\\)?([\\s.-]\\d{3}[\\s.-]\\d{4})$");
    }
}

