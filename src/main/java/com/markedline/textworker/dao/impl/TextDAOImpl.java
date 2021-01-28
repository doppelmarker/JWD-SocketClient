package com.markedline.textworker.dao.impl;

import com.markedline.textworker.dao.TextDAO;

import java.io.*;

public class TextDAOImpl implements TextDAO {

    @Override
    public String read(String fileName) {
        ClassLoader classLoader = TextDAOImpl.class.getClassLoader();
        StringBuilder text = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(classLoader.getResource(fileName).getFile())))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File " + fileName + " not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException: " + ex.getMessage());
        }
        return text.toString();
    }
}
