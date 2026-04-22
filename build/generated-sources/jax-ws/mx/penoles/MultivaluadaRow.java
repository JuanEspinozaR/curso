
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para multivaluadaRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="multivaluadaRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="etaCve" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="etaDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multivaluadaRow")
public class MultivaluadaRow {

    @XmlAttribute(name = "etaCve")
    protected String etaCve;
    @XmlAttribute(name = "etaDesc")
    protected String etaDesc;

    /**
     * Obtiene el valor de la propiedad etaCve.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtaCve() {
        return etaCve;
    }

    /**
     * Define el valor de la propiedad etaCve.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtaCve(String value) {
        this.etaCve = value;
    }

    /**
     * Obtiene el valor de la propiedad etaDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtaDesc() {
        return etaDesc;
    }

    /**
     * Define el valor de la propiedad etaDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtaDesc(String value) {
        this.etaDesc = value;
    }

}
