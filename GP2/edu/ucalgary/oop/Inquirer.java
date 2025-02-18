package edu.ucalgary.oop;

public class Inquirer {
	
// Private Data Members / Attributes That Belong To This Inquirer Class:
	
private String FIRST_NAME;
private String LAST_NAME;
private String SERVICES_PHONE;
private String INFO;

// Inquirer Class Constructor:

Inquirer(String firstName, String lastName, String servicesPhoneNum, String info){
	
this.FIRST_NAME = firstName; // Initialize The 'FIRST_NAME' Inquirer Class Object's Attribute With The Passed Input Argument/Parameter Value
this.LAST_NAME = lastName; // Initialize The 'LAST_NAME' Inquirer Class Object's Attribute With The Passed Input Argument/Parameter Value
this.SERVICES_PHONE = servicesPhoneNum; // Initialize The 'SERVICES_PHONE' Inquirer Class Object's Attribute With The Passed Input Argument/Parameter Value
this.INFO = info; // Initialize The 'INFO' Inquirer Class Object's Attribute With The Passed Input Argument/Parameter Value
}

// Getter Methods For Retrieving The Inquirer's Class Object's Personal Attributes:

String getFirstName(){ // Retrieve The Class Object's Personal Attribute 'FIRST_NAME' Current Value
	return this.FIRST_NAME;
}

String getLastName(){ // Retrieve The Class Object's Personal Attribute 'LAST_NAME' Current Value
	return this.LAST_NAME;
}

String getServicesPhoneNum() { // Retrieve The Class Object's Personal Attribute 'SERVICES_PHONE' Current Value
	return this.SERVICES_PHONE;
}

String getInfo(){ // Retrieve The Class Object's Personal Attribute 'INFO' Current Value
	return this.INFO;
}
}
