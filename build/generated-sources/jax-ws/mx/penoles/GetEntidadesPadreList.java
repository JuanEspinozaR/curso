
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getEntidadesPadreList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getEntidadesPadreList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ent_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEntidadesPadreList", propOrder = {
    "entId"
})
public class GetEntidadesPadreList {

    @XmlElement(name = "ent_id")
    protected int entId;

    /**
     * Obtiene el valor de la propiedad entId.
     * 
     */
    public int getEntId() {
        return entId;
    }

    /**
     * Define el valor de la propiedad entId.
     * 
     */
    public void setEntId(int value) {
        this.entId = value;
    }

}
