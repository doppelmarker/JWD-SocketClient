package com.markedline.textworker.entity.result;

import java.io.Serializable;
import java.util.Objects;

public class StringResult extends AbstractResult implements Serializable {

    private final String text;

    public StringResult(String text) {
        this.text = text;
    }

    @Override
    public String getResult() {
        return toString();
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringResult that = (StringResult) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
