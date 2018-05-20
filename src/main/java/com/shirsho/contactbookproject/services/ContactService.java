package com.shirsho.contactbookproject.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.shirsho.contactbookproject.model.Contact;

@Consumes("application/xml, application/json")
@Produces("application/xml, application/json")
@Path("/contactbookservice")
public interface ContactService {
	
	//Get a list of all the contacts
	@Path("/contacts")
	@GET
	List<Contact> getContacts();
	
	
	//Get a contact of a particular sequence number in the contact book
	@Path("/contacts/seqno/{seqno}")
	@GET
	Contact getContact(@PathParam(value="seqno") long contactSequenceNumber);
	
	
	//Retrieve contacts by searching with phone number
	@Path("/contacts/phoneno")
	@POST
	List<Contact> getContactFromPhone(String homePhone);
	
	@Path("/contacts/city")
	@POST
	List<Contact> getContactFromCity(String city);
	
		
	
	//Create a new contact (details in request body)
	@Path("/contacts")
	@POST
	Response createContact(Contact contact);
	
	//Update an existing contact (details in request body)
	@Path("/contacts")
	@PUT
	Response updateContact(Contact contact);
	
	//Delete a contact of a particular sequence number in the contact book
	
	@Path("/contacts/seqno/{seqno}")
	@DELETE
	Response deleteContact(@PathParam(value="seqno")long contactSequenceNumber);
	

}
