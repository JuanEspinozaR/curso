
package mx.penoles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para estrategiaRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="estrategiaRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="est_fec_act" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="est_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="est_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="est_objetivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="est_status" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="est_usu_cve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorList" type="{http://service.reunion.bsc.penoles/}estrategiaIndicadorRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="per_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="perspectiva" type="{http://service.reunion.bsc.penoles/}perspectivaRow" minOccurs="0"/>
 *         &lt;element name="perspectivaRow" type="{http://service.reunion.bsc.penoles/}perspectivaRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estrategiaRow", propOrder = {
    "estFecAct",
    "estId",
    "estNombre",
    "estObjetivo",
    "estStatus",
    "estUsuCve",
    "indicadorList",
    "perId",
    "perspectiva",
    "perspectivaRow"
})
public class EstrategiaRow {

    @XmlElement(name = "est_fec_act")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estFecAct;
    @XmlElement(name = "est_id")
    protected Integer estId;
    @XmlElement(name = "est_nombre")
    protected String estNombre;
    @XmlElement(name = "est_objetivo")
    protected String estObjetivo;
    @XmlElement(name = "est_status")
    protected MultivaluadaRow estStatus;
    @XmlElement(name = "est_usu_cve")
    protected String estUsuCve;
    @XmlElement(nillable = true)
    protected List<EstrategiaIndicadorRow> indicadorList;
    @XmlElement(name = "per_id")
    protected Short perId;
    protected PerspectivaRow perspectiva;
    protected PerspectivaRow perspectivaRow;

    /**
     * Obtiene el valor de la propiedad estFecAct.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstFecAct() {
        return estFecAct;
    }

    /**
     * Define el valor de la propiedad estFecAct.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstFecAct(XMLGregorianCalendar value) {
        this.estFecAct = value;
    }

    /**
     * Obtiene el valor de la propiedad estId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstId() {
        return estId;
    }

    /**
     * Define el valor de la propiedad estId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstId(Integer value) {
        this.estId = value;
    }

    /**
     * Obtiene el valor de la propiedad estNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstNombre() {
        return estNombre;
    }

    /**
     * Define el valor de la propiedad estNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstNombre(String value) {
        this.estNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad estObjetivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstObjetivo() {
        return estObjetivo;
    }

    /**
     * Define el valor de la propiedad estObjetivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstObjetivo(String value) {
        this.estObjetivo = value;
    }

    /**
     * Obtiene el valor de la propiedad estStatus.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getEstStatus() {
        return estStatus;
    }

    /**
     * Define el valor de la propiedad estStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setEstStatus(MultivaluadaRow value) {
        this.estStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad estUsuCve.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstUsuCve() {
        return estUsuCve;
    }

    /**
     * Define el valor de la propiedad estUsuCve.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstUsuCve(String value) {
        this.estUsuCve = value;
    }

    /**
     * Gets the value of the indicadorList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicadorList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicadorList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstrategiaIndicadorRow }
     * 
     * 
     */
    public List<EstrategiaIndicadorRow> getIndicadorList() {
        if (indicadorList == null) {
            indicadorList = new ArrayList<EstrategiaIndicadorRow>();
        }
        return this.indicadorList;
    }

    /**
     * Obtiene el valor de la propiedad perId.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPerId() {
        return perId;
    }

    /**
     * Define el valor de la propiedad perId.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPerId(Short value) {
        this.perId = value;
    }

    /**
     * Obtiene el valor de la propiedad perspectiva.
     * 
     * @return
     *     possible object is
     *     {@link PerspectivaRow }
     *     
     */
    public PerspectivaRow getPerspectiva() {
        return perspectiva;
    }

    /**
     * Define el valor de la propiedad perspectiva.
     * 
     * @param value
     *     allowed object is
     *     {@link PerspectivaRow }
     *     
     */
    public void setPerspectiva(PerspectivaRow value) {
        this.perspectiva = value;
    }

    /**
     * Obtiene el valor de la propiedad perspectivaRow.
     * 
     * @return
     *     possible object is
     *     {@link PerspectivaRow }
     *     
     */
    public PerspectivaRow getPerspectivaRow() {
        return perspectivaRow;
    }

    /**
     * Define el valor de la propiedad perspectivaRow.
     * 
     * @param value
     *     allowed object is
     *     {@link PerspectivaRow }
     *     
     */
    public void setPerspectivaRow(PerspectivaRow value) {
        this.perspectivaRow = value;
    }

}
