/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.util.Scanner;

/**
 *
 * @author nilux
 */
public class NotificationSender {
     public static void main(String[] args) {
         
         System.out.println("Please select the Notification Channels \n"
                 + "1. SMS \n"
                 + "2. Email");
         Scanner scanner = new Scanner(System.in);
         String option = scanner.nextLine();
       
 ExecutorFactory.getNotificationExecutor(option.toUpperCase()).executeNotification();
 
 
     }
}
