package enums;

/**
 * Created by aivashchenko on 2/11/2019.
 */
public enum ProjectName {
    PARTER_SELECT("Partner Select"),
    LEGAL_X("Legal x"),
    LEX("Lex"),
    PAYMODE("Paymode");

    private String projectName;

    ProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }
}
