package com.example.consumingwebservice.entity;

import com.example.consumingwebservice.wsdl.Country;
import com.example.consumingwebservice.wsdl.Currency;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;

public class CountryExtended extends Country {
//    @XmlElement(required = true)
//    protected String name;
//    protected int population;
//    @XmlElement(required = true)
//    protected String capital;
//    @XmlElement(required = true)
//    @XmlSchemaType(name = "string")
//    protected Currency currency;

    public CountryExtended(Country country) {
        this.name = country.getName();
        this.population = country.getPopulation();
        this.capital = country.getCapital();
        this.currency = country.getCurrency();
    }
    @Override
    public String toString() {
        return "CountryExtended {" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                ", currency=" + currency +
                '}';
    }
}
