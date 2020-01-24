package AbstractFactor.AndroidGame;

import AbstractFactor.Developer;
import AbstractFactor.ProjectManager;
import AbstractFactor.ProjectTeamFactory;
import AbstractFactor.Tester;

public class AndroidGameTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new AndroidDeveloper();
    }

    @Override
    public Tester getTester() {
        return new AndroidGameTester();
    }

    @Override
    public ProjectManager getProjectManeger() {
        return new AndroidGamePM();
    }
}
