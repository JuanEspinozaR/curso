
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para usuarioRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuarioRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ent_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entidadUsuario" type="{http://service.reunion.bsc.penoles/}entidadRow" minOccurs="0"/>
 *         &lt;element name="niv_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="primaryKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usu_correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usu_cve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usu_fec_act" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usu_fec_reg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usu_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usu_usu_act" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usu_usu_reg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuarioRow", propOrder = {
    "entId",
    "entidadUsuario",
    "nivId",
    "primaryKey",
    "usuCorreo",
    "usuCve",
    "usuFecAct",
    "usuFecReg",
    "usuNombre",
    "usuUsuAct",
    "usuUsuReg"
})
public class UsuarioRow {

    @XmlElement(name = "ent_id")
    protected Integer entId;
    protected EntidadRow entidadUsuario;
    @XmlElement(name = "niv_id")
    protected Short nivId;
    protected String primaryKey;
    @XmlElement(name = "usu_correo")
    protected String usuCorreo;
    @XmlElement(name = "usu_cve")
    protected String usuCve;
    @XmlElement(name = "usu_fec_act")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usuFecAct;
    @XmlElement(name = "usu_fec_reg")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usuFecReg;
    @XmlElement(name = "usu_nombre")
    protected String usuNombre;
    @XmlElement(name = "usu_usu_act")
    protected String usuUsuAct;
    @XmlElement(name = "usu_usu_reg")
    protected String usuUsuReg;

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
     * Obtiene el valor de la propiedad entidadUsuario.
     * 
     * @return
     *     possible object is
     *     {@link EntidadRow }
     *     
     */
    public EntidadRow getEntidadUsuario() {
        return entidadUsuario;
    }

    /**
     * Define el valor de la propiedad entidadUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadRow }
     *     
     */
    public void setEntidadUsuario(EntidadRow value) {
        this.entidadUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad nivId.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNivId() {
        return nivId;
    }

    /**
     * Define el valor de la propiedad nivId.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNivId(Short value) {
        this.nivId = value;
    }

    /**
     * Obtiene el valor de la propiedad primaryKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryKey() {
        return primaryKey;
    }

    /**
     * Define el valor de la propiedad primaryKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryKey(String value) {
        this.primaryKey = value;
    }

    /**
     * Obtiene el valor de la propiedad usuCorreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuCorreo() {
        return usuCorreo;
    }

    /**
     * Define el valor de la propiedad usuCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuCorreo(String value) {
        this.usuCorreo = value;
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
     * Obtiene el valor de la propiedad usuFecAct.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsuFecAct() {
        return usuFecAct;
    }

    /**
     * Define el valor de la propiedad usuFecAct.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsuFecAct(XMLGregorianCalendar value) {
        this.usuFecAct = value;
    }

    /**
     * Obtiene el valor de la propiedad usuFecReg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsuFecReg() {
        return usuFecReg;
    }

    /**
     * Define el valor de la propiedad usuFecReg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsuFecReg(XMLGregorianCalendar value) {
        this.usuFecReg = value;
    }

    /**
     * Obtiene el valor de la propiedad usuNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuNombre() {
        return usuNombre;
    }

    /**
     * Define el valor de la propiedad usuNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuNombre(String value) {
        this.usuNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad usuUsuAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuUsuAct() {
        return usuUsuAct;
    }

    /**
     * Define el valor de la propiedad usuUsuAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuUsuAct(String value) {
        this.usuUsuAct = value;
    }

    /**
     * Obtiene el valor de la propiedad usuUsuReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuUsuReg() {
        return usuUsuReg;
    }

    /**
     * Define el valor de la propiedad usuUsuReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuUsuReg(String value) {
        this.usuUsuReg = value;
    }

}
