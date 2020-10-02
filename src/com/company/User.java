package com.company;

import java.util.Scanner;

public class User {

    private String username = "user1";
    private String password = "password1";
    RegisterUser registerUser;


    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username here: ");
        username = scan.nextLine();

        System.out.println("Enter your password here: ");
        password = scan.nextLine();
        verifyUser();

    }

    public void verifyUser() {
        if ("user1".equals(username) && "password1".equals(password)) {
            System.out.println("You are logged in");
        } else {
            System.out.println("Your username or password is invalid");
        }
    }
}
