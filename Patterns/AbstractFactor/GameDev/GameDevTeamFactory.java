package AbstractFactor.GameDev;

import AbstractFactor.Developer;
import AbstractFactor.ProjectManager;
import AbstractFactor.ProjectTeamFactory;
import AbstractFactor.Tester;

public class GameDevTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new AndroidDeveloper();
    }

    @Override
    public Tester getTester() {
        return new GameTester();
    }

    @Override
    public ProjectManager getProjectManeger() {
        return new GameDevPM();
    }
}
