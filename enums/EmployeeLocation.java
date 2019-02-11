package enums;

/**
 * Created by aivashchenko on 2/11/2019.
 */
public enum EmployeeLocation {
    KIEV("Lead"),
    KHARKOV("Kharkov"),
    KRAKOW("Krakow"),
    PORSMOUTH("Portsmouth");



    private String grade;

    EmployeeLocation(String role) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}


