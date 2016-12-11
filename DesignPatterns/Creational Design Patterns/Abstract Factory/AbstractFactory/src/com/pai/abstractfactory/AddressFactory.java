package com.pai.abstractfactory;

/**
 * The AddressFactory interface represents the factory itself
 * @author MPai
 */
public interface AddressFactory 
{
	public Address createAddress();
	public PhoneNumber createPhoneNumber();
}
