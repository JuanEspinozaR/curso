
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para indicadorRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="indicadorRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bun_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="businessUnit" type="{http://service.reunion.bsc.penoles/}businessUnitRow" minOccurs="0"/>
 *         &lt;element name="div_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="est_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ind_clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ind_consolida" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="ind_descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ind_fec_act" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ind_fec_reg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ind_formula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ind_formula_cal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ind_formula_var" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ind_frecuencia" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="ind_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ind_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ind_signo" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="ind_status" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="ind_tipo" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="ind_tipo_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ind_usu_act" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ind_usu_reg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measure_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="perf_area_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ran_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ran_sentido" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="rango" type="{http://service.reunion.bsc.penoles/}rangoRow" minOccurs="0"/>
 *         &lt;element name="ume_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="unidadMedidaRow" type="{http://service.reunion.bsc.penoles/}unidadMedidaRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indicadorRow", propOrder = {
    "bunId",
    "businessUnit",
    "divId",
    "estId",
    "indClave",
    "indConsolida",
    "indDescripcion",
    "indFecAct",
    "indFecReg",
    "indFormula",
    "indFormulaCal",
    "indFormulaVar",
    "indFrecuencia",
    "indId",
    "indNombre",
    "indSigno",
    "indStatus",
    "indTipo",
    "indTipoDesc",
    "indUsuAct",
    "indUsuReg",
    "measureId",
    "perfAreaId",
    "ranId",
    "ranSentido",
    "rango",
    "umeId",
    "unidadMedidaRow"
})
@XmlSeeAlso({
    IndicadorDesviacionRow.class
})
public class IndicadorRow {

    @XmlElement(name = "bun_id")
    protected Integer bunId;
    protected BusinessUnitRow businessUnit;
    @XmlElement(name = "div_id")
    protected Integer divId;
    @XmlElement(name = "est_id")
    protected Integer estId;
    @XmlElement(name = "ind_clave")
    protected String indClave;
    @XmlElement(name = "ind_consolida")
    protected MultivaluadaRow indConsolida;
    @XmlElement(name = "ind_descripcion")
    protected String indDescripcion;
    @XmlElement(name = "ind_fec_act")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar indFecAct;
    @XmlElement(name = "ind_fec_reg")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar indFecReg;
    @XmlElement(name = "ind_formula")
    protected String indFormula;
    @XmlElement(name = "ind_formula_cal")
    protected String indFormulaCal;
    @XmlElement(name = "ind_formula_var")
    protected String indFormulaVar;
    @XmlElement(name = "ind_frecuencia")
    protected MultivaluadaRow indFrecuencia;
    @XmlElement(name = "ind_id")
    protected Integer indId;
    @XmlElement(name = "ind_nombre")
    protected String indNombre;
    @XmlElement(name = "ind_signo")
    protected MultivaluadaRow indSigno;
    @XmlElement(name = "ind_status")
    protected MultivaluadaRow indStatus;
    @XmlElement(name = "ind_tipo")
    protected MultivaluadaRow indTipo;
    @XmlElement(name = "ind_tipo_desc")
    protected String indTipoDesc;
    @XmlElement(name = "ind_usu_act")
    protected String indUsuAct;
    @XmlElement(name = "ind_usu_reg")
    protected String indUsuReg;
    @XmlElement(name = "measure_id")
    protected Integer measureId;
    @XmlElement(name = "perf_area_id")
    protected Integer perfAreaId;
    @XmlElement(name = "ran_id")
    protected Integer ranId;
    @XmlElement(name = "ran_sentido")
    protected MultivaluadaRow ranSentido;
    protected RangoRow rango;
    @XmlElement(name = "ume_id")
    protected Short umeId;
    protected UnidadMedidaRow unidadMedidaRow;

    /**
     * Obtiene el valor de la propiedad bunId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBunId() {
        return bunId;
    }

    /**
     * Define el valor de la propiedad bunId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBunId(Integer value) {
        this.bunId = value;
    }

    /**
     * Obtiene el valor de la propiedad businessUnit.
     * 
     * @return
     *     possible object is
     *     {@link BusinessUnitRow }
     *     
     */
    public BusinessUnitRow getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Define el valor de la propiedad businessUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessUnitRow }
     *     
     */
    public void setBusinessUnit(BusinessUnitRow value) {
        this.businessUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad divId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDivId() {
        return divId;
    }

    /**
     * Define el valor de la propiedad divId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDivId(Integer value) {
        this.divId = value;
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
     * Obtiene el valor de la propiedad indClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndClave() {
        return indClave;
    }

    /**
     * Define el valor de la propiedad indClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndClave(String value) {
        this.indClave = value;
    }

    /**
     * Obtiene el valor de la propiedad indConsolida.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getIndConsolida() {
        return indConsolida;
    }

    /**
     * Define el valor de la propiedad indConsolida.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setIndConsolida(MultivaluadaRow value) {
        this.indConsolida = value;
    }

    /**
     * Obtiene el valor de la propiedad indDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndDescripcion() {
        return indDescripcion;
    }

    /**
     * Define el valor de la propiedad indDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndDescripcion(String value) {
        this.indDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad indFecAct.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIndFecAct() {
        return indFecAct;
    }

    /**
     * Define el valor de la propiedad indFecAct.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIndFecAct(XMLGregorianCalendar value) {
        this.indFecAct = value;
    }

    /**
     * Obtiene el valor de la propiedad indFecReg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIndFecReg() {
        return indFecReg;
    }

    /**
     * Define el valor de la propiedad indFecReg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIndFecReg(XMLGregorianCalendar value) {
        this.indFecReg = value;
    }

    /**
     * Obtiene el valor de la propiedad indFormula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndFormula() {
        return indFormula;
    }

    /**
     * Define el valor de la propiedad indFormula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndFormula(String value) {
        this.indFormula = value;
    }

    /**
     * Obtiene el valor de la propiedad indFormulaCal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndFormulaCal() {
        return indFormulaCal;
    }

    /**
     * Define el valor de la propiedad indFormulaCal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndFormulaCal(String value) {
        this.indFormulaCal = value;
    }

    /**
     * Obtiene el valor de la propiedad indFormulaVar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndFormulaVar() {
        return indFormulaVar;
    }

    /**
     * Define el valor de la propiedad indFormulaVar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndFormulaVar(String value) {
        this.indFormulaVar = value;
    }

    /**
     * Obtiene el valor de la propiedad indFrecuencia.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getIndFrecuencia() {
        return indFrecuencia;
    }

    /**
     * Define el valor de la propiedad indFrecuencia.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setIndFrecuencia(MultivaluadaRow value) {
        this.indFrecuencia = value;
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
     * Obtiene el valor de la propiedad indNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndNombre() {
        return indNombre;
    }

    /**
     * Define el valor de la propiedad indNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndNombre(String value) {
        this.indNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad indSigno.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getIndSigno() {
        return indSigno;
    }

    /**
     * Define el valor de la propiedad indSigno.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setIndSigno(MultivaluadaRow value) {
        this.indSigno = value;
    }

    /**
     * Obtiene el valor de la propiedad indStatus.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getIndStatus() {
        return indStatus;
    }

    /**
     * Define el valor de la propiedad indStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setIndStatus(MultivaluadaRow value) {
        this.indStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad indTipo.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getIndTipo() {
        return indTipo;
    }

    /**
     * Define el valor de la propiedad indTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setIndTipo(MultivaluadaRow value) {
        this.indTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad indTipoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndTipoDesc() {
        return indTipoDesc;
    }

    /**
     * Define el valor de la propiedad indTipoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndTipoDesc(String value) {
        this.indTipoDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad indUsuAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndUsuAct() {
        return indUsuAct;
    }

    /**
     * Define el valor de la propiedad indUsuAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndUsuAct(String value) {
        this.indUsuAct = value;
    }

    /**
     * Obtiene el valor de la propiedad indUsuReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndUsuReg() {
        return indUsuReg;
    }

    /**
     * Define el valor de la propiedad indUsuReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndUsuReg(String value) {
        this.indUsuReg = value;
    }

    /**
     * Obtiene el valor de la propiedad measureId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeasureId() {
        return measureId;
    }

    /**
     * Define el valor de la propiedad measureId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeasureId(Integer value) {
        this.measureId = value;
    }

    /**
     * Obtiene el valor de la propiedad perfAreaId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPerfAreaId() {
        return perfAreaId;
    }

    /**
     * Define el valor de la propiedad perfAreaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPerfAreaId(Integer value) {
        this.perfAreaId = value;
    }

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
     * Obtiene el valor de la propiedad rango.
     * 
     * @return
     *     possible object is
     *     {@link RangoRow }
     *     
     */
    public RangoRow getRango() {
        return rango;
    }

    /**
     * Define el valor de la propiedad rango.
     * 
     * @param value
     *     allowed object is
     *     {@link RangoRow }
     *     
     */
    public void setRango(RangoRow value) {
        this.rango = value;
    }

    /**
     * Obtiene el valor de la propiedad umeId.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUmeId() {
        return umeId;
    }

    /**
     * Define el valor de la propiedad umeId.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUmeId(Short value) {
        this.umeId = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadMedidaRow.
     * 
     * @return
     *     possible object is
     *     {@link UnidadMedidaRow }
     *     
     */
    public UnidadMedidaRow getUnidadMedidaRow() {
        return unidadMedidaRow;
    }

    /**
     * Define el valor de la propiedad unidadMedidaRow.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadMedidaRow }
     *     
     */
    public void setUnidadMedidaRow(UnidadMedidaRow value) {
        this.unidadMedidaRow = value;
    }

}
