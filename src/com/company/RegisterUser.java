package com.company;

import java.util.Scanner;

public class RegisterUser {

    private String name;
    private String password;
    private String eMail;


    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public void registerPage () {
        RegisterUser register = new RegisterUser();
        try  (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your full name: ");
            String name = in.nextLine();
            register.setName(name);

            System.out.println("Enter your email: ");
            String email = in.nextLine();
            register.setEmail(email);

            System.out.println("Enter password: ");
            String password = in.nextLine();
            register.setPassword(password);

        }
    }

}
