
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para pendienteEstadisticaRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pendienteEstadisticaRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ent_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ent_path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidad" type="{http://service.reunion.bsc.penoles/}entidadRow" minOccurs="0"/>
 *         &lt;element name="fecha_fin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fecha_inicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pen_clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_estatus" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="pen_tip_pendiente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_tipo" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="reu_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reunion" type="{http://service.reunion.bsc.penoles/}reunionRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pendienteEstadisticaRow", propOrder = {
    "entId",
    "entPath",
    "entidad",
    "fechaFin",
    "fechaInicio",
    "penClave",
    "penEstatus",
    "penTipPendiente",
    "penTipo",
    "reuId",
    "reunion"
})
public class PendienteEstadisticaRow {

    @XmlElement(name = "ent_id")
    protected Integer entId;
    @XmlElement(name = "ent_path")
    protected String entPath;
    protected EntidadRow entidad;
    @XmlElement(name = "fecha_fin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFin;
    @XmlElement(name = "fecha_inicio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicio;
    @XmlElement(name = "pen_clave")
    protected String penClave;
    @XmlElement(name = "pen_estatus")
    protected MultivaluadaRow penEstatus;
    @XmlElement(name = "pen_tip_pendiente")
    protected String penTipPendiente;
    @XmlElement(name = "pen_tipo")
    protected MultivaluadaRow penTipo;
    @XmlElement(name = "reu_id")
    protected Integer reuId;
    protected ReunionRow reunion;

    /**
     * Obtiene el valor de la propiedad entId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntId() {
        return entId;
    }

    /**
     * Define el valor de la propiedad entId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntId(Integer value) {
        this.entId = value;
    }

    /**
     * Obtiene el valor de la propiedad entPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntPath() {
        return entPath;
    }

    /**
     * Define el valor de la propiedad entPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntPath(String value) {
        this.entPath = value;
    }

    /**
     * Obtiene el valor de la propiedad entidad.
     * 
     * @return
     *     possible object is
     *     {@link EntidadRow }
     *     
     */
    public EntidadRow getEntidad() {
        return entidad;
    }

    /**
     * Define el valor de la propiedad entidad.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadRow }
     *     
     */
    public void setEntidad(EntidadRow value) {
        this.entidad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFin() {
        return fechaFin;
    }

    /**
     * Define el valor de la propiedad fechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFin(XMLGregorianCalendar value) {
        this.fechaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicio(XMLGregorianCalendar value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad penClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenClave() {
        return penClave;
    }

    /**
     * Define el valor de la propiedad penClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenClave(String value) {
        this.penClave = value;
    }

    /**
     * Obtiene el valor de la propiedad penEstatus.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getPenEstatus() {
        return penEstatus;
    }

    /**
     * Define el valor de la propiedad penEstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setPenEstatus(MultivaluadaRow value) {
        this.penEstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad penTipPendiente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenTipPendiente() {
        return penTipPendiente;
    }

    /**
     * Define el valor de la propiedad penTipPendiente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenTipPendiente(String value) {
        this.penTipPendiente = value;
    }

    /**
     * Obtiene el valor de la propiedad penTipo.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getPenTipo() {
        return penTipo;
    }

    /**
     * Define el valor de la propiedad penTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setPenTipo(MultivaluadaRow value) {
        this.penTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad reuId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReuId() {
        return reuId;
    }

    /**
     * Define el valor de la propiedad reuId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReuId(Integer value) {
        this.reuId = value;
    }

    /**
     * Obtiene el valor de la propiedad reunion.
     * 
     * @return
     *     possible object is
     *     {@link ReunionRow }
     *     
     */
    public ReunionRow getReunion() {
        return reunion;
    }

    /**
     * Define el valor de la propiedad reunion.
     * 
     * @param value
     *     allowed object is
     *     {@link ReunionRow }
     *     
     */
    public void setReunion(ReunionRow value) {
        this.reunion = value;
    }

}
