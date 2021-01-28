package com.markedline.textworker.entity.result;

import com.markedline.textworker.entity.text.Text;

import java.io.Serializable;
import java.util.Objects;

public class TextResult extends AbstractResult implements Serializable {

    private final Text text;

    public TextResult(Text text) {
        this.text = text;
    }

    @Override
    public String getResult() {
        return toString();
    }

    @Override
    public String toString() {
        return text.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextResult that = (TextResult) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
