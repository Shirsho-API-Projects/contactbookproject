package com.shirsho.contactbookproject.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.shirsho.contactbookproject.model.Contact;
import com.shirsho.contactbookproject.services.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	
	Map<Long,Contact> contacts= new HashMap<>();
	
	
	long currentSequenceNumber=1;
	
	public ContactServiceImpl() {
		init();
	}
	
	void init() {
		
		Contact contact=new Contact();
		contact.setContactSequenceNumber(currentSequenceNumber);
		contact.setContactName("John Doe");
		contact.setCompanyName("ABC Corporation");
		contact.setContactAddress("123 Main Street");
		contact.setContactCity("Chicago");
		contact.setContactState("IL");
		contact.setContactEmail("john.doe@abc.com");
		contact.setContactProfileImage("johndoe.jpg");
		contact.setBirthDate("1980-03-25");
		contact.setHomePhone("312-100-1000");
		contact.setWorkPhone("312-200-2000");
		contacts.put(contact.getContactSequenceNumber(), contact);
		
		
		
		
		
	}

	@Override
	public List<Contact> getContacts() {
		Collection<Contact> results = contacts.values();
		List<Contact> response = new ArrayList<>(results);
		return response;
	}

	
	@Override
	public Contact getContact(long contactSequenceNumber) {
		
		return contacts.get(contactSequenceNumber);
	} 
	
	

	@Override
	public Response createContact(Contact contact) {
		contact.setContactSequenceNumber(++currentSequenceNumber);
		contacts.put(contact.getContactSequenceNumber(), contact);
		
		return Response.ok(contact).build();
		
	}

	@Override
	public Response updateContact(Contact contact) {
		Contact currentContact = contacts.get(contact.getContactSequenceNumber());
		
		Response response;
		if(currentContact!=null) {
			contacts.put(contact.getContactSequenceNumber(),contact);
			response=Response.ok().build();
		}
		else {
			response=Response.notModified().build();
		}
		return response;
	}

	
	@Override
	public Response deleteContact(long contactSequenceNumber) {
		Contact contact = contacts.get(contactSequenceNumber);
		
		Response response;
		
		if(contact!=null) {
			contacts.remove(contactSequenceNumber);
			response=Response.ok().build();
		}
		else {
			response=Response.notModified().build();
		}
		return response;
	}

	@Override
	public List<Contact> getContactFromPhone(String homePhone) {
		int currentSequence=0;
		
		Contact response=null;
		Collection<Contact> results = contacts.values();
		List<Contact> resultArray = new ArrayList<>(results);
		List<Contact>responseArray=new ArrayList<Contact>();
		
		
		while(currentSequence<resultArray.size()||response==null) {
			String currentPhone=(resultArray.get(currentSequence)).getHomePhone();
			if(currentPhone.equals(homePhone)) {
				response=resultArray.get(currentSequence);
				responseArray.add(response);
			}
			currentSequence++;
			
		}
		
		return responseArray;
	}

	@Override
	public List<Contact> getContactFromCity(String city) {
		int currentSequence=0;
		
		Contact response=null;
		Collection<Contact> results = contacts.values();
		List<Contact> resultArray = new ArrayList<>(results);
		List<Contact>responseArray=new ArrayList<Contact>();
		
		
		while(currentSequence<resultArray.size()||response==null) {
			String currentCity=(resultArray.get(currentSequence)).getContactCity();
			if(currentCity.equals(city)) {
				response=resultArray.get(currentSequence);
				responseArray.add(response);
			}
			currentSequence++;
			
		}
		
		return responseArray;
	}


	}
