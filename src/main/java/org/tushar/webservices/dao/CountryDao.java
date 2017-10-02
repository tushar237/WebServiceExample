package org.tushar.webservices.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tushar.webservices.soap.Entity.Country;

@Repository
public class CountryDao {

    @Autowired
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("rawtypes")
    public List getCountries() {
        Session session = this.sessionFactory.getCurrentSession();
        List countries = session.createQuery("from Country").list();
        return countries;
    }

    public Country getCountryById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Country country = (Country)session.get(Country.class, new Integer(id));
        return country;
    }

    public void addCountry(Country country) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(country);
    }

    public void updateCountry(Country country) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(country);
    }

    public void deleteCountry(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Country country = (Country)session.get(Country.class, new Integer(id));
        if(null != country) {
            session.delete(country);
        }
    }

}
