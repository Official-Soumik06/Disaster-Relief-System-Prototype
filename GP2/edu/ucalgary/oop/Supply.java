package edu.ucalgary.oop;

public class Supply {
	
// Private Data Members / Attributes Of The Supply Class:
	
private String type;
private int quantity;

// Class Constructor Of The Supply Class:

Supply(String type, int quantity){
	this.type = type; // Initialize The 'type' Supply Class Object's Attribute With The Passed Input Argument/Parameter Value
	this.quantity = quantity; // Initialize The 'quantity' Supply Class Object's Attribute With The Passed Input Argument/Parameter Value
}

// Setter Methods For Setting/Updating The Class Object's Personal Attribute Values:

void setType(String type) { // Updates The 'type' Personal Attribute Value Of The Supply Class Object With the Passed Input Argument/Parameter Value
	this.type = type;
}

void setQuantity(int quantity) { // Updates The 'quantity' Personal Attribute Value Of The Supply Class Object With The Passed Input Argument/Parameter Value
	this.quantity = quantity;
}

// Getter Methods For Retrieving The Class Object's Current Personal Attribute Values:

String getType() { // Retrieves The 'type' Current Personal Attribute Value Of The Supply Class Object
	return this.type;
}

int getQuantity() { // Retrieves The 'quantity' Current Personal Attribute Value Of The Supply Class Object
	return this.quantity;
}
}
