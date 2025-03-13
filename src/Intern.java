import java.util.HashMap;

public class Intern extends TeamMember {
    public String requestedField;
    private int internID;
    private HashMap<Long, String> countryOfEachMember = new HashMap<>();

    public Intern(String nameOfInstitute, long nationalID, String  fullName, String email, String country, String faculty, String requestedField, int internID) {
        super(nameOfInstitute, nationalID, fullName, email, country, faculty);
        this.requestedField = requestedField;
        this.internID = internID;
    }
    @Override
    protected void showDetails() {
        System.out.println("Member type: Intern");
        System.out.println("Name of institute: " + super.getNameOfInstitute());
        System.out.println("Name: " + super.getFullName());
        System.out.println("NationalID: " + super.nationalID);
        System.out.println("Email: " + super.getEmail());
        System.out.println("Faculty: " + super.faculty);
        System.out.println("Requested field: " + this.requestedField);
        System.out.println("ID: " + this.internID);
        System.out.println("---------------------");
    }
    public void matchNationalityOfMembers(TeamMember teamMember){
        countryOfEachMember.put(teamMember.nationalID, teamMember.getCountry());
    }

    public void setInternID(int internID) {
        if(internID<0) System.out.println("\n" + "ID must be greater or equal to zero" + "\n");
        else
        this.internID = internID;
    }

    public int getInternID() {
        return internID;
    }
}
