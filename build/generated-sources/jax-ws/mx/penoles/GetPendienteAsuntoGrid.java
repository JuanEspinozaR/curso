
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPendienteAsuntoGrid complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPendienteAsuntoGrid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asuntoRow" type="{http://service.reunion.bsc.penoles/}asuntoRow" minOccurs="0"/>
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
@XmlType(name = "getPendienteAsuntoGrid", propOrder = {
    "asuntoRow",
    "pendienteRow"
})
public class GetPendienteAsuntoGrid {

    protected AsuntoRow asuntoRow;
    protected PendienteRow pendienteRow;

    /**
     * Obtiene el valor de la propiedad asuntoRow.
     * 
     * @return
     *     possible object is
     *     {@link AsuntoRow }
     *     
     */
    public AsuntoRow getAsuntoRow() {
        return asuntoRow;
    }

    /**
     * Define el valor de la propiedad asuntoRow.
     * 
     * @param value
     *     allowed object is
     *     {@link AsuntoRow }
     *     
     */
    public void setAsuntoRow(AsuntoRow value) {
        this.asuntoRow = value;
    }

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
