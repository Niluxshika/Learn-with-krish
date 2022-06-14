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
public class ExecutorFactory {
    public static NotificationExecutor getNotificationExecutor(String executorType) {
       if(executorType.equals("EMAIL"))
         return new EmailExecutor();
       if(executorType.equals("SMS"))
         return new SMSExecutor();
       return null;
     } 
}
