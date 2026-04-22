
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agendaNuevaReunion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agendaNuevaReunion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reunionRow" type="{http://service.reunion.bsc.penoles/}reunionRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agendaNuevaReunion", propOrder = {
    "reunionRow"
})
public class AgendaNuevaReunion {

    protected ReunionRow reunionRow;

    /**
     * Obtiene el valor de la propiedad reunionRow.
     * 
     * @return
     *     possible object is
     *     {@link ReunionRow }
     *     
     */
    public ReunionRow getReunionRow() {
        return reunionRow;
    }

    /**
     * Define el valor de la propiedad reunionRow.
     * 
     * @param value
     *     allowed object is
     *     {@link ReunionRow }
     *     
     */
    public void setReunionRow(ReunionRow value) {
        this.reunionRow = value;
    }

}
