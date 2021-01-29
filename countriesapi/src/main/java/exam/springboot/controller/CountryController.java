package exam.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import exam.springboot.model.Country;
import exam.springboot.service.CountryService;

@RestController
@CrossOrigin
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public List<Country> getCountries() {
		return countryService.getCountries();
	}
	
	@PostMapping("/countries/addnew")
	public void addCountry(@RequestBody Country country) {
		countryService.addCountry(country);
	}
	
	@PutMapping("/countries/{id}/edit")
	public void updateCountry(@PathVariable("id")long id,@RequestBody Country country) {
		countryService.updateCountry(country);
		
	}
	
	@DeleteMapping("/countries/{id}/delete")
	public void deleteCountry(@PathVariable("id")long id) {
		countryService.deleteCountry(id);
	}

}
