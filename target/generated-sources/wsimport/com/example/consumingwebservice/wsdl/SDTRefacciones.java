
package com.example.consumingwebservice.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SDTRefacciones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDTRefacciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RefaccionesId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RefaccionesFechaRegistro" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RefaccionesFechaInicio" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RefaccionesHoraInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="RefaccionesFechaFin" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RefaccionesHoraFin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReclamoCuadrillaId" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="RefaccionesObservacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReclamoOrdTrabId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RefaccionesInstanciaReclamo" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="RefaccionesItemUltimoId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RefaccionesItemTipoExcavacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RefaccionesItemTipoTerreno" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="RefaccionesItemAncho" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RefaccionesItemLargo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RefaccionesItemMetros2" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RefaccionesItemTipoRoturaCert" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="RefaccionesItemAnchoCert" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RefaccionesItemLargoCert" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RefaccionesItemMetros2Cert" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="AbonadoId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AbonadoDireccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AbonadoReclamoBarrioDescriptor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="abonadopoblacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AbonadoTitularNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AbonadoUsuarioNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AbonadoLatitud" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="AbonadoLongitud" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Instancia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDTRefacciones", propOrder = {
    "refaccionesId",
    "refaccionesFechaRegistro",
    "refaccionesFechaInicio",
    "refaccionesHoraInicio",
    "refaccionesFechaFin",
    "refaccionesHoraFin",
    "reclamoCuadrillaId",
    "refaccionesObservacion",
    "reclamoOrdTrabId",
    "refaccionesInstanciaReclamo",
    "refaccionesItemUltimoId",
    "refaccionesItemTipoExcavacion",
    "refaccionesItemTipoTerreno",
    "refaccionesItemAncho",
    "refaccionesItemLargo",
    "refaccionesItemMetros2",
    "refaccionesItemTipoRoturaCert",
    "refaccionesItemAnchoCert",
    "refaccionesItemLargoCert",
    "refaccionesItemMetros2Cert",
    "abonadoId",
    "abonadoDireccion",
    "abonadoReclamoBarrioDescriptor",
    "abonadopoblacion",
    "abonadoTitularNombre",
    "abonadoUsuarioNombre",
    "abonadoLatitud",
    "abonadoLongitud",
    "instancia"
})
public class SDTRefacciones {

    @XmlElement(name = "RefaccionesId")
    protected int refaccionesId;
    @XmlElement(name = "RefaccionesFechaRegistro", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refaccionesFechaRegistro;
    @XmlElement(name = "RefaccionesFechaInicio", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refaccionesFechaInicio;
    @XmlElement(name = "RefaccionesHoraInicio", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refaccionesHoraInicio;
    @XmlElement(name = "RefaccionesFechaFin", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refaccionesFechaFin;
    @XmlElement(name = "RefaccionesHoraFin", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refaccionesHoraFin;
    @XmlElement(name = "ReclamoCuadrillaId")
    protected short reclamoCuadrillaId;
    @XmlElement(name = "RefaccionesObservacion", required = true)
    protected String refaccionesObservacion;
    @XmlElement(name = "ReclamoOrdTrabId")
    protected int reclamoOrdTrabId;
    @XmlElement(name = "RefaccionesInstanciaReclamo")
    protected byte refaccionesInstanciaReclamo;
    @XmlElement(name = "RefaccionesItemUltimoId")
    protected int refaccionesItemUltimoId;
    @XmlElement(name = "RefaccionesItemTipoExcavacion", required = true)
    protected String refaccionesItemTipoExcavacion;
    @XmlElement(name = "RefaccionesItemTipoTerreno")
    protected byte refaccionesItemTipoTerreno;
    @XmlElement(name = "RefaccionesItemAncho")
    protected double refaccionesItemAncho;
    @XmlElement(name = "RefaccionesItemLargo")
    protected double refaccionesItemLargo;
    @XmlElement(name = "RefaccionesItemMetros2")
    protected double refaccionesItemMetros2;
    @XmlElement(name = "RefaccionesItemTipoRoturaCert")
    protected byte refaccionesItemTipoRoturaCert;
    @XmlElement(name = "RefaccionesItemAnchoCert")
    protected double refaccionesItemAnchoCert;
    @XmlElement(name = "RefaccionesItemLargoCert")
    protected double refaccionesItemLargoCert;
    @XmlElement(name = "RefaccionesItemMetros2Cert")
    protected double refaccionesItemMetros2Cert;
    @XmlElement(name = "AbonadoId")
    protected int abonadoId;
    @XmlElement(name = "AbonadoDireccion", required = true)
    protected String abonadoDireccion;
    @XmlElement(name = "AbonadoReclamoBarrioDescriptor", required = true)
    protected String abonadoReclamoBarrioDescriptor;
    @XmlElement(required = true)
    protected String abonadopoblacion;
    @XmlElement(name = "AbonadoTitularNombre", required = true)
    protected String abonadoTitularNombre;
    @XmlElement(name = "AbonadoUsuarioNombre", required = true)
    protected String abonadoUsuarioNombre;
    @XmlElement(name = "AbonadoLatitud")
    protected double abonadoLatitud;
    @XmlElement(name = "AbonadoLongitud")
    protected double abonadoLongitud;
    @XmlElement(name = "Instancia", required = true)
    protected String instancia;

    /**
     * Gets the value of the refaccionesId property.
     * 
     */
    public int getRefaccionesId() {
        return refaccionesId;
    }

    /**
     * Sets the value of the refaccionesId property.
     * 
     */
    public void setRefaccionesId(int value) {
        this.refaccionesId = value;
    }

    /**
     * Gets the value of the refaccionesFechaRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefaccionesFechaRegistro() {
        return refaccionesFechaRegistro;
    }

    /**
     * Sets the value of the refaccionesFechaRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefaccionesFechaRegistro(XMLGregorianCalendar value) {
        this.refaccionesFechaRegistro = value;
    }

    /**
     * Gets the value of the refaccionesFechaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefaccionesFechaInicio() {
        return refaccionesFechaInicio;
    }

    /**
     * Sets the value of the refaccionesFechaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefaccionesFechaInicio(XMLGregorianCalendar value) {
        this.refaccionesFechaInicio = value;
    }

    /**
     * Gets the value of the refaccionesHoraInicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefaccionesHoraInicio() {
        return refaccionesHoraInicio;
    }

    /**
     * Sets the value of the refaccionesHoraInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefaccionesHoraInicio(XMLGregorianCalendar value) {
        this.refaccionesHoraInicio = value;
    }

    /**
     * Gets the value of the refaccionesFechaFin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefaccionesFechaFin() {
        return refaccionesFechaFin;
    }

    /**
     * Sets the value of the refaccionesFechaFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefaccionesFechaFin(XMLGregorianCalendar value) {
        this.refaccionesFechaFin = value;
    }

    /**
     * Gets the value of the refaccionesHoraFin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefaccionesHoraFin() {
        return refaccionesHoraFin;
    }

    /**
     * Sets the value of the refaccionesHoraFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefaccionesHoraFin(XMLGregorianCalendar value) {
        this.refaccionesHoraFin = value;
    }

    /**
     * Gets the value of the reclamoCuadrillaId property.
     * 
     */
    public short getReclamoCuadrillaId() {
        return reclamoCuadrillaId;
    }

    /**
     * Sets the value of the reclamoCuadrillaId property.
     * 
     */
    public void setReclamoCuadrillaId(short value) {
        this.reclamoCuadrillaId = value;
    }

    /**
     * Gets the value of the refaccionesObservacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefaccionesObservacion() {
        return refaccionesObservacion;
    }

    /**
     * Sets the value of the refaccionesObservacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefaccionesObservacion(String value) {
        this.refaccionesObservacion = value;
    }

    /**
     * Gets the value of the reclamoOrdTrabId property.
     * 
     */
    public int getReclamoOrdTrabId() {
        return reclamoOrdTrabId;
    }

    /**
     * Sets the value of the reclamoOrdTrabId property.
     * 
     */
    public void setReclamoOrdTrabId(int value) {
        this.reclamoOrdTrabId = value;
    }

    /**
     * Gets the value of the refaccionesInstanciaReclamo property.
     * 
     */
    public byte getRefaccionesInstanciaReclamo() {
        return refaccionesInstanciaReclamo;
    }

    /**
     * Sets the value of the refaccionesInstanciaReclamo property.
     * 
     */
    public void setRefaccionesInstanciaReclamo(byte value) {
        this.refaccionesInstanciaReclamo = value;
    }

    /**
     * Gets the value of the refaccionesItemUltimoId property.
     * 
     */
    public int getRefaccionesItemUltimoId() {
        return refaccionesItemUltimoId;
    }

    /**
     * Sets the value of the refaccionesItemUltimoId property.
     * 
     */
    public void setRefaccionesItemUltimoId(int value) {
        this.refaccionesItemUltimoId = value;
    }

    /**
     * Gets the value of the refaccionesItemTipoExcavacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefaccionesItemTipoExcavacion() {
        return refaccionesItemTipoExcavacion;
    }

    /**
     * Sets the value of the refaccionesItemTipoExcavacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefaccionesItemTipoExcavacion(String value) {
        this.refaccionesItemTipoExcavacion = value;
    }

    /**
     * Gets the value of the refaccionesItemTipoTerreno property.
     * 
     */
    public byte getRefaccionesItemTipoTerreno() {
        return refaccionesItemTipoTerreno;
    }

    /**
     * Sets the value of the refaccionesItemTipoTerreno property.
     * 
     */
    public void setRefaccionesItemTipoTerreno(byte value) {
        this.refaccionesItemTipoTerreno = value;
    }

    /**
     * Gets the value of the refaccionesItemAncho property.
     * 
     */
    public double getRefaccionesItemAncho() {
        return refaccionesItemAncho;
    }

    /**
     * Sets the value of the refaccionesItemAncho property.
     * 
     */
    public void setRefaccionesItemAncho(double value) {
        this.refaccionesItemAncho = value;
    }

    /**
     * Gets the value of the refaccionesItemLargo property.
     * 
     */
    public double getRefaccionesItemLargo() {
        return refaccionesItemLargo;
    }

    /**
     * Sets the value of the refaccionesItemLargo property.
     * 
     */
    public void setRefaccionesItemLargo(double value) {
        this.refaccionesItemLargo = value;
    }

    /**
     * Gets the value of the refaccionesItemMetros2 property.
     * 
     */
    public double getRefaccionesItemMetros2() {
        return refaccionesItemMetros2;
    }

    /**
     * Sets the value of the refaccionesItemMetros2 property.
     * 
     */
    public void setRefaccionesItemMetros2(double value) {
        this.refaccionesItemMetros2 = value;
    }

    /**
     * Gets the value of the refaccionesItemTipoRoturaCert property.
     * 
     */
    public byte getRefaccionesItemTipoRoturaCert() {
        return refaccionesItemTipoRoturaCert;
    }

    /**
     * Sets the value of the refaccionesItemTipoRoturaCert property.
     * 
     */
    public void setRefaccionesItemTipoRoturaCert(byte value) {
        this.refaccionesItemTipoRoturaCert = value;
    }

    /**
     * Gets the value of the refaccionesItemAnchoCert property.
     * 
     */
    public double getRefaccionesItemAnchoCert() {
        return refaccionesItemAnchoCert;
    }

    /**
     * Sets the value of the refaccionesItemAnchoCert property.
     * 
     */
    public void setRefaccionesItemAnchoCert(double value) {
        this.refaccionesItemAnchoCert = value;
    }

    /**
     * Gets the value of the refaccionesItemLargoCert property.
     * 
     */
    public double getRefaccionesItemLargoCert() {
        return refaccionesItemLargoCert;
    }

    /**
     * Sets the value of the refaccionesItemLargoCert property.
     * 
     */
    public void setRefaccionesItemLargoCert(double value) {
        this.refaccionesItemLargoCert = value;
    }

    /**
     * Gets the value of the refaccionesItemMetros2Cert property.
     * 
     */
    public double getRefaccionesItemMetros2Cert() {
        return refaccionesItemMetros2Cert;
    }

    /**
     * Sets the value of the refaccionesItemMetros2Cert property.
     * 
     */
    public void setRefaccionesItemMetros2Cert(double value) {
        this.refaccionesItemMetros2Cert = value;
    }

    /**
     * Gets the value of the abonadoId property.
     * 
     */
    public int getAbonadoId() {
        return abonadoId;
    }

    /**
     * Sets the value of the abonadoId property.
     * 
     */
    public void setAbonadoId(int value) {
        this.abonadoId = value;
    }

    /**
     * Gets the value of the abonadoDireccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbonadoDireccion() {
        return abonadoDireccion;
    }

    /**
     * Sets the value of the abonadoDireccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbonadoDireccion(String value) {
        this.abonadoDireccion = value;
    }

    /**
     * Gets the value of the abonadoReclamoBarrioDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbonadoReclamoBarrioDescriptor() {
        return abonadoReclamoBarrioDescriptor;
    }

    /**
     * Sets the value of the abonadoReclamoBarrioDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbonadoReclamoBarrioDescriptor(String value) {
        this.abonadoReclamoBarrioDescriptor = value;
    }

    /**
     * Gets the value of the abonadopoblacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbonadopoblacion() {
        return abonadopoblacion;
    }

    /**
     * Sets the value of the abonadopoblacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbonadopoblacion(String value) {
        this.abonadopoblacion = value;
    }

    /**
     * Gets the value of the abonadoTitularNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbonadoTitularNombre() {
        return abonadoTitularNombre;
    }

    /**
     * Sets the value of the abonadoTitularNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbonadoTitularNombre(String value) {
        this.abonadoTitularNombre = value;
    }

    /**
     * Gets the value of the abonadoUsuarioNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbonadoUsuarioNombre() {
        return abonadoUsuarioNombre;
    }

    /**
     * Sets the value of the abonadoUsuarioNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbonadoUsuarioNombre(String value) {
        this.abonadoUsuarioNombre = value;
    }

    /**
     * Gets the value of the abonadoLatitud property.
     * 
     */
    public double getAbonadoLatitud() {
        return abonadoLatitud;
    }

    /**
     * Sets the value of the abonadoLatitud property.
     * 
     */
    public void setAbonadoLatitud(double value) {
        this.abonadoLatitud = value;
    }

    /**
     * Gets the value of the abonadoLongitud property.
     * 
     */
    public double getAbonadoLongitud() {
        return abonadoLongitud;
    }

    /**
     * Sets the value of the abonadoLongitud property.
     * 
     */
    public void setAbonadoLongitud(double value) {
        this.abonadoLongitud = value;
    }

    /**
     * Gets the value of the instancia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstancia() {
        return instancia;
    }

    /**
     * Sets the value of the instancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstancia(String value) {
        this.instancia = value;
    }

}
