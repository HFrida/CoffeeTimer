package com.company;

import java.util.Scanner;

public class RegisterUser {

    private String name;
    private String username;
    private String password;
    private String eMail;
    Scanner in = new Scanner(System.in);

    public RegisterUser() {

    }

    public RegisterUser(String name, String username, String password, String eMail) {
        this.username = username;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
    public String promptUsername() {
        return username = in.nextLine();
    }
    public String promptPassword() {
        return password = in.nextLine();
    }

    public void registerPage() {
        RegisterUser register = new RegisterUser();
        System.out.println("Enter your full name: ");
        name = in.nextLine();
        register.setName(name);

        System.out.println("Enter your email: ");
        eMail = in.nextLine();
        register.setEmail(eMail);

        System.out.println("Enter username: ");
        promptUsername();
        register.setUsername(username);

        System.out.println("Enter password: ");
        promptPassword();
        register.setPassword(password);
    }

}
