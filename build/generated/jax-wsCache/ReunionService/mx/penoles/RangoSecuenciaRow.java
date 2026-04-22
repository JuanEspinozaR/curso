
package mx.penoles;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rangoSecuenciaRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rangoSecuenciaRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ran_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rse_calificacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rse_color" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rse_color_string" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rse_operador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rse_secuencia" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="rse_valor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rangoSecuenciaRow", propOrder = {
    "ranId",
    "rseCalificacion",
    "rseColor",
    "rseColorString",
    "rseOperador",
    "rseSecuencia",
    "rseValor"
})
public class RangoSecuenciaRow {

    @XmlElement(name = "ran_id")
    protected Integer ranId;
    @XmlElement(name = "rse_calificacion")
    protected BigDecimal rseCalificacion;
    @XmlElement(name = "rse_color")
    protected Integer rseColor;
    @XmlElement(name = "rse_color_string")
    protected String rseColorString;
    @XmlElement(name = "rse_operador")
    protected String rseOperador;
    @XmlElement(name = "rse_secuencia")
    protected Short rseSecuencia;
    @XmlElement(name = "rse_valor")
    protected BigDecimal rseValor;

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
     * Obtiene el valor de la propiedad rseCalificacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRseCalificacion() {
        return rseCalificacion;
    }

    /**
     * Define el valor de la propiedad rseCalificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRseCalificacion(BigDecimal value) {
        this.rseCalificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad rseColor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRseColor() {
        return rseColor;
    }

    /**
     * Define el valor de la propiedad rseColor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRseColor(Integer value) {
        this.rseColor = value;
    }

    /**
     * Obtiene el valor de la propiedad rseColorString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRseColorString() {
        return rseColorString;
    }

    /**
     * Define el valor de la propiedad rseColorString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRseColorString(String value) {
        this.rseColorString = value;
    }

    /**
     * Obtiene el valor de la propiedad rseOperador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRseOperador() {
        return rseOperador;
    }

    /**
     * Define el valor de la propiedad rseOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRseOperador(String value) {
        this.rseOperador = value;
    }

    /**
     * Obtiene el valor de la propiedad rseSecuencia.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRseSecuencia() {
        return rseSecuencia;
    }

    /**
     * Define el valor de la propiedad rseSecuencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRseSecuencia(Short value) {
        this.rseSecuencia = value;
    }

    /**
     * Obtiene el valor de la propiedad rseValor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRseValor() {
        return rseValor;
    }

    /**
     * Define el valor de la propiedad rseValor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRseValor(BigDecimal value) {
        this.rseValor = value;
    }

}
