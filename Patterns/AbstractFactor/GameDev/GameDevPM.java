package AbstractFactor.GameDev;

import AbstractFactor.ProjectManager;
import AbstractFactor.ProjectTeamFactory;

public class GameDevPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("GameDevPM manages gamedev project ...");
    }
}
