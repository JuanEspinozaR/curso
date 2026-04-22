
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para estrategiaIndicadorRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="estrategiaIndicadorRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="est_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estrategia" type="{http://service.reunion.bsc.penoles/}estrategiaRow" minOccurs="0"/>
 *         &lt;element name="ind_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indicador" type="{http://service.reunion.bsc.penoles/}indicadorRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estrategiaIndicadorRow", propOrder = {
    "estId",
    "estrategia",
    "indId",
    "indicador"
})
public class EstrategiaIndicadorRow {

    @XmlElement(name = "est_id")
    protected Integer estId;
    protected EstrategiaRow estrategia;
    @XmlElement(name = "ind_id")
    protected Integer indId;
    protected IndicadorRow indicador;

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
     * Obtiene el valor de la propiedad estrategia.
     * 
     * @return
     *     possible object is
     *     {@link EstrategiaRow }
     *     
     */
    public EstrategiaRow getEstrategia() {
        return estrategia;
    }

    /**
     * Define el valor de la propiedad estrategia.
     * 
     * @param value
     *     allowed object is
     *     {@link EstrategiaRow }
     *     
     */
    public void setEstrategia(EstrategiaRow value) {
        this.estrategia = value;
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
     * Obtiene el valor de la propiedad indicador.
     * 
     * @return
     *     possible object is
     *     {@link IndicadorRow }
     *     
     */
    public IndicadorRow getIndicador() {
        return indicador;
    }

    /**
     * Define el valor de la propiedad indicador.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicadorRow }
     *     
     */
    public void setIndicador(IndicadorRow value) {
        this.indicador = value;
    }

}
