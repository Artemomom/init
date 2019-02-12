import classes.BottonlineEmlployee.BottomlineEmployee;
import classes.BottonlineEmlployee.BottomlineProject.*;
import classes.GloballogicEmployee;
import enums.EmployeeEngineeringRole;

import java.util.*;

/**
 * Created by aivashchenko on 2/8/2019.
 */
public class BusinessLogicClass {
    private EmployeeService employeeService;

    public BusinessLogicClass(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Map<BottomlineEmployee, String> getDevelopersOnLSM(GloballogicEmployee... employees) {
        Map<BottomlineEmployee, String> lsmDeveloper = new HashMap<>();
        String employeeDescription = "Employee name is: %s Grade: %s Project Name: %s Scram Team: %s";
        for (BottomlineEmployee employee : employeeService.getListOfBottomlieneEmployee(employees)) {
            if (employee instanceof PaymodeEmploee) {
                System.out.println("Employee is on a Paymode project");

            }
            else if (employee.getEngineeringRole().equals(EmployeeEngineeringRole.DEVELOOER)) {
                if (employee instanceof PartnerSelectEmploee) {
                    lsmDeveloper.put(employee,
                            String.format(employeeDescription,
                                    employee.getName(),
                                    employee.getEngineeringGrade().getGrade(),
                                    ((PartnerSelectEmploee) employee).getProjectName().getProjectName(),
                                    ((PartnerSelectEmploee) employee).getScramTeam()));
                }
                if (employee instanceof LegalxEmploee) {
                    lsmDeveloper.put(employee,
                            String.format(employeeDescription,
                                    employee.getName(),
                                    employee.getEngineeringGrade().getGrade(),
                                    ((LegalxEmploee) employee).getProjectName().getProjectName(),
                                    ((LegalxEmploee) employee).getScramTeam()));
                }
                if (employee instanceof LexEmployee) {
                    lsmDeveloper.put(employee,
                            String.format(employeeDescription,
                                    employee.getName(),
                                    employee.getEngineeringGrade().getGrade(),
                                    ((LexEmployee) employee).getProjectName().getProjectName(),
                                    ((LexEmployee) employee).getScramTeam()));
                }
            }
        }

        return lsmDeveloper;
    }


    public String getEmployeeProjectNameAndTeam(GloballogicEmployee...globallogicEmployee){
        List<BottomlineEmployee> employees = employeeService.getListOfBottomlieneEmployee(globallogicEmployee);
        String projectnameAndteam = null;
        for (BottomlineEmployee employee:employees){
            if(employee instanceof PartnerSelectEmploee){
                projectnameAndteam= ((PartnerSelectEmploee) employee).getProjectName() + " "+ ((PartnerSelectEmploee) employee).getScramTeam();
            }
            if(employee instanceof PaymodeEmploee){
                projectnameAndteam= ((PaymodeEmploee) employee).getProjectName() + " "+ ((PaymodeEmploee) employee).getScramTeam();
            }
            if(employee instanceof LegalxEmploee){
                projectnameAndteam= ((LegalxEmploee) employee).getProjectName() + " "+ ((LegalxEmploee) employee).getScramTeam();
            }
            if(employee instanceof LexEmployee){
                projectnameAndteam= ((LexEmployee) employee).getProjectName() + " "+ ((LexEmployee) employee).getScramTeam();
            }
        }
return projectnameAndteam;
    }

}