public abstract class TeamMember {
    private String nameOfInstitute;
    public long nationalID;
    private String fullName ;
    private String email ;
    private String country;
    protected String faculty;

    protected TeamMember(String nameOfInstitute, long nationalID, String fullName, String email, String country, String faculty) {
        this.nameOfInstitute = nameOfInstitute;
        this.nationalID = nationalID;
        this.fullName = fullName ;
        this.email = email;
        this.country = country;
        this.faculty = faculty;
    }
    protected abstract void showDetails();
}
