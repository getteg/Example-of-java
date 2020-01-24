package AbstractFactor.ComputerGame;

import AbstractFactor.Developer;
import AbstractFactor.ProjectManager;
import AbstractFactor.ProjectTeamFactory;
import AbstractFactor.Tester;

public class ComputerGameTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ComputerGameTester();
    }

    @Override
    public ProjectManager getProjectManeger() {
        return new ComputerGamePM();
    }
}
