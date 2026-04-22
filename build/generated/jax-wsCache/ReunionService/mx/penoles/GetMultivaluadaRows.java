
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getMultivaluadaRows complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getMultivaluadaRows">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lta_nom_tabla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lta_nom_campo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMultivaluadaRows", propOrder = {
    "ltaNomTabla",
    "ltaNomCampo"
})
public class GetMultivaluadaRows {

    @XmlElement(name = "lta_nom_tabla")
    protected String ltaNomTabla;
    @XmlElement(name = "lta_nom_campo")
    protected String ltaNomCampo;

    /**
     * Obtiene el valor de la propiedad ltaNomTabla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtaNomTabla() {
        return ltaNomTabla;
    }

    /**
     * Define el valor de la propiedad ltaNomTabla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtaNomTabla(String value) {
        this.ltaNomTabla = value;
    }

    /**
     * Obtiene el valor de la propiedad ltaNomCampo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtaNomCampo() {
        return ltaNomCampo;
    }

    /**
     * Define el valor de la propiedad ltaNomCampo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtaNomCampo(String value) {
        this.ltaNomCampo = value;
    }

}
