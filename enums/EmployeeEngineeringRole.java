package enums;

/**
 * Created by aivashchenko on 2/11/2019.
 */
public enum EmployeeEngineeringRole {
    DEVELOOER("Developer"),
    QA("Qa engineer"),
    BA("Business Analytic"),
    PO("Product Owner"),
    PM("Project Manager");



    private String role;

    EmployeeEngineeringRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}


