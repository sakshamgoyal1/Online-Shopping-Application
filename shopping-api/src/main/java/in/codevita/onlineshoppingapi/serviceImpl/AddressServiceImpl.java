package in.codevita.onlineshoppingapi.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codevita.onlineshoppingapi.domain.Address;
import in.codevita.onlineshoppingapi.repository.AddressRepository;
import in.codevita.onlineshoppingapi.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public Address saveorUpdate(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public Address findAddressById(Long addressId) {
		Address address=addressRepository.findByAddressId(addressId);
		return address;
	}

	@Override
	public Iterable<Address> finaAllAddress() {
		return addressRepository.findAll();
	}

	@Override
	public void deleteAddressByAddressId(Long addressId) {
		Address address=addressRepository.findByAddressId(addressId);
           addressRepository.delete(address);	
	}

}
