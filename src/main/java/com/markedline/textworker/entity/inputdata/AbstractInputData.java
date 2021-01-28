package com.markedline.textworker.entity.inputdata;

import java.io.Serializable;

public abstract class AbstractInputData implements Serializable {

    public abstract String getInputText();

    public abstract int getInputLength();

    public abstract char getInputFirstChar();

    public abstract char getInputSecondChar();

    public abstract String getInputWordlist();

    public abstract int getInputNumber();

    public abstract String getInputString();
}
