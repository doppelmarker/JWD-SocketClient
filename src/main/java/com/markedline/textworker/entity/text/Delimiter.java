package com.markedline.textworker.entity.text;

import java.io.Serializable;

public enum Delimiter implements Serializable {
    DOT("."),
    EXCLAMATION("!"),
    QUESTION("?");

    private final String sign;

    Delimiter(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return sign;
    }
}
