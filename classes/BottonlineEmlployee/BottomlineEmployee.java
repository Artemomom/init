package classes.BottonlineEmlployee;

import classes.GloballogicEmployee;
import enums.*;

/**
 * Created by aivashchenko on 2/11/2019.
 */
public class BottomlineEmployee extends GloballogicEmployee {
    private EmployeeLocation employeeLocation;

    public BottomlineEmployee() {
    }

    public BottomlineEmployee(String name,
                              EmployeeEngineeringGrade engineeringGrade,
                              EmployeeEngineeringRole engineeringRole,
                              EmployeeLocation employeeLocation) {
        super(name, engineeringGrade, engineeringRole);
        this.employeeLocation = employeeLocation;
    }

    public EmployeeLocation getEmployeeLocation() {
        return employeeLocation;
    }

    public void setEmployeeLocation(EmployeeLocation employeeLocation) {
        this.employeeLocation = employeeLocation;
    }
}
