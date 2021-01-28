package com.markedline.textworker.exchange.dataassembler;

import com.markedline.textworker.exchange.dataassembler.impl.*;

public final class InputDataAssemblerFactory {

    public static InputDataAssembler createInputDataAssembler(String command) {
        switch (command) {
            case "4", "12" -> {
                return new TextAndLengthInputDataAssembler();
            }
            case "9", "13" -> {
                return new TextAndSymbolInputDataAssembler();
            }
            case "10" -> {
                return new TextAndWordlistInputDataAssembler();
            }
            case "11" -> {
                return new TextAndTwoSymbolsInputDataAssembler();
            }
            case "16" -> {
                return new TextAndNumberAndLengthAndStringInputDataAssembler();
            }
            default -> {
                return new TextInputDataAssembler();
            }
        }
    }
}
