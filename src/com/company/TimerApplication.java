package com.company;

import java.util.Scanner;

public class TimerApplication {

    private int userChoice;
    boolean showMenu = true;
    private String enterMainMenu = "Press Y to return to main menu";
    Scanner userInput = new Scanner(System.in);
    CoffeeTimer coffeeTimer = new CoffeeTimer();
    Coffee coffee = new Coffee();

    public void menu() {

        while (showMenu) {
            System.out.println("What do you want to do?");
            System.out.println("1. Login");
            System.out.println("2. Start timer");
            System.out.println("3. Read about coffee");
            System.out.println("4. Add coffee to your list");
            System.out.println("5. Rate coffee");
            System.out.println("6. Share coffee on your social media");
            System.out.println("7. Exit");
            System.out.println("Enter a number: ");
            userChoice = userInput.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("1. Login");
                    enterMainMenu();
                    break;

                case 2:
                    coffeeTimer.setTimer();
                    enterMainMenu();
                    break;

                case 3:
                    coffee.showCoffee();
                    enterMainMenu();
                    break;

                case 4:
                    System.out.println("3. Add your favourite coffee to your list");
                    enterMainMenu();
                    break;

                case 5:
                    System.out.println("4. Rate coffee");
                    enterMainMenu();
                    break;

                case 6:
                    System.out.println("5. Share coffee");
                    enterMainMenu();
                    break;

                case 7:
                    System.exit(0);
            }
        }
    }
    public void enterMainMenu() {
        System.out.println(enterMainMenu);
        String backToMainMenu = userInput.next();
        if (backToMainMenu.equalsIgnoreCase("Y")) {
            showMenu = true;
        }
        else {
            showMenu = false;
        }
    }
}
