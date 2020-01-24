package AbstractFactor;

import AbstractFactor.AndroidGame.AndroidGameTeamFactory;

public class AndroidGames {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new AndroidGameTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManeger();

        System.out.println("Creating android game...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
