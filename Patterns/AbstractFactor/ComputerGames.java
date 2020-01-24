package AbstractFactor;

import AbstractFactor.ComputerGame.ComputerGamePM;
import AbstractFactor.ComputerGame.ComputerGameTeamFactory;

public class ComputerGames {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new ComputerGameTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManeger();

        System.out.println("Creating computer game...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();


    }
}
