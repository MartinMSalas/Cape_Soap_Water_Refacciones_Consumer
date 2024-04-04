package com.example.consumingwebservice.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.consumingwebservice.wsdl.GetCountryRequest;
import com.example.consumingwebservice.wsdl.GetCountryResponse;


public class WaterClient extends WebServiceGatewaySupport{
    private static final Logger log = LoggerFactory.getLogger(WaterClient.class);
    //  http://localhost:8080/ws/countries.wsdl

    // https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx
    //  https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx?wsdl
    public GetCountryResponse getCountry(String country) {

        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);

        log.info("Requesting location for " + country);


        // https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx?
        GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate()
                .marshalSendAndReceive("https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx", request,
                        new SoapActionCallback(
                                "http://spring.io/guides/gs-producing-web-service/GetCountryRequest"));
        return response;
    }
}

