
package com.example.consumingwebservice.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Listado" type="{ComercialProduccionIntegracion}ArrayOfSDTRefacciones"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listado"
})
@XmlRootElement(name = "WS_Refacciones.LISTARREFACCIONESResponse")
public class WSRefaccionesLISTARREFACCIONESResponse {

    @XmlElement(name = "Listado", required = true)
    protected ArrayOfSDTRefacciones listado;

    /**
     * Gets the value of the listado property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSDTRefacciones }
     *     
     */
    public ArrayOfSDTRefacciones getListado() {
        return listado;
    }

    /**
     * Sets the value of the listado property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSDTRefacciones }
     *     
     */
    public void setListado(ArrayOfSDTRefacciones value) {
        this.listado = value;
    }

}
