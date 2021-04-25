package Test;
import java.util.ArrayList;
        
public class ContactService {
    private ArrayList<Contact> contacts;
    
    public ContactService(){
        contacts = new ArrayList<>();
    }
    //Add Contact if it does not exist.
    public boolean add(Contact contact){
        boolean Exist = false;
        for (Contact x: contacts){
            if (x.equals(contact)){
                Exist = true;
            }
        }
        
        if (!Exist){
            contacts.add(contact);
            System.out.println("New Contact has been added.");
            return true;
        }
        else {
            System.out.println("Contact already exist.");
            return false;
        }
    }
    //Removes Contact
    public boolean remove(String ContactID){
        for (Contact x : contacts)
        if (x.getContactID().equals(ContactID)){
            contacts.remove(x);
            System.out.println("Your contact has succssfully been removed");
            return true;
        }
            System.out.println("Contact Doesn't Exist");
            return false;
    }
    //Updates Contact
    public boolean update(String FirstName, String LastName, String ContactID,
            String ContactAddress, String ContactPhone){
        for (Contact x : contacts) {
            if (x.getContactID().equals(ContactID)){
                if (!FirstName.equals(""))
                    x.setFirstName(FirstName);
                if (!LastName.equals(""))
                    x.setLastName(LastName);
                if (!ContactAddress.equals(""))
                    x.setContactAddress(ContactAddress);
                if (!ContactPhone.equals(""))
                    x.setContactPhone(ContactPhone);
                System.out.println("Contact has been updated.");
                return true;
            }
        }
        System.out.println("Contact isn't present.");
        return false;
    }
	public com.moo.api.addressbookapi.model.Contact addContact(
			com.moo.api.addressbookapi.model.Contact createNewContact) {
		// TODO Auto-generated method stub
		return null;
	}
	public void retrieveContact(long l) {
		// TODO Auto-generated method stub
		
	}
}