package com.company;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CoffeeTimer {

    private String soonCoffee = "Your coffee is almost ready!";
    private String reminder = "Don't forget your coffee. Your timer will soon shut of";
    private String done = "The timer is off";
    Scanner userInput = new Scanner(System.in);

    int seconds1 = 0;
    int seconds2 = 0;
    int seconds3 = 0;
    int seconds4 = 0;

    public void setTimer() {

        //Let user choose one option
        System.out.println("1. 15 minutes");
        System.out.println("2. 30 minutes");
        System.out.println("3. 45 minutes");
        System.out.println("4. 60 minutes");
        System.out.println("How many minutes do you want to set your timer to? \nChoose an option: ");
        int timerMinutes = userInput.nextInt();
        Timer timer = new Timer();

        switch (timerMinutes) {
            //Execute a different run() depending on users choice
            case 1:
                TimerTask task1 = new TimerTask() {
                    @Override
                    public void run() {
                        //Let seconds increase and print out the seconds so the user can see the time
                        seconds1++;
                        System.out.println(seconds1);
                        if (seconds1 == 3) {
                            System.out.println(soonCoffee);
                        } else if (seconds1 == 12) {
                            System.out.println(reminder);
                        } else if (seconds1 == 15) {
                            System.out.println(done);
                            timer.cancel();
                        }
                    }
                };
                //Schedule timer, delay it 1 second before it starts and let it rest 1 second between task executions
                timer.schedule(task1, 1000, 1000);
                break;

            case 2:
                TimerTask task2 = new TimerTask() {
                    public void run() {
                        seconds2++;
                        System.out.println(seconds2);
                        if (seconds2 == 3) {
                            System.out.println(soonCoffee);
                        } else if (seconds2 == 27) {
                            System.out.println(reminder);
                        } else if (seconds2 == 30) {
                            System.out.println(done);
                            timer.cancel();
                        }
                    }
                };
                timer.schedule(task2, 1000, 1000);
                break;

            case 3:
                TimerTask task3 = new TimerTask() {
                    public void run() {
                        seconds3++;
                        System.out.println(seconds3);
                        if (seconds3 == 3) {
                            System.out.println(soonCoffee);
                        } else if (seconds3 == 42) {
                            System.out.println(reminder);
                        } else if (seconds3 == 45) {
                            System.out.println(done);
                            timer.cancel();
                        }
                    }
                };

                timer.schedule(task3, 1000, 1000);
                break;

            case 4:
                TimerTask task4 = new TimerTask() {
                    public void run() {
                        seconds4++;
                        System.out.println(seconds4);
                        if (seconds4 == 3) {
                            System.out.println(soonCoffee);
                        } else if (seconds4 == 57) {
                            System.out.println(reminder);
                        } else if (seconds4 == 60) {
                            System.out.println(done);
                            timer.cancel();
                        }
                    }
                };
                timer.schedule(task4, 1000, 1000);
                break;
        }
    }
}