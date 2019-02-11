package classes;

import enums.EmployeeEngineeringGrade;
import enums.EmployeeEngineeringRole;

/**
 * Created by aivashchenko on 2/11/2019.
 */
public  abstract class GloballogicEmployee {
    private String name;
    private EmployeeEngineeringGrade engineeringGrade;
    private EmployeeEngineeringRole engineeringRole;

    public GloballogicEmployee(){}

    public GloballogicEmployee(String name, EmployeeEngineeringGrade engineeringGrade, EmployeeEngineeringRole engineeringRole) {
        this.name = name;
        this.engineeringGrade = engineeringGrade;
        this.engineeringRole = engineeringRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeEngineeringGrade getEngineeringGrade() {
        return engineeringGrade;
    }

    public void setEngineeringGrade(EmployeeEngineeringGrade engineeringGrade) {
        this.engineeringGrade = engineeringGrade;
    }

    public EmployeeEngineeringRole getEngineeringRole() {
        return engineeringRole;
    }

    public void setEngineeringRole(EmployeeEngineeringRole engineeringRole) {
        this.engineeringRole = engineeringRole;
    }
}
