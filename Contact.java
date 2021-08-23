//Aaron Fehir
//CS 320
//M3 assignment
//July 24, 2021


package contacts;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;

	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		if (contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid contactID");
		}
		
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		
		if (phone == null || phone.length()<10 || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		
		if (address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	
	// Getter ContactID
	public String getContactID() {
		return contactID;
	}
	
	// Setter ContactID
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	
	// Getter firstName
	public String getFirstName() {
		return firstName;
	}
	
	// Setter firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// Getter lastName
	public String getLastName() {
		return lastName;
	}
	
	// Setter lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Getter PhoneNumber
		public String getPhone() {
		return phone;
	}
	
	// Setter PhoneNumber
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// Getter Address
	public String getAddress() {
		return address;
	}
	
	// Setter Address
	public void setAddress(String address) {
		this.address = address;
	}
}
