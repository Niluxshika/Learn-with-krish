/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author nilux
 */
public class EmailExecutor implements NotificationExecutor{

     @Override
        public void executeNotification() {
           System.out.println("Email notification sent");
        }
    
}
