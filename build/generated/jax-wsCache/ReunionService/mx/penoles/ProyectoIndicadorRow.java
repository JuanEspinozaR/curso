
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para proyectoIndicadorRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="proyectoIndicadorRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ind_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indicador" type="{http://service.reunion.bsc.penoles/}indicadorRow" minOccurs="0"/>
 *         &lt;element name="pen_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="proyecto" type="{http://service.reunion.bsc.penoles/}proyectoRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proyectoIndicadorRow", propOrder = {
    "indId",
    "indicador",
    "penId",
    "proyecto"
})
public class ProyectoIndicadorRow {

    @XmlElement(name = "ind_id")
    protected Integer indId;
    protected IndicadorRow indicador;
    @XmlElement(name = "pen_id")
    protected Integer penId;
    protected ProyectoRow proyecto;

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

    /**
     * Obtiene el valor de la propiedad penId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPenId() {
        return penId;
    }

    /**
     * Define el valor de la propiedad penId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPenId(Integer value) {
        this.penId = value;
    }

    /**
     * Obtiene el valor de la propiedad proyecto.
     * 
     * @return
     *     possible object is
     *     {@link ProyectoRow }
     *     
     */
    public ProyectoRow getProyecto() {
        return proyecto;
    }

    /**
     * Define el valor de la propiedad proyecto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProyectoRow }
     *     
     */
    public void setProyecto(ProyectoRow value) {
        this.proyecto = value;
    }

}
