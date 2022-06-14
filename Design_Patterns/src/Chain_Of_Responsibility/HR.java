/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chain_Of_Responsibility;

/**
 *
 * @author nilux
 */
public class HR extends LeaveHandler {

   @Override
    public String applyLeave(Leave leave) {
        if(leave.getNumberOfDays() <= 21){
            
            if(leave.getEmpTier() <= 3 && !leave.getReason().equals(ReasonType.CASUAL)){
                return "Your leave days has been APPROVED by HR";
            }else{
                return "Your leave request has been DENIED by HR";
            }
        }else{
            return superVisor.applyLeave(leave);
        }
    }
    
}
