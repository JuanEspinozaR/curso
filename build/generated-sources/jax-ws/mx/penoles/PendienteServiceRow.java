
package mx.penoles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pendienteServiceRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pendienteServiceRow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.reunion.bsc.penoles/}pendienteRow">
 *       &lt;sequence>
 *         &lt;element name="pendienteList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pendienteList" type="{http://service.reunion.bsc.penoles/}pendienteServiceRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ent_id_Padre" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pen_avance_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_salud_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_status_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_tipo_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pendienteServiceRow", propOrder = {
    "pendienteList",
    "entIdPadre",
    "penAvanceDesc",
    "penSaludDesc",
    "penStatusDesc",
    "penTipoDesc"
})
public class PendienteServiceRow
    extends PendienteRow
{

    @XmlElement(required = true)
    protected PendienteServiceRow.PendienteList pendienteList;
    @XmlElement(name = "ent_id_Padre")
    protected Integer entIdPadre;
    @XmlElement(name = "pen_avance_desc")
    protected String penAvanceDesc;
    @XmlElement(name = "pen_salud_desc")
    protected String penSaludDesc;
    @XmlElement(name = "pen_status_desc")
    protected String penStatusDesc;
    @XmlElement(name = "pen_tipo_desc")
    protected String penTipoDesc;

    /**
     * Obtiene el valor de la propiedad pendienteList.
     * 
     * @return
     *     possible object is
     *     {@link PendienteServiceRow.PendienteList }
     *     
     */
    public PendienteServiceRow.PendienteList getPendienteList() {
        return pendienteList;
    }

    /**
     * Define el valor de la propiedad pendienteList.
     * 
     * @param value
     *     allowed object is
     *     {@link PendienteServiceRow.PendienteList }
     *     
     */
    public void setPendienteList(PendienteServiceRow.PendienteList value) {
        this.pendienteList = value;
    }

    /**
     * Obtiene el valor de la propiedad entIdPadre.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntIdPadre() {
        return entIdPadre;
    }

    /**
     * Define el valor de la propiedad entIdPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntIdPadre(Integer value) {
        this.entIdPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad penAvanceDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenAvanceDesc() {
        return penAvanceDesc;
    }

    /**
     * Define el valor de la propiedad penAvanceDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenAvanceDesc(String value) {
        this.penAvanceDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad penSaludDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenSaludDesc() {
        return penSaludDesc;
    }

    /**
     * Define el valor de la propiedad penSaludDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenSaludDesc(String value) {
        this.penSaludDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad penStatusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenStatusDesc() {
        return penStatusDesc;
    }

    /**
     * Define el valor de la propiedad penStatusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenStatusDesc(String value) {
        this.penStatusDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad penTipoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenTipoDesc() {
        return penTipoDesc;
    }

    /**
     * Define el valor de la propiedad penTipoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenTipoDesc(String value) {
        this.penTipoDesc = value;
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
     *         &lt;element name="pendienteList" type="{http://service.reunion.bsc.penoles/}pendienteServiceRow" maxOccurs="unbounded" minOccurs="0"/>
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
        "pendienteList"
    })
    public static class PendienteList {

        protected List<PendienteServiceRow> pendienteList;

        /**
         * Gets the value of the pendienteList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pendienteList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPendienteList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PendienteServiceRow }
         * 
         * 
         */
        public List<PendienteServiceRow> getPendienteList() {
            if (pendienteList == null) {
                pendienteList = new ArrayList<PendienteServiceRow>();
            }
            return this.pendienteList;
        }

    }

}
