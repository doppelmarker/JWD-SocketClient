package com.markedline.textworker.exchange.bridge.impl;

import com.markedline.textworker.entity.inputdata.AbstractInputData;
import com.markedline.textworker.entity.result.AbstractResult;
import com.markedline.textworker.exchange.bridge.Bridge;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BridgeImpl implements Bridge {

    @Override
    public void sendData(ObjectOutputStream writer, AbstractInputData data) {
        try {
            writer.writeObject(data);
        } catch (IOException e) {
            System.out.println("Error sending data: " + e.getMessage());
        }
    }

    @Override
    public void sendCommand(ObjectOutputStream writer, String command) {
        try {
            writer.writeObject(command);
        } catch (IOException e) {
            System.out.println("Error sending command: " + e.getMessage());
        }
    }

    @Override
    public AbstractResult getAnswer(ObjectInputStream reader) {
        AbstractResult result = null;
        try {
            result = (AbstractResult) reader.readObject();
        } catch (IOException e) {
            System.out.println("Error receiving result: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class of result is not AbstractResult or its child: " + e.getMessage());
        }
        return result;
    }
}
