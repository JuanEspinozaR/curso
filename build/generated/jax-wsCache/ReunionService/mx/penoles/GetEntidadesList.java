
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getEntidadesList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getEntidadesList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="niv_id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEntidadesList", propOrder = {
    "nivId"
})
public class GetEntidadesList {

    @XmlElement(name = "niv_id")
    protected short nivId;

    /**
     * Obtiene el valor de la propiedad nivId.
     * 
     */
    public short getNivId() {
        return nivId;
    }

    /**
     * Define el valor de la propiedad nivId.
     * 
     */
    public void setNivId(short value) {
        this.nivId = value;
    }

}
