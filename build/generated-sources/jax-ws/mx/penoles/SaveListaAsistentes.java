
package mx.penoles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para saveListaAsistentes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saveListaAsistentes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asistenteList" type="{http://service.reunion.bsc.penoles/}asistenteRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveListaAsistentes", propOrder = {
    "asistenteList"
})
public class SaveListaAsistentes {

    protected List<AsistenteRow> asistenteList;

    /**
     * Gets the value of the asistenteList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asistenteList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsistenteList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AsistenteRow }
     * 
     * 
     */
    public List<AsistenteRow> getAsistenteList() {
        if (asistenteList == null) {
            asistenteList = new ArrayList<AsistenteRow>();
        }
        return this.asistenteList;
    }

}
