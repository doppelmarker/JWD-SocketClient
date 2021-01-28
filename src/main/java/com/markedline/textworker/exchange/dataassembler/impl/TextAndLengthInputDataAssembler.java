package com.markedline.textworker.exchange.dataassembler.impl;

import com.markedline.textworker.dao.DAOFactory;
import com.markedline.textworker.dao.TextDAO;
import com.markedline.textworker.entity.inputdata.AbstractInputData;
import com.markedline.textworker.entity.inputdata.DataKey;
import com.markedline.textworker.entity.inputdata.InputDataFactory;
import com.markedline.textworker.exchange.dataassembler.InputDataAssembler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextAndLengthInputDataAssembler implements InputDataAssembler {
    @Override
    public AbstractInputData assembleData(String command) {
        TextDAO textDAO = DAOFactory.getInstance().getTextDAO();

        String text = textDAO.read("text.txt");

        Scanner in = new Scanner(System.in);

        System.out.print("Input length: ");

        int length = in.nextInt();

        Map<DataKey, Object> map = new HashMap<>();
        map.put(DataKey.TEXT, text);
        map.put(DataKey.LENGTH, length);

        return InputDataFactory.createInputData(command, map);
    }
}
