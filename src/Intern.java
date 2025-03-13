import java.util.HashMap;

public class Intern extends TeamMember {
    public String requestedField;
    protected int internID;
    public HashMap<Long, String> countryOfEachMember = new HashMap<>();

    private Intern(String nameOfInstitute, long nationalID, String  fullName, String email, String country, String faculty, String requestedField, int internID) {
        super(nameOfInstitute, nationalID, fullName, email, country, faculty);
        this.requestedField = requestedField;
        this.internID = internID;
    }
    @Override
    private void showDetails() {
        System.out.println("Member type: Intern");
        System.out.println("Name of institute: " + super.nameOfInstitute);
        System.out.println("Name: " + super.fullName);
        System.out.println("NationalID: " + super.nationalID);
        System.out.println("Email: " + super.email);
        System.out.println("Faculty: " + super.faculty);
        System.out.println("Requested field: " + this.requestedField);
        System.out.println("ID: " + this.internID);
        System.out.println("---------------------");
    }
    public void matchNationalityOfMembers(TeamMember teamMember){
        countryOfEachMember.put(teamMember.nationalID, teamMember.country);
    }
}
