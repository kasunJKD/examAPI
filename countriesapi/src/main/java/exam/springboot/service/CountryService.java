package exam.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exam.springboot.model.Country;
import exam.springboot.repository.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
	public void addCountry(Country country) {
		countryRepository.save(country);
		
	}
	
	public void updateCountry(Country country) {
		countryRepository.save(country);
		
	}
	
	public void deleteCountry(long id) {
		countryRepository.deleteById(id);
		
	}

}
