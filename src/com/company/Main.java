package com.company;

import java.util.Scanner;

public class Main {
    static int balance = 1234;

    public static int withdraw(int amnt) {

        if ((balance -= amnt) < 0) {
            balance += amnt;
            return 1;
        }
        return 0;
    }
    public static void deposit(int amnt) {
        balance += amnt;
    }
    public static void main(String[] args) {
        int action, withdrawAmnt, depositAmnt;
        Scanner sc = new Scanner(System.in);
        int exit = 1;
        while (exit == 1) {
            System.out.println("Bank Account, current balance: " + balance + "\n What do you wish to do?\n 1. Withdraw 2. Deposit 3. Exit");
            action = sc.nextInt();
            switch (action) {
                case 1:
                    withdrawAmnt = sc.nextInt(); // amount to withdraw
                    if (withdraw(withdrawAmnt) != 0) {
                        System.out.println("Transaction could not be completed. Current Balance: " + balance);
                    }
                    System.out.println("Current Balance:" + balance);
                    break;
                case 2:
                    depositAmnt = sc.nextInt();
                    deposit(depositAmnt);
                    break;
                case 3:
                    exit = 0;
                    break;
            }
        }
        sc.close();

    }
}
