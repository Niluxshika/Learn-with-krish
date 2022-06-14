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
public class Leave {
    private int numberOfDays;
    private int empTier;
    private ReasonType reason;

    public Leave(int numberOfDays, int empTier, ReasonType reason) {
        this.numberOfDays = numberOfDays;
        this.empTier = empTier;
        this.reason = reason;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getEmpTier() {
        return empTier;
    }

    public ReasonType getReason() {
        return reason;
    }

   
    
}