
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPendienteEstadisticaGrid complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPendienteEstadisticaGrid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pendienteEstadisticaRow" type="{http://service.reunion.bsc.penoles/}pendienteEstadisticaRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPendienteEstadisticaGrid", propOrder = {
    "type",
    "pendienteEstadisticaRow"
})
public class GetPendienteEstadisticaGrid {

    protected String type;
    protected PendienteEstadisticaRow pendienteEstadisticaRow;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad pendienteEstadisticaRow.
     * 
     * @return
     *     possible object is
     *     {@link PendienteEstadisticaRow }
     *     
     */
    public PendienteEstadisticaRow getPendienteEstadisticaRow() {
        return pendienteEstadisticaRow;
    }

    /**
     * Define el valor de la propiedad pendienteEstadisticaRow.
     * 
     * @param value
     *     allowed object is
     *     {@link PendienteEstadisticaRow }
     *     
     */
    public void setPendienteEstadisticaRow(PendienteEstadisticaRow value) {
        this.pendienteEstadisticaRow = value;
    }

}
