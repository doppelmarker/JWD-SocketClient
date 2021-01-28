package com.markedline.textworker.exchange.dataassembler.impl;

import com.markedline.textworker.dao.DAOFactory;
import com.markedline.textworker.dao.TextDAO;
import com.markedline.textworker.entity.inputdata.AbstractInputData;
import com.markedline.textworker.entity.inputdata.DataKey;
import com.markedline.textworker.entity.inputdata.InputDataFactory;
import com.markedline.textworker.exchange.dataassembler.InputDataAssembler;

import java.util.HashMap;
import java.util.Map;

public class TextInputDataAssembler implements InputDataAssembler {

    @Override
    public AbstractInputData assembleData(String command) {
        TextDAO textDAO = DAOFactory.getInstance().getTextDAO();

        String text = textDAO.read("text.txt");

        Map<DataKey, Object> map = new HashMap<>();

        map.put(DataKey.TEXT, text);

        return InputDataFactory.createInputData(command, map);
    }
}
