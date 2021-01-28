package com.markedline.textworker.client;

import com.markedline.textworker.exchange.bridge.Bridge;
import com.markedline.textworker.exchange.bridge.impl.BridgeImpl;
import com.markedline.textworker.exchange.dataassembler.InputDataAssembler;
import com.markedline.textworker.exchange.dataassembler.InputDataAssemblerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    private ObjectInputStream reader;
    private ObjectOutputStream writer;
    private Socket clientSocket;

    public Client(String serverAddress, int port) {
        System.out.println("Establishing connection. Please wait ...");
        try {
            clientSocket = new Socket(serverAddress, port);
            initIOStreams();
            System.out.println("Connected: " + clientSocket);
        } catch (UnknownHostException e) {
            System.out.println("Host unknown: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error opening reader/writer: " + e.getMessage());
        }
    }

    private void initIOStreams() throws IOException {
        writer = new ObjectOutputStream(clientSocket.getOutputStream());
        reader = new ObjectInputStream(clientSocket.getInputStream());
    }

    public void run() {
        System.out.println("Input task number <1 to 16> or <q> to exit: ");

        Bridge bridge = new BridgeImpl();

        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        InputDataAssembler dataAssembler;
        while (!command.equals("q")) {
            bridge.sendCommand(writer, command);
            dataAssembler = InputDataAssemblerFactory.createInputDataAssembler(command);
            bridge.sendData(writer, dataAssembler.assembleData(command));
            System.out.println("Result: " + bridge.getAnswer(reader).getResult());
            command = in.nextLine();
        }
    }
}

