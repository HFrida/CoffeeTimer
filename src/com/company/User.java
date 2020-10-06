package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

    RegisterUser register = new RegisterUser();
    private String loginUsername;
    private String loginPassword;
    protected static ArrayList<Coffee> favourites = new ArrayList<>();

    public User() {

    }

    public User(String loginUsername, String loginPassword) {
        this.loginUsername = loginUsername;
        this.loginPassword = loginPassword;
    }

    public void login() {
        boolean loginCheck = true;
        while (loginCheck) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your username here: ");
            loginUsername = scan.nextLine();

            System.out.println("Enter your password here: ");
            loginPassword = scan.nextLine();

            if (loginUsername.equalsIgnoreCase(register.getUsername()) && loginPassword.equalsIgnoreCase(register.getPassword())) {
                System.out.println("You are logged in");
                loginCheck = false;
            } else {
                System.out.println("Your username or password is incorrect, please try again");
            }

        }
    }

    public void addFavourite() {
        Coffee coffee = new Coffee();
        System.out.println("Enter the number of coffee you want to store: ");
        Scanner scan = new Scanner(System.in);
        int chooseCoffee = scan.nextInt();

        switch (chooseCoffee) {

            case 1:
                favourites.add(0, coffee.getProduct1());
                break;

            case 2:
                favourites.add(1, coffee.getProduct2());
                break;

            case 3:
                favourites.add(2, coffee.getProduct3());
                break;

            case 4:
                favourites.add(3, coffee.getProduct4());
                break;
        }
    }

    public void showFavourites() {
        StringBuilder builder = new StringBuilder();
        for (Coffee favourite : favourites) {
            builder.append(favourite);
        }
        String userList = builder.toString();
        System.out.println(userList);
    }
}
