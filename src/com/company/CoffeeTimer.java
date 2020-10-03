package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class CoffeeTimer {

        int secondsPassed = 0;
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask() {
            public void run() {
                secondsPassed++;
                System.out.println(secondsPassed);
                if (secondsPassed == 3) {
                    System.out.println("Your coffee is almost ready!");
                } else if (secondsPassed == 12) {
                    System.out.println("Don't forget your coffee. Your timer will soon shut of");
                }
                else if (secondsPassed == 15) {
                    timer.cancel();
                }
            }
        };

        public void startTimer() {
            timer.schedule(task, 1000, 1000);
        }


}
