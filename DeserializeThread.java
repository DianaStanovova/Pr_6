/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pr_6;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
/**
 *
 * @author stanovova
 */
public class DeserializeThread implements Runnable {

    private final String filePath;
    
    public DeserializeThread(String filePath) {
        this.filePath = filePath;
    }
    
    @Override
    public void run() {
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            
            Message message = (Message) objectInputStream.readObject();
            System.out.println(message.toString());
            
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
