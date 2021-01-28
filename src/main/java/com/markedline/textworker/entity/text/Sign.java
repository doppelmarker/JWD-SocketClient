package com.markedline.textworker.entity.text;

import java.io.Serializable;
import java.util.Objects;

public class Sign implements Serializable {

    private final String sign;

    public Sign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return sign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sign sign1 = (Sign) o;
        return Objects.equals(sign, sign1.sign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sign);
    }
}
