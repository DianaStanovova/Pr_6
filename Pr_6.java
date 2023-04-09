/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pr_6;

import java.util.Scanner;

/**
 *
 * @author stanovova
 */
public class Pr_6 {

    public static void main(String[] args) {
        System.out.println("Становова Диана, РИБО-03-21, Вариант 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("путь до файла: ");
        String filePath = scanner.nextLine();
        Thread thread = Thread(new DeserializeThread(filePath));
        thread.start();
    }

    private static Thread Thread(DeserializeThread deserializeThread) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
