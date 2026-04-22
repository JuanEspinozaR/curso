
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para businessUnitRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="businessUnitRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bun_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bun_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bun_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="div_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="div_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="div_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessUnitRow", propOrder = {
    "bunDescription",
    "bunId",
    "bunName",
    "divDescription",
    "divId",
    "divName"
})
public class BusinessUnitRow {

    @XmlElement(name = "bun_description")
    protected String bunDescription;
    @XmlElement(name = "bun_id")
    protected Integer bunId;
    @XmlElement(name = "bun_name")
    protected String bunName;
    @XmlElement(name = "div_description")
    protected String divDescription;
    @XmlElement(name = "div_id")
    protected Integer divId;
    @XmlElement(name = "div_name")
    protected String divName;

    /**
     * Obtiene el valor de la propiedad bunDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBunDescription() {
        return bunDescription;
    }

    /**
     * Define el valor de la propiedad bunDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBunDescription(String value) {
        this.bunDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad bunId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBunId() {
        return bunId;
    }

    /**
     * Define el valor de la propiedad bunId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBunId(Integer value) {
        this.bunId = value;
    }

    /**
     * Obtiene el valor de la propiedad bunName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBunName() {
        return bunName;
    }

    /**
     * Define el valor de la propiedad bunName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBunName(String value) {
        this.bunName = value;
    }

    /**
     * Obtiene el valor de la propiedad divDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivDescription() {
        return divDescription;
    }

    /**
     * Define el valor de la propiedad divDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivDescription(String value) {
        this.divDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad divId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDivId() {
        return divId;
    }

    /**
     * Define el valor de la propiedad divId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDivId(Integer value) {
        this.divId = value;
    }

    /**
     * Obtiene el valor de la propiedad divName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivName() {
        return divName;
    }

    /**
     * Define el valor de la propiedad divName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivName(String value) {
        this.divName = value;
    }

}
