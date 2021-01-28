package com.markedline.textworker.app;

import com.markedline.textworker.client.Client;

public class Application {
    public static void main(String[] args) {
        Client client = new Client("127.0.0.1", 8000);
        client.run();
    }
}
