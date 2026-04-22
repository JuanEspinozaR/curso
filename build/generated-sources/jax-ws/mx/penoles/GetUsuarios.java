
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getUsuarios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getUsuarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuarioRow" type="{http://service.reunion.bsc.penoles/}usuarioRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsuarios", propOrder = {
    "usuarioRow"
})
public class GetUsuarios {

    protected UsuarioRow usuarioRow;

    /**
     * Obtiene el valor de la propiedad usuarioRow.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioRow }
     *     
     */
    public UsuarioRow getUsuarioRow() {
        return usuarioRow;
    }

    /**
     * Define el valor de la propiedad usuarioRow.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioRow }
     *     
     */
    public void setUsuarioRow(UsuarioRow value) {
        this.usuarioRow = value;
    }

}
