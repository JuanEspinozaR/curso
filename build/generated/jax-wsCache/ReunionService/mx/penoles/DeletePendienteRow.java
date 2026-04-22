
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para deletePendienteRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deletePendienteRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pendienteRow" type="{http://service.reunion.bsc.penoles/}pendienteRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletePendienteRow", propOrder = {
    "pendienteRow"
})
public class DeletePendienteRow {

    protected PendienteRow pendienteRow;

    /**
     * Obtiene el valor de la propiedad pendienteRow.
     * 
     * @return
     *     possible object is
     *     {@link PendienteRow }
     *     
     */
    public PendienteRow getPendienteRow() {
        return pendienteRow;
    }

    /**
     * Define el valor de la propiedad pendienteRow.
     * 
     * @param value
     *     allowed object is
     *     {@link PendienteRow }
     *     
     */
    public void setPendienteRow(PendienteRow value) {
        this.pendienteRow = value;
    }

}
