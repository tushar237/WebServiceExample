package org.tushar.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tushar.webservices.entity.Country;
import org.tushar.webservices.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    @RequestMapping(value="/getCountries", method=RequestMethod.GET, headers="Accept=application/json")
    public List getCountries() {
        return countryService.getCountries();
    }

    @RequestMapping(value="/getCountries/{id}", method=RequestMethod.GET, headers="Accept=application/json")
    public Country getCountryById(@PathVariable int id) {
        return countryService.getCountryById(id);
    }

    @RequestMapping(value="/addCountry", method=RequestMethod.POST)
    public void addCountry(@RequestBody Country country) {
         countryService.addCountry(country);
    }

    @RequestMapping(value="/updateCountry", method=RequestMethod.PUT)
    public void updateCountry(@RequestBody Country country) {
         countryService.updateCountry(country);
    }

    @RequestMapping(value="/deleteCountry/{id}", method=RequestMethod.DELETE)
    public void deleteCountry(@PathVariable int id) {
         countryService.deleteCountry(id);
    }
}
