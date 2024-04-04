package com.example.consumingwebservice.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class RefaccionesClient extends  WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(com.example.consumingwebservice.endpoint.WaterClient.class);
    //  http://localhost:8080/ws/countries.wsdl

    // https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx
    //  https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx?wsdl
    public GetRefaccionesResponse getCountry(String country) {

        GetRefaccionesRequest request = new GetRefaccionesRequest();
        request.setName(country);

        log.info("Requesting location for " + country);


        // https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx?
        GetRefaccionesResponse response = (GetRefaccionesResponse)  getWebServiceTemplate()
                .marshalSendAndReceive("https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx", request,
                        new SoapActionCallback(
                                "http://spring.io/guides/gs-producing-web-service/GetCountryRequest"));
        return response;
    }
}
