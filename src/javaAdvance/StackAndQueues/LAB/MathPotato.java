package javaAdvance.StackAndQueues.LAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;

public class MathPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] name = reader.readLine().split(" ");
        int n = Integer.parseInt(reader.readLine());
        ArrayDeque<String> children = new ArrayDeque<>();

        Collections.addAll(children, name);
        int round = 1;

        while (children.size() > 1) {
            for (int i = 0; i < n - 1; i++) {
                String currentChild = children.poll();
                children.offer(currentChild);
            }
            if (isPrime(round)) {
                String lastChild = children.peek();
                System.out.println("Prime " + lastChild);
            } else {
                String child = children.poll();
                System.out.println("Removed " + child);
            }
            round++;
        }

        String lastChild = children.poll();
        System.out.println("Last is " + lastChild);


    }

    private static boolean isPrime(int number) {
        if (number == 1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }

        }
        return  true;
    }
}
