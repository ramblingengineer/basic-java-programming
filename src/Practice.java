/*
 * Copyright (c) 2024. Rein Martha - The Rambling Engineer.
 * All rights reserved.
 */


import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input number: ");
    int number = scanner.nextInt();
    // Print kotak

    for (int i = 0; i < number; i++) {
        for (int j = 0; j < number; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}