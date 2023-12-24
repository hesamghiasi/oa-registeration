package core.domain.model;

public class User {

    private String nationalId;
    private String firstName;
    private String lastName;
    private UserType type;


    public void setNationalId(String nationalId) throws Exception {
        if (nationalId.length() < 10)
            throw new Exception();
        this.nationalId = nationalId;
    }

    public boolean validateName() {
        return true;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
