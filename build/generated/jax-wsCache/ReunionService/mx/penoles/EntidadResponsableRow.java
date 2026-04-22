
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para entidadResponsableRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="entidadResponsableRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ent_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entidad" type="{http://service.reunion.bsc.penoles/}entidadRow" minOccurs="0"/>
 *         &lt;element name="ere_correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ere_fec_act" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ere_fec_reg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ere_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ere_tipo" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="ere_usu_act" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ere_usu_reg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ere_usu_responsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entidadResponsableRow", propOrder = {
    "entId",
    "entidad",
    "ereCorreo",
    "ereFecAct",
    "ereFecReg",
    "ereNombre",
    "ereTipo",
    "ereUsuAct",
    "ereUsuReg",
    "ereUsuResponsable"
})
public class EntidadResponsableRow {

    @XmlElement(name = "ent_id")
    protected Integer entId;
    protected EntidadRow entidad;
    @XmlElement(name = "ere_correo")
    protected String ereCorreo;
    @XmlElement(name = "ere_fec_act")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ereFecAct;
    @XmlElement(name = "ere_fec_reg")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ereFecReg;
    @XmlElement(name = "ere_nombre")
    protected String ereNombre;
    @XmlElement(name = "ere_tipo")
    protected MultivaluadaRow ereTipo;
    @XmlElement(name = "ere_usu_act")
    protected String ereUsuAct;
    @XmlElement(name = "ere_usu_reg")
    protected String ereUsuReg;
    @XmlElement(name = "ere_usu_responsable")
    protected String ereUsuResponsable;

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
     * Obtiene el valor de la propiedad ereCorreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEreCorreo() {
        return ereCorreo;
    }

    /**
     * Define el valor de la propiedad ereCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEreCorreo(String value) {
        this.ereCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad ereFecAct.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEreFecAct() {
        return ereFecAct;
    }

    /**
     * Define el valor de la propiedad ereFecAct.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEreFecAct(XMLGregorianCalendar value) {
        this.ereFecAct = value;
    }

    /**
     * Obtiene el valor de la propiedad ereFecReg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEreFecReg() {
        return ereFecReg;
    }

    /**
     * Define el valor de la propiedad ereFecReg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEreFecReg(XMLGregorianCalendar value) {
        this.ereFecReg = value;
    }

    /**
     * Obtiene el valor de la propiedad ereNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEreNombre() {
        return ereNombre;
    }

    /**
     * Define el valor de la propiedad ereNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEreNombre(String value) {
        this.ereNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad ereTipo.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getEreTipo() {
        return ereTipo;
    }

    /**
     * Define el valor de la propiedad ereTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setEreTipo(MultivaluadaRow value) {
        this.ereTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad ereUsuAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEreUsuAct() {
        return ereUsuAct;
    }

    /**
     * Define el valor de la propiedad ereUsuAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEreUsuAct(String value) {
        this.ereUsuAct = value;
    }

    /**
     * Obtiene el valor de la propiedad ereUsuReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEreUsuReg() {
        return ereUsuReg;
    }

    /**
     * Define el valor de la propiedad ereUsuReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEreUsuReg(String value) {
        this.ereUsuReg = value;
    }

    /**
     * Obtiene el valor de la propiedad ereUsuResponsable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEreUsuResponsable() {
        return ereUsuResponsable;
    }

    /**
     * Define el valor de la propiedad ereUsuResponsable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEreUsuResponsable(String value) {
        this.ereUsuResponsable = value;
    }

}
