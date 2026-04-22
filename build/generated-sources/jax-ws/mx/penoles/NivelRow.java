
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nivelRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nivelRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="niv_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="niv_id_padre" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="niv_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nivelPadre" type="{http://service.reunion.bsc.penoles/}nivelRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nivelRow", propOrder = {
    "nivId",
    "nivIdPadre",
    "nivNombre",
    "nivelPadre"
})
public class NivelRow {

    @XmlElement(name = "niv_id")
    protected Short nivId;
    @XmlElement(name = "niv_id_padre")
    protected Short nivIdPadre;
    @XmlElement(name = "niv_nombre")
    protected String nivNombre;
    protected NivelRow nivelPadre;

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
     * Obtiene el valor de la propiedad nivIdPadre.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNivIdPadre() {
        return nivIdPadre;
    }

    /**
     * Define el valor de la propiedad nivIdPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNivIdPadre(Short value) {
        this.nivIdPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad nivNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivNombre() {
        return nivNombre;
    }

    /**
     * Define el valor de la propiedad nivNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivNombre(String value) {
        this.nivNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelPadre.
     * 
     * @return
     *     possible object is
     *     {@link NivelRow }
     *     
     */
    public NivelRow getNivelPadre() {
        return nivelPadre;
    }

    /**
     * Define el valor de la propiedad nivelPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link NivelRow }
     *     
     */
    public void setNivelPadre(NivelRow value) {
        this.nivelPadre = value;
    }

}
