
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para asistenteRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asistenteRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asi_correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asi_fec_notifica" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="asi_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="asi_id_padre" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="asi_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asi_razon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asi_status" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="asi_tip_ausencia" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="asi_tipo" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reu_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usu_cve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_asi_status_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_asi_tipo_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asistenteRow", propOrder = {
    "asiCorreo",
    "asiFecNotifica",
    "asiId",
    "asiIdPadre",
    "asiNombre",
    "asiRazon",
    "asiStatus",
    "asiTipAusencia",
    "asiTipo",
    "key",
    "reuId",
    "usuCve",
    "asiStatusDesc",
    "asiTipoDesc"
})
public class AsistenteRow {

    @XmlElement(name = "asi_correo")
    protected String asiCorreo;
    @XmlElement(name = "asi_fec_notifica")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asiFecNotifica;
    @XmlElement(name = "asi_id")
    protected Short asiId;
    @XmlElement(name = "asi_id_padre")
    protected Short asiIdPadre;
    @XmlElement(name = "asi_nombre")
    protected String asiNombre;
    @XmlElement(name = "asi_razon")
    protected String asiRazon;
    @XmlElement(name = "asi_status")
    protected MultivaluadaRow asiStatus;
    @XmlElement(name = "asi_tip_ausencia")
    protected MultivaluadaRow asiTipAusencia;
    @XmlElement(name = "asi_tipo")
    protected MultivaluadaRow asiTipo;
    protected String key;
    @XmlElement(name = "reu_id")
    protected Integer reuId;
    @XmlElement(name = "usu_cve")
    protected String usuCve;
    @XmlElement(name = "_asi_status_desc")
    protected String asiStatusDesc;
    @XmlElement(name = "_asi_tipo_desc")
    protected String asiTipoDesc;

    /**
     * Obtiene el valor de la propiedad asiCorreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiCorreo() {
        return asiCorreo;
    }

    /**
     * Define el valor de la propiedad asiCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiCorreo(String value) {
        this.asiCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad asiFecNotifica.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsiFecNotifica() {
        return asiFecNotifica;
    }

    /**
     * Define el valor de la propiedad asiFecNotifica.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsiFecNotifica(XMLGregorianCalendar value) {
        this.asiFecNotifica = value;
    }

    /**
     * Obtiene el valor de la propiedad asiId.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAsiId() {
        return asiId;
    }

    /**
     * Define el valor de la propiedad asiId.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAsiId(Short value) {
        this.asiId = value;
    }

    /**
     * Obtiene el valor de la propiedad asiIdPadre.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAsiIdPadre() {
        return asiIdPadre;
    }

    /**
     * Define el valor de la propiedad asiIdPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAsiIdPadre(Short value) {
        this.asiIdPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad asiNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiNombre() {
        return asiNombre;
    }

    /**
     * Define el valor de la propiedad asiNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiNombre(String value) {
        this.asiNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad asiRazon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiRazon() {
        return asiRazon;
    }

    /**
     * Define el valor de la propiedad asiRazon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiRazon(String value) {
        this.asiRazon = value;
    }

    /**
     * Obtiene el valor de la propiedad asiStatus.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getAsiStatus() {
        return asiStatus;
    }

    /**
     * Define el valor de la propiedad asiStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setAsiStatus(MultivaluadaRow value) {
        this.asiStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad asiTipAusencia.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getAsiTipAusencia() {
        return asiTipAusencia;
    }

    /**
     * Define el valor de la propiedad asiTipAusencia.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setAsiTipAusencia(MultivaluadaRow value) {
        this.asiTipAusencia = value;
    }

    /**
     * Obtiene el valor de la propiedad asiTipo.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getAsiTipo() {
        return asiTipo;
    }

    /**
     * Define el valor de la propiedad asiTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setAsiTipo(MultivaluadaRow value) {
        this.asiTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad key.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Define el valor de la propiedad key.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
     * Obtiene el valor de la propiedad usuCve.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuCve() {
        return usuCve;
    }

    /**
     * Define el valor de la propiedad usuCve.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuCve(String value) {
        this.usuCve = value;
    }

    /**
     * Obtiene el valor de la propiedad asiStatusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiStatusDesc() {
        return asiStatusDesc;
    }

    /**
     * Define el valor de la propiedad asiStatusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiStatusDesc(String value) {
        this.asiStatusDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad asiTipoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiTipoDesc() {
        return asiTipoDesc;
    }

    /**
     * Define el valor de la propiedad asiTipoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiTipoDesc(String value) {
        this.asiTipoDesc = value;
    }

}
