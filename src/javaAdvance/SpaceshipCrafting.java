package javaAdvance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SpaceshipCrafting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> liquid = new ArrayDeque<>();
        ArrayDeque<Integer> physical = new ArrayDeque<>();

        int[] firstArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int liq : firstArr) {
            liquid.offer(liq);
        }
        for (int phys : secondArr) {
            physical.push(phys);
        }
        int glass = 25;
        int aluminium = 50;
        int lithium = 75;
        int carbonFiber = 100;
        List<String> countAluminium = new ArrayList<>();
        List<String> countGlass = new ArrayList<>();
        List<String> countLithium = new ArrayList<>();
        List<String> countCarbonFiber = new ArrayList<>();

        while (!liquid.isEmpty() && !physical.isEmpty()) {
            int currentLiquid = liquid.peek();
            int currentPhysical = physical.peek();


            if (currentLiquid + currentPhysical == glass) {
                countGlass.add("Glass");
                liquid.poll();
                physical.pop();
            } else if (currentLiquid + currentPhysical == aluminium) {
                countAluminium.add("Aluminium");
                liquid.poll();
                physical.pop();
            } else if (currentLiquid + currentPhysical == lithium) {
                countLithium.add("Lithium");
                liquid.poll();
                physical.pop();
            } else if (currentLiquid + currentPhysical == carbonFiber) {
                countCarbonFiber.add("Carbon");
                liquid.poll();
                physical.pop();
            } else {
                liquid.poll();
                int physicalDeleted = physical.pop() + 3;
                physical.push(physicalDeleted);
            }


        }
        if (countGlass.size() > 0 && countAluminium.size() > 0
                && countCarbonFiber.size() > 0 && countLithium.size() > 0) {
            System.out.println("Wohoo! You succeeded in building the spaceship!");
        }else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to build the spaceship.");
        }
        if (liquid.isEmpty()) {
            System.out.println("Liquids left: none");
        } else {
            System.out.print("Liquids left: ");
            for (Integer liqui : liquid) {
                if (liqui.equals(liquid.getLast())) {
                    System.out.println(liqui);
                    }else {
                        System.out.print(liqui + ", ");
                    }
                }
            }


            if (physical.isEmpty()) {
                System.out.println("Physical items left: none");
            } else {
                System.out.print("Physical items left: ");
                for (Integer physi : physical) {
                    if (physi.equals(physical.getLast())) {
                        System.out.println(physi);
                    } else {
                        System.out.print(physi + ", ");
                    }
                }
            }
            System.out.printf("Aluminium: %d%n" +
                    "Carbon fiber: %d%n" +
                    "Glass: %d%n" +
                    "Lithium: %d", countAluminium.size(), countCarbonFiber.size(), countGlass.size(), countLithium.size());
        }

}
