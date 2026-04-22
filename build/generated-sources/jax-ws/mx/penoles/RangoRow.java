
package mx.penoles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rangoRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rangoRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ran_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ran_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ran_sentido" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="secuenciaList" type="{http://service.reunion.bsc.penoles/}rangoSecuenciaRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rangoRow", propOrder = {
    "ranId",
    "ranNombre",
    "ranSentido",
    "secuenciaList"
})
public class RangoRow {

    @XmlElement(name = "ran_id")
    protected Integer ranId;
    @XmlElement(name = "ran_nombre")
    protected String ranNombre;
    @XmlElement(name = "ran_sentido")
    protected MultivaluadaRow ranSentido;
    @XmlElement(nillable = true)
    protected List<RangoSecuenciaRow> secuenciaList;

    /**
     * Obtiene el valor de la propiedad ranId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRanId() {
        return ranId;
    }

    /**
     * Define el valor de la propiedad ranId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRanId(Integer value) {
        this.ranId = value;
    }

    /**
     * Obtiene el valor de la propiedad ranNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRanNombre() {
        return ranNombre;
    }

    /**
     * Define el valor de la propiedad ranNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRanNombre(String value) {
        this.ranNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad ranSentido.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getRanSentido() {
        return ranSentido;
    }

    /**
     * Define el valor de la propiedad ranSentido.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setRanSentido(MultivaluadaRow value) {
        this.ranSentido = value;
    }

    /**
     * Gets the value of the secuenciaList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secuenciaList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecuenciaList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangoSecuenciaRow }
     * 
     * 
     */
    public List<RangoSecuenciaRow> getSecuenciaList() {
        if (secuenciaList == null) {
            secuenciaList = new ArrayList<RangoSecuenciaRow>();
        }
        return this.secuenciaList;
    }

}
