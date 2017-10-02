package org.tushar.webservices.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tushar.webservices.dao.CountryDao;
import org.tushar.webservices.soap.Entity.Country;

@Service("countryService")
public class CountryService {

    @Autowired
    CountryDao countryDao;

    @Transactional
    public void setCountryDao(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    @Transactional
    public List getCountries() {
        return countryDao.getCountries();
    }

    @Transactional
    public Country getCountryById(int id) {
        return countryDao.getCountryById(id);
    }

    @Transactional
    public void addCountry(Country country) {
        countryDao.addCountry(country);
    }

    @Transactional
    public void updateCountry(Country country) {
        countryDao.updateCountry(country);
    }

    @Transactional
    public void deleteCountry(int id) {
        countryDao.deleteCountry(id);
    }
}
