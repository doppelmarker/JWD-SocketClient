package com.markedline.textworker.exchange.bridge;

import com.markedline.textworker.entity.inputdata.AbstractInputData;
import com.markedline.textworker.entity.result.AbstractResult;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public interface Bridge {

    void sendData(ObjectOutputStream writer, AbstractInputData data);

    void sendCommand(ObjectOutputStream writer, String command);

    AbstractResult getAnswer(ObjectInputStream reader);
}
