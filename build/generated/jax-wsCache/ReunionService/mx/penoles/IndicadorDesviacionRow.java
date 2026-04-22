
package mx.penoles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para indicadorDesviacionRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="indicadorDesviacionRow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.reunion.bsc.penoles/}indicadorRow">
 *       &lt;sequence>
 *         &lt;element name="indicadorEntidadList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="indicadorEntidadList" type="{http://service.reunion.bsc.penoles/}indicadorDesviacionEntidadRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="accionList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="accionList" type="{http://service.reunion.bsc.penoles/}indicadorDesviacionAccionRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="asu_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="asunto" type="{http://service.reunion.bsc.penoles/}asuntoRow" minOccurs="0"/>
 *         &lt;element name="entidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ide_causa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ide_orden" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reu_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indicadorDesviacionRow", propOrder = {
    "indicadorEntidadList",
    "accionList",
    "asuId",
    "asunto",
    "entidades",
    "ideCausa",
    "ideOrden",
    "reuId"
})
public class IndicadorDesviacionRow
    extends IndicadorRow
{

    @XmlElement(required = true)
    protected IndicadorDesviacionRow.IndicadorEntidadList indicadorEntidadList;
    @XmlElement(required = true)
    protected IndicadorDesviacionRow.AccionList accionList;
    @XmlElement(name = "asu_id")
    protected Short asuId;
    protected AsuntoRow asunto;
    protected String entidades;
    @XmlElement(name = "ide_causa")
    protected String ideCausa;
    @XmlElement(name = "ide_orden")
    protected Integer ideOrden;
    @XmlElement(name = "reu_id")
    protected Integer reuId;

    /**
     * Obtiene el valor de la propiedad indicadorEntidadList.
     * 
     * @return
     *     possible object is
     *     {@link IndicadorDesviacionRow.IndicadorEntidadList }
     *     
     */
    public IndicadorDesviacionRow.IndicadorEntidadList getIndicadorEntidadList() {
        return indicadorEntidadList;
    }

    /**
     * Define el valor de la propiedad indicadorEntidadList.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicadorDesviacionRow.IndicadorEntidadList }
     *     
     */
    public void setIndicadorEntidadList(IndicadorDesviacionRow.IndicadorEntidadList value) {
        this.indicadorEntidadList = value;
    }

    /**
     * Obtiene el valor de la propiedad accionList.
     * 
     * @return
     *     possible object is
     *     {@link IndicadorDesviacionRow.AccionList }
     *     
     */
    public IndicadorDesviacionRow.AccionList getAccionList() {
        return accionList;
    }

    /**
     * Define el valor de la propiedad accionList.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicadorDesviacionRow.AccionList }
     *     
     */
    public void setAccionList(IndicadorDesviacionRow.AccionList value) {
        this.accionList = value;
    }

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
     * Obtiene el valor de la propiedad asunto.
     * 
     * @return
     *     possible object is
     *     {@link AsuntoRow }
     *     
     */
    public AsuntoRow getAsunto() {
        return asunto;
    }

    /**
     * Define el valor de la propiedad asunto.
     * 
     * @param value
     *     allowed object is
     *     {@link AsuntoRow }
     *     
     */
    public void setAsunto(AsuntoRow value) {
        this.asunto = value;
    }

    /**
     * Obtiene el valor de la propiedad entidades.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidades() {
        return entidades;
    }

    /**
     * Define el valor de la propiedad entidades.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidades(String value) {
        this.entidades = value;
    }

    /**
     * Obtiene el valor de la propiedad ideCausa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdeCausa() {
        return ideCausa;
    }

    /**
     * Define el valor de la propiedad ideCausa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdeCausa(String value) {
        this.ideCausa = value;
    }

    /**
     * Obtiene el valor de la propiedad ideOrden.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdeOrden() {
        return ideOrden;
    }

    /**
     * Define el valor de la propiedad ideOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdeOrden(Integer value) {
        this.ideOrden = value;
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
     *         &lt;element name="accionList" type="{http://service.reunion.bsc.penoles/}indicadorDesviacionAccionRow" maxOccurs="unbounded" minOccurs="0"/>
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
        "accionList"
    })
    public static class AccionList {

        protected List<IndicadorDesviacionAccionRow> accionList;

        /**
         * Gets the value of the accionList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accionList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccionList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndicadorDesviacionAccionRow }
         * 
         * 
         */
        public List<IndicadorDesviacionAccionRow> getAccionList() {
            if (accionList == null) {
                accionList = new ArrayList<IndicadorDesviacionAccionRow>();
            }
            return this.accionList;
        }

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
     *         &lt;element name="indicadorEntidadList" type="{http://service.reunion.bsc.penoles/}indicadorDesviacionEntidadRow" maxOccurs="unbounded" minOccurs="0"/>
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
        "indicadorEntidadList"
    })
    public static class IndicadorEntidadList {

        protected List<IndicadorDesviacionEntidadRow> indicadorEntidadList;

        /**
         * Gets the value of the indicadorEntidadList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the indicadorEntidadList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIndicadorEntidadList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndicadorDesviacionEntidadRow }
         * 
         * 
         */
        public List<IndicadorDesviacionEntidadRow> getIndicadorEntidadList() {
            if (indicadorEntidadList == null) {
                indicadorEntidadList = new ArrayList<IndicadorDesviacionEntidadRow>();
            }
            return this.indicadorEntidadList;
        }

    }

}
