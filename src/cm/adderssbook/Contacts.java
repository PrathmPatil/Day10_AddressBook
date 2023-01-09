package cm.adderssbook;

public class Contacts {
 private String fname,lname,address,city,state,zip,phoneNumber,email;

public Contacts(String fname, String lname, String address, String city, String state, String zip, String phoneNumber,
		String email) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.address = address;
	this.city = city;
	this.state = state;
	this.zip = zip;
	this.phoneNumber = phoneNumber;
	this.email = email;
}
Contacts()
{
	fname=" ";
	lname=" ";
	address=" ";
	city=" ";
	state=" ";
	zip=" ";
	phoneNumber=" ";
	email=" ";
}
public void readEntry()
{
	System.out.println("First name: "+fname);
	System.out.println("Last name: "+lname);
	System.out.println("Address: "+address);
	System.out.println("City: "+city);
	System.out.println("State: "+state);
	System.out.println("Zip: "+zip);
	System.out.println("phoneNumber: "+phoneNumber);
	System.out.println("Email: "+email);
}
 
}
