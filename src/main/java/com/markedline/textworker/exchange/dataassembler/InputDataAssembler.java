package com.markedline.textworker.exchange.dataassembler;

import com.markedline.textworker.entity.inputdata.AbstractInputData;

public interface InputDataAssembler {

    AbstractInputData assembleData(String command);
}
