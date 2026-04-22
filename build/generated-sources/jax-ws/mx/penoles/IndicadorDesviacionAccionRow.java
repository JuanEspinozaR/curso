
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para indicadorDesviacionAccionRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="indicadorDesviacionAccionRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asu_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ida_descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ida_fec_compromiso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ida_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ida_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ida_status" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="ind_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indicadorDesviacionRow" type="{http://service.reunion.bsc.penoles/}indicadorDesviacionRow" minOccurs="0"/>
 *         &lt;element name="reu_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indicadorDesviacionAccionRow", propOrder = {
    "asuId",
    "idaDescripcion",
    "idaFecCompromiso",
    "idaId",
    "idaNombre",
    "idaStatus",
    "indId",
    "indicadorDesviacionRow",
    "reuId"
})
public class IndicadorDesviacionAccionRow {

    @XmlElement(name = "asu_id")
    protected Short asuId;
    @XmlElement(name = "ida_descripcion")
    protected String idaDescripcion;
    @XmlElement(name = "ida_fec_compromiso")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar idaFecCompromiso;
    @XmlElement(name = "ida_id")
    protected Integer idaId;
    @XmlElement(name = "ida_nombre")
    protected String idaNombre;
    @XmlElement(name = "ida_status")
    protected MultivaluadaRow idaStatus;
    @XmlElement(name = "ind_id")
    protected Integer indId;
    protected IndicadorDesviacionRow indicadorDesviacionRow;
    @XmlElement(name = "reu_id")
    protected Integer reuId;

    /**
     * Obtiene el valor de la propiedad asuId.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAsuId() {
        return asuId;
    }

    /**
     * Define el valor de la propiedad asuId.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAsuId(Short value) {
        this.asuId = value;
    }

    /**
     * Obtiene el valor de la propiedad idaDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdaDescripcion() {
        return idaDescripcion;
    }

    /**
     * Define el valor de la propiedad idaDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdaDescripcion(String value) {
        this.idaDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idaFecCompromiso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdaFecCompromiso() {
        return idaFecCompromiso;
    }

    /**
     * Define el valor de la propiedad idaFecCompromiso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdaFecCompromiso(XMLGregorianCalendar value) {
        this.idaFecCompromiso = value;
    }

    /**
     * Obtiene el valor de la propiedad idaId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdaId() {
        return idaId;
    }

    /**
     * Define el valor de la propiedad idaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdaId(Integer value) {
        this.idaId = value;
    }

    /**
     * Obtiene el valor de la propiedad idaNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdaNombre() {
        return idaNombre;
    }

    /**
     * Define el valor de la propiedad idaNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdaNombre(String value) {
        this.idaNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad idaStatus.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getIdaStatus() {
        return idaStatus;
    }

    /**
     * Define el valor de la propiedad idaStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setIdaStatus(MultivaluadaRow value) {
        this.idaStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad indId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndId() {
        return indId;
    }

    /**
     * Define el valor de la propiedad indId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndId(Integer value) {
        this.indId = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorDesviacionRow.
     * 
     * @return
     *     possible object is
     *     {@link IndicadorDesviacionRow }
     *     
     */
    public IndicadorDesviacionRow getIndicadorDesviacionRow() {
        return indicadorDesviacionRow;
    }

    /**
     * Define el valor de la propiedad indicadorDesviacionRow.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicadorDesviacionRow }
     *     
     */
    public void setIndicadorDesviacionRow(IndicadorDesviacionRow value) {
        this.indicadorDesviacionRow = value;
    }

    /**
     * Obtiene el valor de la propiedad reuId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReuId() {
        return reuId;
    }

    /**
     * Define el valor de la propiedad reuId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReuId(Integer value) {
        this.reuId = value;
    }

}
