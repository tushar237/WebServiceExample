package org.tushar.webservices.soap.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY")
public class Country implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 4223239281154984868L;

    @Id
    @Column(name = "id")
    int id;

    @Column(name = "countryName")
    String countryName;

    @Column(name = "population")
    long population;

    public Country() {
        super();
    }

    public Country(int i, String countryName, long population) {
        super();
        this.id = i;
        this.countryName = countryName;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country [id=" + id + ", countryName=" + countryName + ", population=" + population + "]";
    }
}