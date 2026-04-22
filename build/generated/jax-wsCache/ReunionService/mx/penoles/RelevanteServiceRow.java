
package mx.penoles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para relevanteServiceRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="relevanteServiceRow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.reunion.bsc.penoles/}relevanteRow">
 *       &lt;sequence>
 *         &lt;element name="relevanteList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="relevanteList" type="{http://service.reunion.bsc.penoles/}relevanteServiceRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relevanteServiceRow", propOrder = {
    "relevanteList"
})
public class RelevanteServiceRow
    extends RelevanteRow
{

    @XmlElement(required = true)
    protected RelevanteServiceRow.RelevanteList relevanteList;

    /**
     * Obtiene el valor de la propiedad relevanteList.
     * 
     * @return
     *     possible object is
     *     {@link RelevanteServiceRow.RelevanteList }
     *     
     */
    public RelevanteServiceRow.RelevanteList getRelevanteList() {
        return relevanteList;
    }

    /**
     * Define el valor de la propiedad relevanteList.
     * 
     * @param value
     *     allowed object is
     *     {@link RelevanteServiceRow.RelevanteList }
     *     
     */
    public void setRelevanteList(RelevanteServiceRow.RelevanteList value) {
        this.relevanteList = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="relevanteList" type="{http://service.reunion.bsc.penoles/}relevanteServiceRow" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "relevanteList"
    })
    public static class RelevanteList {

        protected List<RelevanteServiceRow> relevanteList;

        /**
         * Gets the value of the relevanteList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relevanteList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelevanteList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RelevanteServiceRow }
         * 
         * 
         */
        public List<RelevanteServiceRow> getRelevanteList() {
            if (relevanteList == null) {
                relevanteList = new ArrayList<RelevanteServiceRow>();
            }
            return this.relevanteList;
        }

    }

}
