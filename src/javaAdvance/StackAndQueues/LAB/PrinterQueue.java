package javaAdvance.StackAndQueues.LAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class PrinterQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<String>files = new ArrayDeque<>();
        String input = reader.readLine();

        while (!input.equals("print")){
            if (input.equals("cancel")){
                if (files.size()< 1){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.printf("Canceled %s%n",files.pop());
                }
                }else {
                files.offer(input);
            }
            input = reader.readLine();
        }
        for (String file : files) {
            System.out.println(file);
        }


    }
}
