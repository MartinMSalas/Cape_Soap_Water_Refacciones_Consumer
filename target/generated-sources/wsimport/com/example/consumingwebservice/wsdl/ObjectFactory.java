
package com.example.consumingwebservice.wsdl;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.consumingwebservice.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.consumingwebservice.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WSRefaccionesLISTARREFACCIONES }
     * 
     */
    public WSRefaccionesLISTARREFACCIONES createWSRefaccionesLISTARREFACCIONES() {
        return new WSRefaccionesLISTARREFACCIONES();
    }

    /**
     * Create an instance of {@link WSRefaccionesLISTARREFACCIONESResponse }
     * 
     */
    public WSRefaccionesLISTARREFACCIONESResponse createWSRefaccionesLISTARREFACCIONESResponse() {
        return new WSRefaccionesLISTARREFACCIONESResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSDTRefacciones }
     * 
     */
    public ArrayOfSDTRefacciones createArrayOfSDTRefacciones() {
        return new ArrayOfSDTRefacciones();
    }

    /**
     * Create an instance of {@link SDTRefacciones }
     * 
     */
    public SDTRefacciones createSDTRefacciones() {
        return new SDTRefacciones();
    }

}
