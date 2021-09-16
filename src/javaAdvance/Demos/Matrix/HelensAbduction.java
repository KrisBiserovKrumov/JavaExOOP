package javaAdvance.Demos.Matrix;

import java.util.Scanner;

public class HelensAbduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        int rows = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[rows][];
        int helenRow = 0;
        int helenCol = 0;
        int parisRow = 0;
        int parisCol = 0;
        int cols = 0;
        boolean end = false;

        for (int i = 0; i < rows; i++) {
            field[i] = scanner.nextLine().replaceAll(" ", "").toCharArray();

            cols = field[0].length;

            for (int j = 0; j < cols; j++) {
                if (field[i][j] == 'H') {
                    helenRow = i;
                    helenCol = j;
                } else if (field[i][j] == 'P') {
                    parisRow = i;
                    parisCol = j;
                }
            }
        }

        while (!end) {
            String[] cmd = scanner.nextLine().split(" ");
            String command = cmd[0];
            int enemyRow = Integer.parseInt(cmd[1]);
            int enemyCol = Integer.parseInt(cmd[2]);

            field[enemyRow][enemyCol] = 'S';

            switch (command) {
                case "up":
                    if (energy >= 1) {
                        if (parisRow > 0) {
                            field[parisRow][parisCol] = '-';
                            parisRow--;
                            energy--;

                            end = cheksForHelen(energy, rows, field, field[parisRow], parisCol, cols, end);

                            energy = cheksForEnemy(energy, parisCol, field[parisRow]);
                        } else {
                            energy--;
                        }
                    } else {
                        field[parisRow][parisCol] = 'X';
                        System.out.printf("Paris died at %d;%d.%n", parisRow, parisCol);
                        printField(rows, field, cols);
                        end = true;
                    }
                    break;
                case "down":
                    if (energy >= 1) {
                        if (parisRow < rows - 1) {
                            field[parisRow][parisCol] = '-';
                            parisRow++;
                            energy--;

                            end = cheksForHelen(energy, rows, field, field[parisRow], parisCol, cols, end);

                            energy = cheksForEnemy(energy, parisCol, field[parisRow]);
                        } else {
                            energy--;
                        }
                    } else {
                        field[parisRow][parisCol] = 'X';
                        System.out.printf("Paris died at %d;%d.%n", parisRow, parisCol);
                        printField(rows, field, cols);
                        end = true;
                    }
                    break;
                case "left":
                    if (energy >= 1) {
                        if (parisCol > 0) {
                            field[parisRow][parisCol] = '-';
                            parisCol--;
                            energy--;

                            end = cheksForHelen(energy, rows, field, field[parisRow], parisCol, cols, end);

                            energy = cheksForEnemy(energy, parisCol, field[parisRow]);
                        } else {
                            energy--;
                        }
                    } else {
                        field[parisRow][parisCol] = 'X';
                        System.out.printf("Paris died at %d;%d.%n", parisRow, parisCol);
                        printField(rows, field, cols);
                        end = true;
                    }
                    break;
                case "right":
                    if (energy >= 1) {
                        if (parisCol < cols - 1) {
                            field[parisRow][parisCol] = '-';
                            parisCol++;
                            energy--;
                            //here
                            end = cheksForHelen(energy, rows, field, field[parisRow], parisCol, cols, end);

                            energy = cheksForEnemy(energy, parisCol, field[parisRow]);
                        } else {
                            energy--;
                        }
                    } else {
                        field[parisRow][parisCol] = 'X';
                        System.out.printf("Paris died at %d;%d.%n", parisRow, parisCol);
                        printField(rows, field, cols);
                        end = true;
                    }
                    break;
            }


            if (energy <= 0) {
                field[parisRow][parisCol] = 'X';
                System.out.printf("Paris died at %d;%d.%n", parisRow, parisCol);
                printField(rows, field, cols);
                end = true;
            }



        }



    }

    private static boolean cheksForHelen(int energy, int rows, char[][] field, char[] chars, int parisCol, int cols, boolean end) {
        if (chars[parisCol] == 'H') {
            chars[parisCol] = '-';
            System.out.printf("Paris has successfully abducted Helen! Energy left: %d%n", energy);
            printField(rows, field, cols);
            end = true;
        }
        return end;
    }

    private static void printField(int rows, char[][] field, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    private static int cheksForEnemy(int energy, int parisCol, char[] chars) {
        if (chars[parisCol] == 'S') {
            if (energy > 2) {
                energy -= 2;
                chars[parisCol] = '-';
            }
        }
        return energy;
    }
}
