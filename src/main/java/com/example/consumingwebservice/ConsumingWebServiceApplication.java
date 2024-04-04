package com.example.consumingwebservice;

import com.example.consumingwebservice.endpoint.WaterClient;
import com.example.consumingwebservice.wsdl.SDTRefacciones;
import com.example.consumingwebservice.wsdl.WSRefaccionesLISTARREFACCIONESResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ConsumingWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingWebServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner lookup(WaterClient waterClient) {
		return args -> {
			String country = "Spain";

			if (args.length > 0) {
				country = args[0];
			}

			WSRefaccionesLISTARREFACCIONESResponse response = waterClient.getListadoRefacciones();

			System.err.println(response.getListado());

			// CountryExtended countryExtended = new CountryExtended(response.getCountry());
			//System.out.println(countryExtended.toString());
			List listado = response.getListado().getSDTRefacciones();
			for (SDTRefacciones refaccion : (List<SDTRefacciones>) listado) {
				System.out.println(refaccion.getAbonadoTitularNombre());
			}
			// System.out.println(response.getListado().getSDTRefacciones().get(0).getAbonadoTitularNombre());
		};
	}

}
