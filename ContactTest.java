//Aaron Fehir
//CS 320
//M3 assignment
//July 24, 2021

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contacts.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("abc123", "Bob", "Smith", "0123456789", "123 Pine Rd.");
	    assertTrue(contact.getContactID().equals("abc123"));
	    assertTrue(contact.getFirstName().equals("Bob"));
	    assertTrue(contact.getLastName().equals("Smith"));
		assertTrue(contact.getPhone().equals( "0123456789"));
		assertTrue(contact.getAddress().equals("123 Pine Rd."));
	}
	
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("abc12345678", "Smith", "Bob", "0123456789", "123 Pine Rd.");
		});
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("abc123", "Smithrinstein", "Bob", "0123456789", "123 Pine Rd.");
		});
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("abc123", "Smith", "BobDaBarber", "0123456789", "123 Pine Rd.");
		});
	}
	
	@Test
	void testPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("abc123", "Smith", "BobDaBarber", "01234567890", "123 Pine Rd.");
		});
	
		
	}
	
	@Test
	void testPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
				new Contact("abc123", "Smith", "BobDaBarber", "123456789", "123 Pine Rd.");
		});
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
				new Contact("abc123", "Smith", "BobDaBarber", "0123456789", "123456789 Apartment 123 Pine Road");
		});
	}
	
	
}
