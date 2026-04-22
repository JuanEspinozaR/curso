
package mx.penoles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para asuntoRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asuntoRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pendienteList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pendienteList" type="{http://service.reunion.bsc.penoles/}pendienteRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="asi_id_expositor" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="asu_descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asu_duracion" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="asu_duracion_real" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="asu_fec_act" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="asu_fec_fin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="asu_fec_inicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="asu_fec_reg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="asu_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="asu_id_key" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="asu_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asu_notas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asu_orden" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="asu_status" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="asu_tipo" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="asu_usu_act" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asu_usu_reg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentoList" type="{http://service.reunion.bsc.penoles/}documentoRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ent_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ent_id_padre" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ent_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidadAsunto" type="{http://service.reunion.bsc.penoles/}entidadRow" minOccurs="0"/>
 *         &lt;element name="expositor" type="{http://service.reunion.bsc.penoles/}asistenteRow" minOccurs="0"/>
 *         &lt;element name="indicadorDesviacionList" type="{http://service.reunion.bsc.penoles/}indicadorDesviacionRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pen_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pendiente" type="{http://service.reunion.bsc.penoles/}pendienteRow" minOccurs="0"/>
 *         &lt;element name="reu_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reunion" type="{http://service.reunion.bsc.penoles/}reunionRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asuntoRow", propOrder = {
    "pendienteList",
    "asiIdExpositor",
    "asuDescripcion",
    "asuDuracion",
    "asuDuracionReal",
    "asuFecAct",
    "asuFecFin",
    "asuFecInicio",
    "asuFecReg",
    "asuId",
    "asuIdKey",
    "asuNombre",
    "asuNotas",
    "asuOrden",
    "asuStatus",
    "asuTipo",
    "asuUsuAct",
    "asuUsuReg",
    "documentoList",
    "entId",
    "entIdPadre",
    "entNombre",
    "entidadAsunto",
    "expositor",
    "indicadorDesviacionList",
    "penId",
    "pendiente",
    "reuId",
    "reunion"
})
@XmlSeeAlso({
    AsuntoServiceRow.class
})
public class AsuntoRow {

    @XmlElement(required = true)
    protected AsuntoRow.PendienteList pendienteList;
    @XmlElement(name = "asi_id_expositor")
    protected Short asiIdExpositor;
    @XmlElement(name = "asu_descripcion")
    protected String asuDescripcion;
    @XmlElement(name = "asu_duracion")
    protected Short asuDuracion;
    @XmlElement(name = "asu_duracion_real")
    protected Short asuDuracionReal;
    @XmlElement(name = "asu_fec_act")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asuFecAct;
    @XmlElement(name = "asu_fec_fin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asuFecFin;
    @XmlElement(name = "asu_fec_inicio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asuFecInicio;
    @XmlElement(name = "asu_fec_reg")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asuFecReg;
    @XmlElement(name = "asu_id")
    protected Short asuId;
    @XmlElement(name = "asu_id_key")
    protected Short asuIdKey;
    @XmlElement(name = "asu_nombre")
    protected String asuNombre;
    @XmlElement(name = "asu_notas")
    protected String asuNotas;
    @XmlElement(name = "asu_orden")
    protected Short asuOrden;
    @XmlElement(name = "asu_status")
    protected MultivaluadaRow asuStatus;
    @XmlElement(name = "asu_tipo")
    protected MultivaluadaRow asuTipo;
    @XmlElement(name = "asu_usu_act")
    protected String asuUsuAct;
    @XmlElement(name = "asu_usu_reg")
    protected String asuUsuReg;
    @XmlElement(nillable = true)
    protected List<DocumentoRow> documentoList;
    @XmlElement(name = "ent_id")
    protected Integer entId;
    @XmlElement(name = "ent_id_padre")
    protected Integer entIdPadre;
    @XmlElement(name = "ent_nombre")
    protected String entNombre;
    protected EntidadRow entidadAsunto;
    protected AsistenteRow expositor;
    @XmlElement(nillable = true)
    protected List<IndicadorDesviacionRow> indicadorDesviacionList;
    @XmlElement(name = "pen_id")
    protected Integer penId;
    protected PendienteRow pendiente;
    @XmlElement(name = "reu_id")
    protected Integer reuId;
    protected ReunionRow reunion;

    /**
     * Obtiene el valor de la propiedad pendienteList.
     * 
     * @return
     *     possible object is
     *     {@link AsuntoRow.PendienteList }
     *     
     */
    public AsuntoRow.PendienteList getPendienteList() {
        return pendienteList;
    }

    /**
     * Define el valor de la propiedad pendienteList.
     * 
     * @param value
     *     allowed object is
     *     {@link AsuntoRow.PendienteList }
     *     
     */
    public void setPendienteList(AsuntoRow.PendienteList value) {
        this.pendienteList = value;
    }

    /**
     * Obtiene el valor de la propiedad asiIdExpositor.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAsiIdExpositor() {
        return asiIdExpositor;
    }

    /**
     * Define el valor de la propiedad asiIdExpositor.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAsiIdExpositor(Short value) {
        this.asiIdExpositor = value;
    }

    /**
     * Obtiene el valor de la propiedad asuDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsuDescripcion() {
        return asuDescripcion;
    }

    /**
     * Define el valor de la propiedad asuDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsuDescripcion(String value) {
        this.asuDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad asuDuracion.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAsuDuracion() {
        return asuDuracion;
    }

    /**
     * Define el valor de la propiedad asuDuracion.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAsuDuracion(Short value) {
        this.asuDuracion = value;
    }

    /**
     * Obtiene el valor de la propiedad asuDuracionReal.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAsuDuracionReal() {
        return asuDuracionReal;
    }

    /**
     * Define el valor de la propiedad asuDuracionReal.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAsuDuracionReal(Short value) {
        this.asuDuracionReal = value;
    }

    /**
     * Obtiene el valor de la propiedad asuFecAct.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsuFecAct() {
        return asuFecAct;
    }

    /**
     * Define el valor de la propiedad asuFecAct.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsuFecAct(XMLGregorianCalendar value) {
        this.asuFecAct = value;
    }

    /**
     * Obtiene el valor de la propiedad asuFecFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsuFecFin() {
        return asuFecFin;
    }

    /**
     * Define el valor de la propiedad asuFecFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsuFecFin(XMLGregorianCalendar value) {
        this.asuFecFin = value;
    }

    /**
     * Obtiene el valor de la propiedad asuFecInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsuFecInicio() {
        return asuFecInicio;
    }

    /**
     * Define el valor de la propiedad asuFecInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsuFecInicio(XMLGregorianCalendar value) {
        this.asuFecInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad asuFecReg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsuFecReg() {
        return asuFecReg;
    }

    /**
     * Define el valor de la propiedad asuFecReg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsuFecReg(XMLGregorianCalendar value) {
        this.asuFecReg = value;
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
     * Obtiene el valor de la propiedad asuIdKey.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAsuIdKey() {
        return asuIdKey;
    }

    /**
     * Define el valor de la propiedad asuIdKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAsuIdKey(Short value) {
        this.asuIdKey = value;
    }

    /**
     * Obtiene el valor de la propiedad asuNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsuNombre() {
        return asuNombre;
    }

    /**
     * Define el valor de la propiedad asuNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsuNombre(String value) {
        this.asuNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad asuNotas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsuNotas() {
        return asuNotas;
    }

    /**
     * Define el valor de la propiedad asuNotas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsuNotas(String value) {
        this.asuNotas = value;
    }

    /**
     * Obtiene el valor de la propiedad asuOrden.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAsuOrden() {
        return asuOrden;
    }

    /**
     * Define el valor de la propiedad asuOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAsuOrden(Short value) {
        this.asuOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad asuStatus.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getAsuStatus() {
        return asuStatus;
    }

    /**
     * Define el valor de la propiedad asuStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setAsuStatus(MultivaluadaRow value) {
        this.asuStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad asuTipo.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getAsuTipo() {
        return asuTipo;
    }

    /**
     * Define el valor de la propiedad asuTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setAsuTipo(MultivaluadaRow value) {
        this.asuTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad asuUsuAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsuUsuAct() {
        return asuUsuAct;
    }

    /**
     * Define el valor de la propiedad asuUsuAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsuUsuAct(String value) {
        this.asuUsuAct = value;
    }

    /**
     * Obtiene el valor de la propiedad asuUsuReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsuUsuReg() {
        return asuUsuReg;
    }

    /**
     * Define el valor de la propiedad asuUsuReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsuUsuReg(String value) {
        this.asuUsuReg = value;
    }

    /**
     * Gets the value of the documentoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoRow }
     * 
     * 
     */
    public List<DocumentoRow> getDocumentoList() {
        if (documentoList == null) {
            documentoList = new ArrayList<DocumentoRow>();
        }
        return this.documentoList;
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
     * Obtiene el valor de la propiedad entidadAsunto.
     * 
     * @return
     *     possible object is
     *     {@link EntidadRow }
     *     
     */
    public EntidadRow getEntidadAsunto() {
        return entidadAsunto;
    }

    /**
     * Define el valor de la propiedad entidadAsunto.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadRow }
     *     
     */
    public void setEntidadAsunto(EntidadRow value) {
        this.entidadAsunto = value;
    }

    /**
     * Obtiene el valor de la propiedad expositor.
     * 
     * @return
     *     possible object is
     *     {@link AsistenteRow }
     *     
     */
    public AsistenteRow getExpositor() {
        return expositor;
    }

    /**
     * Define el valor de la propiedad expositor.
     * 
     * @param value
     *     allowed object is
     *     {@link AsistenteRow }
     *     
     */
    public void setExpositor(AsistenteRow value) {
        this.expositor = value;
    }

    /**
     * Gets the value of the indicadorDesviacionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicadorDesviacionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicadorDesviacionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndicadorDesviacionRow }
     * 
     * 
     */
    public List<IndicadorDesviacionRow> getIndicadorDesviacionList() {
        if (indicadorDesviacionList == null) {
            indicadorDesviacionList = new ArrayList<IndicadorDesviacionRow>();
        }
        return this.indicadorDesviacionList;
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
     * Obtiene el valor de la propiedad pendiente.
     * 
     * @return
     *     possible object is
     *     {@link PendienteRow }
     *     
     */
    public PendienteRow getPendiente() {
        return pendiente;
    }

    /**
     * Define el valor de la propiedad pendiente.
     * 
     * @param value
     *     allowed object is
     *     {@link PendienteRow }
     *     
     */
    public void setPendiente(PendienteRow value) {
        this.pendiente = value;
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
     * Obtiene el valor de la propiedad reunion.
     * 
     * @return
     *     possible object is
     *     {@link ReunionRow }
     *     
     */
    public ReunionRow getReunion() {
        return reunion;
    }

    /**
     * Define el valor de la propiedad reunion.
     * 
     * @param value
     *     allowed object is
     *     {@link ReunionRow }
     *     
     */
    public void setReunion(ReunionRow value) {
        this.reunion = value;
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
     *         &lt;element name="pendienteList" type="{http://service.reunion.bsc.penoles/}pendienteRow" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<PendienteRow> pendienteList;

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
         * {@link PendienteRow }
         * 
         * 
         */
        public List<PendienteRow> getPendienteList() {
            if (pendienteList == null) {
                pendienteList = new ArrayList<PendienteRow>();
            }
            return this.pendienteList;
        }

    }

}
