//Aaron Fehir
//CS 320
//M3 assignment
//July 24, 2021


package contacts;

import java.util.ArrayList;

public class ContactService {

	//List of contacts
	private ArrayList<Contact> contacts;

	//Default constructor
	public ContactService() {

	contacts = new ArrayList<>();
	
	}

	//Add contact to list if not already present
	public boolean addContact(Contact contact) {

		boolean isPresent= false;

		for (Contact contactList:contacts) {

			if (contactList.equals(contact)) {

				isPresent = true;

			}

		}


		if (!isPresent) {
			
			contacts.add(contact);

			return true;
		}

		else {
			
			return false;
		
		}

	}

	//Delete contact with the contactId specified
	public boolean deleteContact(String contactID) {

		for (Contact contactList:contacts) {

			if (contactList.getContactID().equals(contactID)) {

				contacts.remove(contactList);

				return true;

			}

		}

		return false;

	}

	//Update contact with the contactId specified. 
	public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {

		for (Contact contactList:contacts) {

			if (contactList.getContactID().equals(contactID)) {

				if(!firstName.equals("") && !(firstName.length()>10)) {

					contactList.setFirstName(firstName);

				}

				if(!lastName.equals("") && !(lastName.length()>10)) {

					contactList.setFirstName(lastName);

				}

				if(!phoneNumber.equals("") && (phoneNumber.length()==10)) {

					contactList.setFirstName(phoneNumber);

				}

				if(!address.equals("") && !(address.length()>30)) {

					contactList.setFirstName(address);

				}

				return true;

			}

		}

		return false;

	}

}