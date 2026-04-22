
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para perspectivaRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="perspectivaRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="per_clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="per_color" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="per_color_string" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="per_color_texto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="per_color_texto_string" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="per_descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="per_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="per_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="per_status" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "perspectivaRow", propOrder = {
    "perClave",
    "perColor",
    "perColorString",
    "perColorTexto",
    "perColorTextoString",
    "perDescripcion",
    "perId",
    "perNombre",
    "perStatus"
})
public class PerspectivaRow {

    @XmlElement(name = "per_clave")
    protected String perClave;
    @XmlElement(name = "per_color")
    protected Integer perColor;
    @XmlElement(name = "per_color_string")
    protected String perColorString;
    @XmlElement(name = "per_color_texto")
    protected Integer perColorTexto;
    @XmlElement(name = "per_color_texto_string")
    protected String perColorTextoString;
    @XmlElement(name = "per_descripcion")
    protected String perDescripcion;
    @XmlElement(name = "per_id")
    protected Short perId;
    @XmlElement(name = "per_nombre")
    protected String perNombre;
    @XmlElement(name = "per_status")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer perStatus;

    /**
     * Obtiene el valor de la propiedad perClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerClave() {
        return perClave;
    }

    /**
     * Define el valor de la propiedad perClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerClave(String value) {
        this.perClave = value;
    }

    /**
     * Obtiene el valor de la propiedad perColor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPerColor() {
        return perColor;
    }

    /**
     * Define el valor de la propiedad perColor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPerColor(Integer value) {
        this.perColor = value;
    }

    /**
     * Obtiene el valor de la propiedad perColorString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerColorString() {
        return perColorString;
    }

    /**
     * Define el valor de la propiedad perColorString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerColorString(String value) {
        this.perColorString = value;
    }

    /**
     * Obtiene el valor de la propiedad perColorTexto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPerColorTexto() {
        return perColorTexto;
    }

    /**
     * Define el valor de la propiedad perColorTexto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPerColorTexto(Integer value) {
        this.perColorTexto = value;
    }

    /**
     * Obtiene el valor de la propiedad perColorTextoString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerColorTextoString() {
        return perColorTextoString;
    }

    /**
     * Define el valor de la propiedad perColorTextoString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerColorTextoString(String value) {
        this.perColorTextoString = value;
    }

    /**
     * Obtiene el valor de la propiedad perDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerDescripcion() {
        return perDescripcion;
    }

    /**
     * Define el valor de la propiedad perDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerDescripcion(String value) {
        this.perDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad perId.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPerId() {
        return perId;
    }

    /**
     * Define el valor de la propiedad perId.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPerId(Short value) {
        this.perId = value;
    }

    /**
     * Obtiene el valor de la propiedad perNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerNombre() {
        return perNombre;
    }

    /**
     * Define el valor de la propiedad perNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerNombre(String value) {
        this.perNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad perStatus.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPerStatus() {
        return perStatus;
    }

    /**
     * Define el valor de la propiedad perStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPerStatus(Integer value) {
        this.perStatus = value;
    }

}
