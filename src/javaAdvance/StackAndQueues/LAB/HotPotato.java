package javaAdvance.StackAndQueues.LAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class HotPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] names = reader.readLine().split(" ");
        ArrayDeque<String> people = new ArrayDeque<>();

        int rotation = Integer.parseInt(reader.readLine());

        for (String name : names) {
            people.offer(name);
        }

        while (people.size() != 1){
            for (int i = 0; i < rotation - 1 ; i++) {
                String first = people.pop();
                people.offer(first);
            }
            System.out.printf("Removed %s%n",people.pop());
        }
        System.out.printf("Last is %s",people.peek());
    }
}
