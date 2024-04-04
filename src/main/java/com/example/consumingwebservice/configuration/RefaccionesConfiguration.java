package com.example.consumingwebservice.configuration;


import com.example.consumingwebservice.endpoint.RefaccionesClient;
import com.example.consumingwebservice.endpoint.WaterClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class RefaccionesConfiguration {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.example.consumingwebservice.wsdl");
        return marshaller;
    }

    @Bean
    public RefaccionesClient refaccionesClient(Jaxb2Marshaller marshaller) {
        RefaccionesClient client = new RefaccionesClient();
        client.setDefaultUri("https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
