package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<byte[]> list = new ArrayList<>();
        int memoryAdded = 0;

        while (true) {
            // Each iteration creates a 10 MB object
            list.add(new byte[1024 * 1024 * 10]);
            memoryAdded += 10;
            System.out.println("Memory added: " + memoryAdded + " MB");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}