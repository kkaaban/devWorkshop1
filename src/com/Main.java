package com;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Розробник: Крутов Д. В.");
        System.out.println("Введіть розмірність матриці: ");
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        if (n<1) main(args);
        short[][] matrix = new short[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                matrix[i][j] = (short) random.nextInt(100);
            }
        }
        System.out.println("Створена матриця розмірності "+n);
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
        }
        System.out.println("\nВведіть номер стовпця (від 1 до "+n+"), щоб упорядкувати \nрядки матриці " +
                "за спаданням значень цього стовпця:");
        byte k = scanner.nextByte();
        if (k<0 || k>n) main(args);
        Arrays.sort(matrix, new Comparator<short[]>() {
            @Override
            public int compare(final short[] entry1, final short[] entry2) {
                if (entry1[k-1] < entry2[k-1]) return 1;
                else return -1;
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
        }
    }
}
