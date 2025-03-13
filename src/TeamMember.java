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

    public void setNationalID(long nationalID) {
        if (nationalID < 0 || String.valueOf(nationalID).length() < 6) {
            System.out.println("Wrong NationalID");
        } else {
            this.nationalID = nationalID;
        }
    }

       public void setEmail(String email) {
           if (email.indexOf('@') == -1) {
               System.out.println("Wrong Email");
           } else {
               this.email = email;
           }
       }

       public void setNameOfInstitute(String nameOfInstitute){
        if(nameOfInstitute.charAt(0)<='Z' || nameOfInstitute.charAt(0)>='A')
        {
            this.nameOfInstitute = nameOfInstitute;
        }
        else {
            System.out.println("First letter must be capital");
        }
       }

    public void setCountry(String country){
        if(country.charAt(0)<='Z' || country.charAt(0)>='A')
        {
            this.country = country;
        }
        else {
            System.out.println("First letter must be capital");
        }
    }

    public void setFaculty(String faculty){
        if(faculty.charAt(0)<='Z' && faculty.charAt(0)>='A')
        {
            this.faculty = faculty;
        }
        else {
            System.out.println("First letter must be capital");
        }
    }

    public void setFullName (String fullName){
        String[] arr = fullName.split(" ");
        if(arr[0].charAt(0)>='A' && arr[0].charAt(0)<='Z' && arr[1].charAt(0)>='A' && arr[1].charAt(0)<='Z'){
            this.fullName= arr[1] + arr[0];
        }
        else{
            System.out.println("First letters must be capital");
        }
    }

}
