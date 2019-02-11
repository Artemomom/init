package enums;

/**
 * Created by aivashchenko on 2/11/2019.
 */
public enum EmployeeEngineeringGrade {
    LEAD("Lead"),
    SENIOR("Senior"),
    MIDDLE("Middle"),
    JUNIOR("Junior"),
    TRAINEE("Trainee"),
    ASSOCIATE("Associate");



    private String grade;

    EmployeeEngineeringGrade(String role) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}


