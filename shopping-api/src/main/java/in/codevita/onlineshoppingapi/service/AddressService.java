package in.codevita.onlineshoppingapi.service;

import in.codevita.onlineshoppingapi.domain.Address;
import in.codevita.onlineshoppingapi.domain.Customer;

public interface AddressService {

	public Address saveorUpdate(Address address);
	
	public Address findAddressById(Long addressId);
	
	public Iterable<Address> finaAllAddress();
	
	public void deleteAddressByAddressId(Long addressId);
}
