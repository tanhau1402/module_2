package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        int choice = 0;
        System.out.println("Enter your choice :");
        choice = scanner.nextInt();
        if (choice == 1) {
            int choice1 = 1;
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.println("enter your choice :");
            choice1 = scanner.nextInt();

        }
        else if (choice == 2) {
           int choice2 = 1;
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            System.out.println("enter  your choice : ");
            choice2 = scanner.nextInt();
        }
        else if (choice == 3) {
            int choice3 = 1;
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.println("Enter your choice : ");
            choice3 = scanner.nextInt();
        }
        else if (choice == 4) {
            int choice4 = 1;
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Creat new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.println("Enter your choice : ");
            choice4 = scanner.nextInt();;

        }
        else if (choice == 5) {
            int choice5 = 1;
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            System.out.println("Enter your choice : ");
            choice5 = scanner.nextInt();
        }
        else if (choice == 6) {
            System.exit(6);
        }else {
            System.out.println("No choice !");
        }
    }
}
