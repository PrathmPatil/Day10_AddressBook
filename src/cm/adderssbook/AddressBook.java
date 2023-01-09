package cm.adderssbook;

public class AddressBook {
 Contacts []contacts;
 static int entry=0;
 
 public void nEntries(int entries)
 {  
	 contacts=new Contacts[entries];
	 for(int i=0;i<contacts.length;i++)
	 {
		 contacts[i]=new Contacts();
	 }
 }
 public int getEntries()
 {
	 return contacts.length;
 }
 public void add(String fname, String lname, String address, String city, String state, String zip, String phoneNumber,
		String email)
 {
	 if(entry<contacts.length)
	 {
		 contacts[entry]=new Contacts(fname,lname,address,city,state,zip,phoneNumber,email);
		 entry++;
	 }
 }
}
