package com.example.consumingwebservice.endpoint;

import com.example.consumingwebservice.wsdl.ArrayOfSDTRefacciones;
import com.example.consumingwebservice.wsdl.WSRefaccionesLISTARREFACCIONES;
import com.example.consumingwebservice.wsdl.WSRefaccionesLISTARREFACCIONESResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;



public class WaterClient extends WebServiceGatewaySupport{
    private static final Logger log = LoggerFactory.getLogger(WaterClient.class);
    //  http://localhost:8080/ws/countries.wsdl

    // https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx
    //  https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx?wsdl
    public WSRefaccionesLISTARREFACCIONESResponse getListadoRefacciones() {
/*
        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);
*/
        WSRefaccionesLISTARREFACCIONES request = new WSRefaccionesLISTARREFACCIONES();
        log.info("Requesting listar refacciones ");


        // WSRefaccionesLISTARREFACCIONESResponse
        WSRefaccionesLISTARREFACCIONESResponse response= (WSRefaccionesLISTARREFACCIONESResponse) getWebServiceTemplate()
                .marshalSendAndReceive("https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx", request,
                        new SoapActionCallback(
                                "http://spring.io/guides/gs-producing-web-service/GetCountryRequest"));

        //ArrayOfSDTRefacciones getListado()
        // https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx?
        /*
        GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate()
                .marshalSendAndReceive("https://adcsapem.com.ar:8080/ComercialProduccion/aws_refacciones.aspx", request,
                        new SoapActionCallback(
                                "http://spring.io/guides/gs-producing-web-service/GetCountryRequest"));

         */
        return response;
    }
}

