package AbstractFactor;

import AbstractFactor.GameDev.GameDevTeamFactory;

public class TheGame {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new GameDevTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Developer developer1 = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManeger();

        System.out.println("The Game is being developed");
        developer.writeCode();
        developer1.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
