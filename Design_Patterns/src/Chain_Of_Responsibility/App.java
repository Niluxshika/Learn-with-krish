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
public class App {
    public static void main (String[] args){
        TeamLeader teamLeader = new TeamLeader();
        ProjectLeader projectLeader = new ProjectLeader();
        HR hr = new HR();
        Manager manager = new Manager();

        teamLeader.setSuperVisor(projectLeader);
        projectLeader.setSuperVisor(hr);
        hr.setSuperVisor(manager);

        Leave leave1 = new Leave(5,4, ReasonType.ANNUAL);
        System.out.println(teamLeader.applyLeave(leave1));

        Leave leave2 = new Leave(5,5, ReasonType.ANNUAL);
        System.out.println(teamLeader.applyLeave(leave2));

        Leave leave3 = new Leave(12,3, ReasonType.ANNUAL);
        System.out.println(teamLeader.applyLeave(leave3));

        Leave leave4 = new Leave(18,2, ReasonType.MEDICAL);
        System.out.println(teamLeader.applyLeave(leave4));

        Leave leave5 = new Leave(18,2, ReasonType.ANNUAL);
        System.out.println(teamLeader.applyLeave(leave5));

        Leave leave6 = new Leave(30,2, ReasonType.CASUAL);
        System.out.println(teamLeader.applyLeave(leave6));
    }
}
