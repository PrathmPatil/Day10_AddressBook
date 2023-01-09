package cm.adderssbook;import java.util.Scanner;





public class Main {
	
	public static void main(String[] args) {
		int nEntries;
		int nBook=1;
		int option=0;
		AddressBook[]addressBook=new AddressBook[0];
		 while(true)
		 { 
			 if(nBook>0)
			 {
				 addressBook=new AddressBook[nBook];
				 break;
			 }
		 }
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome in address Book");
		System.out.println();
		for(int i=0;i<addressBook.length;i++) {
			 addressBook[i] = new AddressBook();
			 while(true) {
				 System.out.print("How many entries in book ");
		         nEntries = sc.nextInt();
		         if(nEntries>0)
		         {
		        	 addressBook[i].nEntries(nEntries);
		        	 break;
		         }
				 
			 }
		 }

         while(true)
         {
        	 for(int i=0;i<addressBook[0].getEntries();i++) 
        	 {
	    		 System.out.println("***********Entry "+(i+1)+" ***********");
	    		 addressBook[0].contacts[i].readEntry();
	    		 System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
	    	 }
        	 System.out.println("Add data press 1");
        	 option=sc.nextInt();
        	 switch(option)
        	 {
        	 case 1: String fname,lname,address,city,state,zip,phoneNumber,email;
        		 System.out.println("Enter First Name: ");
        			fname=sc.nextLine();
        			System.out.println("Enter Last Name: ");
        			lname=sc.nextLine();
        			System.out.println("Enter Address: ");
        			address=sc.nextLine();
        			System.out.println();
        			System.out.println("Enter city: ");
        			city=sc.nextLine();
        			System.out.println("Enter state: ");
        			state=sc.nextLine();
        			System.out.println("Enter zip code: ");
        			zip=sc.nextLine();
        			System.out.println("Enter Phone Number: ");
        			phoneNumber=sc.nextLine();
        			System.out.println("Enter Email: ");
        			email=sc.nextLine();
        			addressBook[0].add(fname, lname, address, city, state, zip, phoneNumber, email);        			
        	 }
         }
	}

}
