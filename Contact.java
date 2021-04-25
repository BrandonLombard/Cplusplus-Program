package Test;

//Setting up contact details
public class Contact {
    private String FirstName;
    private String LastName;
    private String ContactAddress;
    private String ContactPhone;
    private String ContactID;
    
    //Getting the constructor ready
    public Contact(String FirstName, String LastName, String ContactPHone,
            String Address, String ContactID, String ContactPhone){
        if(FirstName == null || FirstName.length()>10){
            throw new IllegalArgumentException("Invalid First Nmae");
        }
        if (LastName == null || LastName.length()>10){
            throw new IllegalArgumentException("Invalid Last Name");
        }
        if (ContactAddress == null || ContactAddress.length()>30){
            throw new IllegalArgumentException("Invalid Address, must be"
                    + "less than 30 characters.");
        }
        if (ContactPhone == null || ContactPhone.length()>10 ||
                ContactPhone.length()<10){
            throw new IllegalArgumentException("Invalid Phone Number");
        }
        
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.ContactPhone = ContactPhone;
        this.ContactAddress = Address;       
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getContactAddress(){
        return ContactAddress;
    }
    public String getContactPhone(){
        return ContactPhone;
    }
    public String getContactID(){
        return ContactID;
    }

    void setFirstName(String FirstName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setLastName(String LastName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setContactAddress(String ContactAddress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setContactPhone(String ContactPhone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}