package com.proartz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = null;

        try {

            scanner = new Scanner(new BufferedReader(new FileReader("input.txt")));

            while(scanner.hasNext()) {
                System.out.println(scanner.next());
            }

        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }
    }
}
