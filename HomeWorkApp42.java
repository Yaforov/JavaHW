/**
 * Java. Lesson 1. Homework 4
 * @author Yaforov Roman
 * @version Date: 01.04.2022 г.
 */

import java.util.Random;
import java.util.Scanner;

class HomeWorkApp42 {
    Random random;
    Scanner scanner;
    char[][] table;
    int win;
    int l;

    public static void main(String[] args) {
        new HomeWorkApp42().game();
    }

    HomeWorkApp42() {
        random = new Random();
        scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the length of the field [1 ..]: ");
            l = scanner.nextInt();
        } while (l < 1);
        table = new char[l][l];
        do {
            System.out.println("Enter the number of hours for WIN: ");
            win = scanner.nextInt();
        } while (win > l);
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
        for (int y = 0; y < l; y++) {
            for (int x = 0; x < l; x++) {
                table[x][y] = '.';
            }
        }
    }

    void printTable() {
        for (int i = 0; i <= l; i++) { // Заполнение шапки координат
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < l; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < l; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellVaid(x, y));
        table[x][y] = 'x';
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(l);
            y = random.nextInt(l);
        } while (!isCellVaid(x, y));
        table[x][y] = 'o';
    }

    boolean isCellVaid(int x, int y) {
        if (x < 0 || y < 0 || x > l  || y > l) {
            return false;
        }
        return table[x][y] == '.';
    }

    boolean checkWin(char ch) {
        int counter = 0;
        for (int i = 0; i < l; i++) {  //Линия
            for (int j = 0; j < l; j++) {
                if(table[i][j] == ch) {
                    counter++;
                }
            }
            if(counter==win){
                return true;
            }
            else {
                counter = 0;
            }
        }
        counter = 0;
        for (int i = 0; i < l; i++) {  //столбец
            for (int j = 0; j < l; j++) {
                if (table[j][i] == ch) {
                    counter++;
                }
            }
            if(counter==win){
                return true;
            }
            else {
                counter = 0;
            }
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (l - 1 - i == j && table[i][j] == ch) {
                    counter++;
                }
            }

        }
        if(counter == win){
            return true;
        }
        else {
            counter = 0;
        }


        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (i == j && table[i][j] == ch) {
                    counter++;
                }
            }
        }
        if(counter==win){
            return true;
        }
        else {
            counter = 0;
        }
        return false;
    }

    boolean isTableFull() {
        for (int y = 0; y < l; y++) {
            for (int x = 0; x < l; x++) {
                if (table[x][y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}
