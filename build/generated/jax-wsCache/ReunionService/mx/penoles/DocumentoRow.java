
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para documentoRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documentoRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doc_descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_fec_act" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="doc_fec_reg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="doc_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="doc_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_url_descarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_usu_act" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_usu_reg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_version" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentoRow", propOrder = {
    "docDescripcion",
    "docFecAct",
    "docFecReg",
    "docId",
    "docNombre",
    "docUrlDescarga",
    "docUsuAct",
    "docUsuReg",
    "docVersion"
})
public class DocumentoRow {

    @XmlElement(name = "doc_descripcion")
    protected String docDescripcion;
    @XmlElement(name = "doc_fec_act")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docFecAct;
    @XmlElement(name = "doc_fec_reg")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docFecReg;
    @XmlElement(name = "doc_id")
    protected Integer docId;
    @XmlElement(name = "doc_nombre")
    protected String docNombre;
    @XmlElement(name = "doc_url_descarga")
    protected String docUrlDescarga;
    @XmlElement(name = "doc_usu_act")
    protected String docUsuAct;
    @XmlElement(name = "doc_usu_reg")
    protected String docUsuReg;
    @XmlElement(name = "doc_version")
    protected Byte docVersion;

    /**
     * Obtiene el valor de la propiedad docDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocDescripcion() {
        return docDescripcion;
    }

    /**
     * Define el valor de la propiedad docDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocDescripcion(String value) {
        this.docDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad docFecAct.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocFecAct() {
        return docFecAct;
    }

    /**
     * Define el valor de la propiedad docFecAct.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocFecAct(XMLGregorianCalendar value) {
        this.docFecAct = value;
    }

    /**
     * Obtiene el valor de la propiedad docFecReg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocFecReg() {
        return docFecReg;
    }

    /**
     * Define el valor de la propiedad docFecReg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocFecReg(XMLGregorianCalendar value) {
        this.docFecReg = value;
    }

    /**
     * Obtiene el valor de la propiedad docId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocId() {
        return docId;
    }

    /**
     * Define el valor de la propiedad docId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocId(Integer value) {
        this.docId = value;
    }

    /**
     * Obtiene el valor de la propiedad docNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNombre() {
        return docNombre;
    }

    /**
     * Define el valor de la propiedad docNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNombre(String value) {
        this.docNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad docUrlDescarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocUrlDescarga() {
        return docUrlDescarga;
    }

    /**
     * Define el valor de la propiedad docUrlDescarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocUrlDescarga(String value) {
        this.docUrlDescarga = value;
    }

    /**
     * Obtiene el valor de la propiedad docUsuAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocUsuAct() {
        return docUsuAct;
    }

    /**
     * Define el valor de la propiedad docUsuAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocUsuAct(String value) {
        this.docUsuAct = value;
    }

    /**
     * Obtiene el valor de la propiedad docUsuReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocUsuReg() {
        return docUsuReg;
    }

    /**
     * Define el valor de la propiedad docUsuReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocUsuReg(String value) {
        this.docUsuReg = value;
    }

    /**
     * Obtiene el valor de la propiedad docVersion.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getDocVersion() {
        return docVersion;
    }

    /**
     * Define el valor de la propiedad docVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setDocVersion(Byte value) {
        this.docVersion = value;
    }

}
