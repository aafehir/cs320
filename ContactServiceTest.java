//Aaron Fehir
//CS 320
//M3 assignment
//July 24, 2021


package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contacts.Contact;
import contacts.ContactService;

// The Junit Class helps test the ContactService class and the methods within.

public class ContactServiceTest {

	// Test add method
	@Test
	public void testAdd(){

		ContactService cs = new ContactService();

		Contact contact1 = new Contact("abc1230", "Bob", "Smith", "0123456789", "123 Pine Rd.");

		assertEquals(true, cs.addContact(contact1));

	}

	//Test delete method
	@Test
	public void testDelete(){

		ContactService cs = new ContactService();

		Contact contact1 = new Contact("abc1230", "Bob", "Smith", "0123456789", "123 Pine Rd.");

		Contact contact2 = new Contact("abc1231", "Joe", "Smith", "0123456789", "123 Pine Rd.");

		Contact contact3 = new Contact("abc1232", "Bill", "Smith", "0123456789", "123 Pine Rd.");

		cs.addContact(contact1);

		cs.addContact(contact2);

		cs.addContact(contact3);

		assertEquals(true, cs.deleteContact("abc1231"));

		assertEquals(false, cs.deleteContact("abc123x"));

		assertEquals(false, cs.deleteContact("abc1231"));

	}

	//Test update method
	@Test
	public void testUpdate(){

		ContactService cs = new ContactService();

		Contact contact1 = new Contact("abc1230", "Bob", "Smith", "0123456789", "123 Pine Rd.");

		Contact contact2 = new Contact("abc1231", "Joe", "Smith", "0123456789", "123 Pine Rd.");

		Contact contact3 = new Contact("abc1232", "Bill", "Smith", "0123456789", "123 Pine Rd.");

		cs.addContact(contact1);

		cs.addContact(contact2);

		cs.addContact(contact3);

		assertEquals(true, cs.updateContact("abc1232", "Billmore", "Smithmore", "0123456789", "123 Pine Rd."));

		assertEquals(false, cs.updateContact("abc1233", "Billmore", "Smithmore", "0123456789", "123 Pine Rd."));

	}

}