package com.markedline.textworker.entity.result;

import java.io.Serializable;
import java.util.Objects;

public class IntegerResult extends AbstractResult implements Serializable {

    private final Integer value;

    public IntegerResult(Integer value) {
        this.value = value;
    }


    @Override
    public String getResult() {
        return toString();
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerResult that = (IntegerResult) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
