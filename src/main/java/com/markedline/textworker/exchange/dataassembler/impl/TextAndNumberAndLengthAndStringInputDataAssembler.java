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

public class TextAndNumberAndLengthAndStringInputDataAssembler implements InputDataAssembler {
    @Override
    public AbstractInputData assembleData(String command) {
        TextDAO textDAO = DAOFactory.getInstance().getTextDAO();

        String text = textDAO.read("text.txt");

        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");

        int number = in.nextInt();

        System.out.print("Input length: ");

        int length = in.nextInt();

        System.out.print("Input string: ");

        String string = in.nextLine();

        Map<DataKey, Object> map = new HashMap<>();
        map.put(DataKey.TEXT, text);
        map.put(DataKey.NUMBER, number);
        map.put(DataKey.LENGTH, length);
        map.put(DataKey.STRING, string);

        return InputDataFactory.createInputData(command, map);
    }
}
