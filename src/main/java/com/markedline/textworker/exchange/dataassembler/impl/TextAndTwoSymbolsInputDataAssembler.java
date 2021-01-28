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

public class TextAndTwoSymbolsInputDataAssembler implements InputDataAssembler {
    @Override
    public AbstractInputData assembleData(String command) {
        TextDAO textDAO = DAOFactory.getInstance().getTextDAO();

        String text = textDAO.read("text.txt");

        System.out.print("Input first symbol: ");

        Scanner in = new Scanner(System.in);

        String firstSymbol = in.nextLine();

        System.out.print("Input second symbol: ");

        String secondSymbol = in.nextLine();

        Map<DataKey, Object> map = new HashMap<>();
        map.put(DataKey.TEXT, text);
        map.put(DataKey.FIRST_SYMBOL, firstSymbol.charAt(0));
        map.put(DataKey.SECOND_SYMBOL, secondSymbol.charAt(0));

        return InputDataFactory.createInputData(command, map);
    }
}
