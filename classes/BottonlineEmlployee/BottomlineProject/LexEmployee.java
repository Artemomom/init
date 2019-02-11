package classes.BottonlineEmlployee.BottomlineProject;

import classes.BottonlineEmlployee.BottomlineEmployee;
import enums.*;

/**
 * Created by aivashchenko on 2/11/2019.
 */
public class LexEmployee extends BottomlineEmployee {
    private String scramTeam;
    private ProjectName projectName;

    public LexEmployee() {
    }

    public LexEmployee(String name,
                       EmployeeEngineeringGrade engineeringGrade,
                       EmployeeEngineeringRole engineeringRole,
                       EmployeeLocation employeeLocation,
                       String scramTeam,
                       ProjectName projectName) {
        super(name, engineeringGrade, engineeringRole, employeeLocation);
        this.scramTeam = scramTeam;
        this.projectName = projectName;
    }

    public String getScramTeam() {
        return scramTeam;
    }

    public void setScramTeam(String scramTeam) {
        this.scramTeam = scramTeam;
    }

    public ProjectName getProjectName() {
        return projectName;
    }

    public void setProjectName(ProjectName projectName) {
        this.projectName = projectName;
    }
}
