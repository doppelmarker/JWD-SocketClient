package com.markedline.textworker.entity.inputdata;

import java.util.Map;

public final class InputDataFactory {

    public static AbstractInputData createInputData(String command, Map<DataKey, Object> map) {
        switch (command) {
            case "4", "12" -> {
                if (
                        !map.containsKey(DataKey.TEXT) ||
                                !map.containsKey(DataKey.LENGTH)
                ) return null;
                return new TextAndLengthInputData(
                        map.get(DataKey.TEXT).toString(),
                        (int) map.get(DataKey.LENGTH)
                );
            }
            case "9", "13" -> {
                if (
                        !map.containsKey(DataKey.TEXT) ||
                                !map.containsKey(DataKey.FIRST_SYMBOL)
                ) return null;
                return new TextAndSymbolInputData(
                        map.get(DataKey.TEXT).toString(),
                        (char) map.get(DataKey.FIRST_SYMBOL)
                );
            }
            case "10" -> {
                if (
                        !map.containsKey(DataKey.TEXT) ||
                                !map.containsKey(DataKey.WORDLIST)
                ) return null;
                return new TextAndWordlistInputData(
                        map.get(DataKey.TEXT).toString(),
                        map.get(DataKey.WORDLIST).toString()
                );
            }
            case "11" -> {
                if (
                        !map.containsKey(DataKey.TEXT) ||
                                !map.containsKey(DataKey.FIRST_SYMBOL) ||
                                !map.containsKey(DataKey.SECOND_SYMBOL)
                ) return null;
                return new TextAndTwoSymbolsInputData(
                        map.get(DataKey.TEXT).toString(),
                        (char) map.get(DataKey.FIRST_SYMBOL),
                        (char) map.get(DataKey.SECOND_SYMBOL)
                );
            }
            case "16" -> {
                if (
                        !map.containsKey(DataKey.TEXT) ||
                                !map.containsKey(DataKey.NUMBER) ||
                                !map.containsKey(DataKey.LENGTH) ||
                                !map.containsKey(DataKey.STRING)
                ) return null;
                return new TextAndNumberAndLengthAndStringInputData(
                        map.get(DataKey.TEXT).toString(),
                        (int) map.get(DataKey.NUMBER),
                        (int) map.get(DataKey.LENGTH),
                        map.get(DataKey.STRING).toString()
                );
            }
            default -> {
                if (!map.containsKey(DataKey.TEXT)) return null;
                return new TextInputData(map.get(DataKey.TEXT).toString());
            }
        }
    }
}
