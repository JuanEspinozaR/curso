
package mx.penoles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asuntoServiceRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asuntoServiceRow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.reunion.bsc.penoles/}asuntoRow">
 *       &lt;sequence>
 *         &lt;element name="asuntoList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="asuntoList" type="{http://service.reunion.bsc.penoles/}asuntoRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="asu_duracion_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asu_duracion_real_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asu_status_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asu_tipo_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asuntoServiceRow", propOrder = {
    "asuntoList",
    "asuDuracionDesc",
    "asuDuracionRealDesc",
    "asuStatusDesc",
    "asuTipoDesc"
})
public class AsuntoServiceRow
    extends AsuntoRow
{

    @XmlElement(required = true)
    protected AsuntoServiceRow.AsuntoList asuntoList;
    @XmlElement(name = "asu_duracion_desc")
    protected String asuDuracionDesc;
    @XmlElement(name = "asu_duracion_real_desc")
    protected String asuDuracionRealDesc;
    @XmlElement(name = "asu_status_desc")
    protected String asuStatusDesc;
    @XmlElement(name = "asu_tipo_desc")
    protected String asuTipoDesc;

    /**
     * Obtiene el valor de la propiedad asuntoList.
     * 
     * @return
     *     possible object is
     *     {@link AsuntoServiceRow.AsuntoList }
     *     
     */
    public AsuntoServiceRow.AsuntoList getAsuntoList() {
        return asuntoList;
    }

    /**
     * Define el valor de la propiedad asuntoList.
     * 
     * @param value
     *     allowed object is
     *     {@link AsuntoServiceRow.AsuntoList }
     *     
     */
    public void setAsuntoList(AsuntoServiceRow.AsuntoList value) {
        this.asuntoList = value;
    }

    /**
     * Obtiene el valor de la propiedad asuDuracionDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsuDuracionDesc() {
        return asuDuracionDesc;
    }

    /**
     * Define el valor de la propiedad asuDuracionDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsuDuracionDesc(String value) {
        this.asuDuracionDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad asuDuracionRealDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsuDuracionRealDesc() {
        return asuDuracionRealDesc;
    }

    /**
     * Define el valor de la propiedad asuDuracionRealDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsuDuracionRealDesc(String value) {
        this.asuDuracionRealDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad asuStatusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsuStatusDesc() {
        return asuStatusDesc;
    }

    /**
     * Define el valor de la propiedad asuStatusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsuStatusDesc(String value) {
        this.asuStatusDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad asuTipoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsuTipoDesc() {
        return asuTipoDesc;
    }

    /**
     * Define el valor de la propiedad asuTipoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsuTipoDesc(String value) {
        this.asuTipoDesc = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="asuntoList" type="{http://service.reunion.bsc.penoles/}asuntoRow" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "asuntoList"
    })
    public static class AsuntoList {

        protected List<AsuntoRow> asuntoList;

        /**
         * Gets the value of the asuntoList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the asuntoList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAsuntoList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AsuntoRow }
         * 
         * 
         */
        public List<AsuntoRow> getAsuntoList() {
            if (asuntoList == null) {
                asuntoList = new ArrayList<AsuntoRow>();
            }
            return this.asuntoList;
        }

    }

}
