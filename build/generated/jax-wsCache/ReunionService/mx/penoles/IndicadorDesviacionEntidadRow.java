
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para indicadorDesviacionEntidadRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="indicadorDesviacionEntidadRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asu_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ent_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ent_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidad" type="{http://service.reunion.bsc.penoles/}entidadRow" minOccurs="0"/>
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
@XmlType(name = "indicadorDesviacionEntidadRow", propOrder = {
    "asuId",
    "entId",
    "entNombre",
    "entidad",
    "indId",
    "indicadorDesviacionRow",
    "reuId"
})
public class IndicadorDesviacionEntidadRow {

    @XmlElement(name = "asu_id")
    protected Short asuId;
    @XmlElement(name = "ent_id")
    protected Integer entId;
    @XmlElement(name = "ent_nombre")
    protected String entNombre;
    protected EntidadRow entidad;
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
     * Obtiene el valor de la propiedad entId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntId() {
        return entId;
    }

    /**
     * Define el valor de la propiedad entId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntId(Integer value) {
        this.entId = value;
    }

    /**
     * Obtiene el valor de la propiedad entNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntNombre() {
        return entNombre;
    }

    /**
     * Define el valor de la propiedad entNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntNombre(String value) {
        this.entNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad entidad.
     * 
     * @return
     *     possible object is
     *     {@link EntidadRow }
     *     
     */
    public EntidadRow getEntidad() {
        return entidad;
    }

    /**
     * Define el valor de la propiedad entidad.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadRow }
     *     
     */
    public void setEntidad(EntidadRow value) {
        this.entidad = value;
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
