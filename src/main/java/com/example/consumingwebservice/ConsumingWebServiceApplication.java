package com.example.consumingwebservice;

import com.example.consumingwebservice.endpoint.CountryClient;
import com.example.consumingwebservice.entity.CountryExtended;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.consumingwebservice.wsdl.GetCountryResponse;
@SpringBootApplication
public class ConsumingWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingWebServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner lookup(CountryClient countryClient) {
		return args -> {
			String country = "Spain";

			if (args.length > 0) {
				country = args[0];
			}
			GetCountryResponse response = countryClient.getCountry(country);

			System.err.println(response.getCountry().getCurrency());

			CountryExtended countryExtended = new CountryExtended(response.getCountry());
			System.out.println(countryExtended.toString());
		};
	}

}
