package javaAdvance.Demos.Stack;

import java.util.*;

public class TrojanInvasion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean end = false;

        ArrayDeque<Integer> plates = new ArrayDeque<>();
        String[] pl = scanner.nextLine().split(" ");
        for (String p : pl) {
            plates.offer(Integer.parseInt(p));
        }

        ArrayDeque<Integer> warriors = new ArrayDeque<>();

        if (n % 3 == 0) {
            n++;
        } else if (n % 3 == 2) {
            n++;
        }

        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i != 0) {
                int b = Integer.parseInt(scanner.nextLine());
                warriors.offer(b);
            } else {
                String[] line = scanner.nextLine().split(" ");
                int f = Integer.parseInt(line[0]);
                int s = Integer.parseInt(line[1]);
                int t = Integer.parseInt(line[2]);
                warriors.offer(t);
                warriors.offer(s);
                warriors.offer(f);
            }
        }

        while (!end) {
            if (plates.isEmpty()) {
                System.out.println("The Spartans successfully repulsed the Trojan attack.");
                System.out.print("Plates left: ");
                for (Integer plate : warriors) {
                    System.out.printf("%d", plate);
                }
                return;
            } else if (warriors.isEmpty()) {
                System.out.println("The Trojans successfully destroyed the Spartan defense.");
                System.out.print("Warriors left: ");
                for (Integer plate : plates) {
                    System.out.printf("%d", plate);
                }
                return;
            }

            int platesHealth = plates.peek();
            int warriorHealth = warriors.peek();

            while (!(platesHealth <= 0) || !(warriorHealth <=0)) {
                if (platesHealth > warriorHealth) {
                    int curr = warriorHealth;
                    warriorHealth -= platesHealth;
                    platesHealth -= curr;
                    plates.poll();
                    plates.offerFirst(platesHealth);
                    if (warriorHealth <= 0) {
                        break;
                    }
                } else if (warriorHealth > platesHealth) {
                    int curr = platesHealth;
                    platesHealth -= warriorHealth;
                    warriorHealth -= curr;
                    warriors.poll();
                    warriors.offerFirst(warriorHealth);
                    if (platesHealth <= 0) {
                        break;
                    } else {
                        plates.poll();
                        plates.offer(platesHealth);
                    }
                } else {
                    warriorHealth = 0;
                    platesHealth = 0;
                }
            }

            if (platesHealth <= 0 && warriorHealth <= 0) {
                plates.poll();
                warriors.poll();
            } else if (warriorHealth <= 0) {
                warriors.pop();
            } else if (platesHealth <= 0) {
                plates.poll();
            }
        }

    }
}
