package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    static Scanner sc = new Scanner(System.in);
    UserRegistration userRegistration = new UserRegistration();

    public static void main(String[] args) {
        int option;
        while (true) {
            System.out.println("Enter any : \n1.First Name\n2.Last Name\n3.Email id\n4.Phone number\n5.Password\n0.EXIT ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    UserRegistration.toCheckForFirstNameValidation(sc.next());
                    break;
                case 2:
                    UserRegistration.toCheckForLastNameValidation(sc.next());
                    break;
                case 3:
                    UserRegistration.toCheckForEmailValidation(sc.next());
                    break;
                case 4:
                    UserRegistration.toCheckForPhoneNumberValidation(sc.next());
                    break;
                case 5:
                    UserRegistration.toCheckPasswordValidation(sc.next());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid: Enter valid details.");
            }
        }
    }
}
