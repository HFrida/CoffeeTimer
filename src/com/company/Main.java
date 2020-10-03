package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RegisterUser createProfile = new RegisterUser();
        TimerApplication timerApplication = new TimerApplication();
        User user = new User();
        user.login();
        timerApplication.showCoffee();
        createProfile.registerPage();



    }
}
