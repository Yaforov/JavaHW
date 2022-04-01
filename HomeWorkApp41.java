/**
 * Java. Lesson 1. Homework 4
 * @author Yaforov Roman
 * @version Date: 01.04.2022 г.
 */

import java.util.Random;
import java.util.Scanner;

class HomeWorkApp41 {
    Random random;
    Scanner scanner;
    char[][] table;

    public static void main(String[] args) {
        new HomeWorkApp41().game();
    }

    HomeWorkApp41() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }

    void game() {
        initTable();
        while (true) {
            printTable();
            turnHuman();
            if (checkWin('x')) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();
            if (checkWin('o')) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER!");
        printTable();
    }

    void initTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                table[x][y] = '.';
            }
        }
    }

    void printTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y {1 .. 3}:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellVaid(x, y));
        table[x][y] = 'x';
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellVaid(x, y));
        table[x][y] = 'o';
    }

    boolean isCellVaid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == '.';
    }

    boolean checkWin(char ch) {
        //if (table[0][0] == ch && table[0][0] == ch && table[0][2] == ch) return true;
        //if (table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
        //if (table[2][0] == ch && table[2][2] == ch && table[2][2] == ch) return true;

        //if (table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
        //if (table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
        //if (table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) return true;
        int counter = 0;
        for (int i = 0; i < 3; i++) {  //Линия
            for (int j = 0; j < 3; j++) {
                if(table[i][j] == ch) {
                    counter++;

                }
            }
            if(counter==3){
                return true;
            }
            else {
                counter = 0;
            }
        }
        counter = 0;
        for (int i = 0; i < 3; i++) {  //столбец
            for (int j = 0; j < 3; j++) {
                if (table[j][i] == ch) {
                    counter++;
                }
            }
            if(counter==3){
                return true;
            }
            else {
                counter = 0;
            }
        }
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        return false;
    }

    boolean isTableFull() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (table[x][y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}
