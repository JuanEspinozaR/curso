
package mx.penoles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para relevanteRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="relevanteRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asu_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="asunto" type="{http://service.reunion.bsc.penoles/}asuntoRow" minOccurs="0"/>
 *         &lt;element name="documentoList" type="{http://service.reunion.bsc.penoles/}documentoRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ent_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ent_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidadRelevante" type="{http://service.reunion.bsc.penoles/}entidadRow" minOccurs="0"/>
 *         &lt;element name="rel_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rel_id_key" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rel_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rel_orden" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
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
@XmlType(name = "relevanteRow", propOrder = {
    "asuId",
    "asunto",
    "documentoList",
    "entId",
    "entNombre",
    "entidadRelevante",
    "relId",
    "relIdKey",
    "relNombre",
    "relOrden",
    "reuId",
    "reunion"
})
@XmlSeeAlso({
    RelevanteServiceRow.class
})
public class RelevanteRow {

    @XmlElement(name = "asu_id")
    protected Short asuId;
    protected AsuntoRow asunto;
    @XmlElement(nillable = true)
    protected List<DocumentoRow> documentoList;
    @XmlElement(name = "ent_id")
    protected Integer entId;
    @XmlElement(name = "ent_nombre")
    protected String entNombre;
    protected EntidadRow entidadRelevante;
    @XmlElement(name = "rel_id")
    protected Integer relId;
    @XmlElement(name = "rel_id_key")
    protected Integer relIdKey;
    @XmlElement(name = "rel_nombre")
    protected String relNombre;
    @XmlElement(name = "rel_orden")
    protected Short relOrden;
    @XmlElement(name = "reu_id")
    protected Integer reuId;
    protected ReunionRow reunion;

    /**
     * Obtiene el valor de la propiedad asuId.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAsuId() {
        return asuId;
    }

    /**
     * Define el valor de la propiedad asuId.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAsuId(Short value) {
        this.asuId = value;
    }

    /**
     * Obtiene el valor de la propiedad asunto.
     * 
     * @return
     *     possible object is
     *     {@link AsuntoRow }
     *     
     */
    public AsuntoRow getAsunto() {
        return asunto;
    }

    /**
     * Define el valor de la propiedad asunto.
     * 
     * @param value
     *     allowed object is
     *     {@link AsuntoRow }
     *     
     */
    public void setAsunto(AsuntoRow value) {
        this.asunto = value;
    }

    /**
     * Gets the value of the documentoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoRow }
     * 
     * 
     */
    public List<DocumentoRow> getDocumentoList() {
        if (documentoList == null) {
            documentoList = new ArrayList<DocumentoRow>();
        }
        return this.documentoList;
    }

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
     * Obtiene el valor de la propiedad entNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntNombre() {
        return entNombre;
    }

    /**
     * Define el valor de la propiedad entNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntNombre(String value) {
        this.entNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadRelevante.
     * 
     * @return
     *     possible object is
     *     {@link EntidadRow }
     *     
     */
    public EntidadRow getEntidadRelevante() {
        return entidadRelevante;
    }

    /**
     * Define el valor de la propiedad entidadRelevante.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadRow }
     *     
     */
    public void setEntidadRelevante(EntidadRow value) {
        this.entidadRelevante = value;
    }

    /**
     * Obtiene el valor de la propiedad relId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelId() {
        return relId;
    }

    /**
     * Define el valor de la propiedad relId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelId(Integer value) {
        this.relId = value;
    }

    /**
     * Obtiene el valor de la propiedad relIdKey.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelIdKey() {
        return relIdKey;
    }

    /**
     * Define el valor de la propiedad relIdKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelIdKey(Integer value) {
        this.relIdKey = value;
    }

    /**
     * Obtiene el valor de la propiedad relNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelNombre() {
        return relNombre;
    }

    /**
     * Define el valor de la propiedad relNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelNombre(String value) {
        this.relNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad relOrden.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRelOrden() {
        return relOrden;
    }

    /**
     * Define el valor de la propiedad relOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRelOrden(Short value) {
        this.relOrden = value;
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
