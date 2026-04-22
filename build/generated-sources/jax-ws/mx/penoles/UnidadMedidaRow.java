
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para unidadMedidaRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="unidadMedidaRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fam_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="familia" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ume_descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ume_fec_act" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ume_fec_reg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ume_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ume_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ume_simbolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ume_usu_act" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ume_usu_reg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unidadMedidaRow", propOrder = {
    "famId",
    "familia",
    "umeDescripcion",
    "umeFecAct",
    "umeFecReg",
    "umeId",
    "umeNombre",
    "umeSimbolo",
    "umeUsuAct",
    "umeUsuReg"
})
public class UnidadMedidaRow {

    @XmlElement(name = "fam_id")
    protected Integer famId;
    protected Object familia;
    @XmlElement(name = "ume_descripcion")
    protected String umeDescripcion;
    @XmlElement(name = "ume_fec_act")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar umeFecAct;
    @XmlElement(name = "ume_fec_reg")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar umeFecReg;
    @XmlElement(name = "ume_id")
    protected Short umeId;
    @XmlElement(name = "ume_nombre")
    protected String umeNombre;
    @XmlElement(name = "ume_simbolo")
    protected String umeSimbolo;
    @XmlElement(name = "ume_usu_act")
    protected String umeUsuAct;
    @XmlElement(name = "ume_usu_reg")
    protected String umeUsuReg;

    /**
     * Obtiene el valor de la propiedad famId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFamId() {
        return famId;
    }

    /**
     * Define el valor de la propiedad famId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFamId(Integer value) {
        this.famId = value;
    }

    /**
     * Obtiene el valor de la propiedad familia.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFamilia() {
        return familia;
    }

    /**
     * Define el valor de la propiedad familia.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFamilia(Object value) {
        this.familia = value;
    }

    /**
     * Obtiene el valor de la propiedad umeDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmeDescripcion() {
        return umeDescripcion;
    }

    /**
     * Define el valor de la propiedad umeDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmeDescripcion(String value) {
        this.umeDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad umeFecAct.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUmeFecAct() {
        return umeFecAct;
    }

    /**
     * Define el valor de la propiedad umeFecAct.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUmeFecAct(XMLGregorianCalendar value) {
        this.umeFecAct = value;
    }

    /**
     * Obtiene el valor de la propiedad umeFecReg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUmeFecReg() {
        return umeFecReg;
    }

    /**
     * Define el valor de la propiedad umeFecReg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUmeFecReg(XMLGregorianCalendar value) {
        this.umeFecReg = value;
    }

    /**
     * Obtiene el valor de la propiedad umeId.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUmeId() {
        return umeId;
    }

    /**
     * Define el valor de la propiedad umeId.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUmeId(Short value) {
        this.umeId = value;
    }

    /**
     * Obtiene el valor de la propiedad umeNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmeNombre() {
        return umeNombre;
    }

    /**
     * Define el valor de la propiedad umeNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmeNombre(String value) {
        this.umeNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad umeSimbolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmeSimbolo() {
        return umeSimbolo;
    }

    /**
     * Define el valor de la propiedad umeSimbolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmeSimbolo(String value) {
        this.umeSimbolo = value;
    }

    /**
     * Obtiene el valor de la propiedad umeUsuAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmeUsuAct() {
        return umeUsuAct;
    }

    /**
     * Define el valor de la propiedad umeUsuAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmeUsuAct(String value) {
        this.umeUsuAct = value;
    }

    /**
     * Obtiene el valor de la propiedad umeUsuReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmeUsuReg() {
        return umeUsuReg;
    }

    /**
     * Define el valor de la propiedad umeUsuReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmeUsuReg(String value) {
        this.umeUsuReg = value;
    }

}
