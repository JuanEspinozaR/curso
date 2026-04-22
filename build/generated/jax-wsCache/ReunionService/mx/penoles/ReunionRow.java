
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
 * <p>Clase Java para reunionRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reunionRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asistenteList" type="{http://service.reunion.bsc.penoles/}asistenteRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="asuntoList" type="{http://service.reunion.bsc.penoles/}asuntoRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contextPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentoList" type="{http://service.reunion.bsc.penoles/}documentoRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ent_clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ent_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entidadRow" type="{http://service.reunion.bsc.penoles/}entidadRow" minOccurs="0"/>
 *         &lt;element name="realContextPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reu_aviso_cambios" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reu_comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reu_comentario_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reu_duracion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reu_duracion_min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reu_duracion_min_real" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reu_fec_act" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reu_fec_fin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reu_fec_inicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reu_fec_pendientes" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reu_fec_reg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reu_fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reu_fecha_fin_estimada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reu_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reu_id_anterior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reu_id_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reu_pen_activados" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reu_status" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="reu_status_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reu_tip_cambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reu_tipo" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="reu_tipo_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reu_ubicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reu_usu_act" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reu_usu_reg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reunionAnteriorRow" type="{http://service.reunion.bsc.penoles/}reunionRow" minOccurs="0"/>
 *         &lt;element name="serverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serverPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usu_cve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reunionRow", propOrder = {
    "asistenteList",
    "asuntoList",
    "contextPath",
    "documentoList",
    "entClave",
    "entId",
    "entidadRow",
    "realContextPath",
    "reuAvisoCambios",
    "reuComentario",
    "reuComentarioDesc",
    "reuDuracion",
    "reuDuracionMin",
    "reuDuracionMinReal",
    "reuFecAct",
    "reuFecFin",
    "reuFecInicio",
    "reuFecPendientes",
    "reuFecReg",
    "reuFecha",
    "reuFechaFinEstimada",
    "reuId",
    "reuIdAnterior",
    "reuIdDesc",
    "reuPenActivados",
    "reuStatus",
    "reuStatusDesc",
    "reuTipCambio",
    "reuTipo",
    "reuTipoDesc",
    "reuUbicacion",
    "reuUsuAct",
    "reuUsuReg",
    "reunionAnteriorRow",
    "serverName",
    "serverPort",
    "usuCve"
})
public class ReunionRow {

    @XmlElement(nillable = true)
    protected List<AsistenteRow> asistenteList;
    @XmlElement(nillable = true)
    protected List<AsuntoRow> asuntoList;
    protected String contextPath;
    @XmlElement(nillable = true)
    protected List<DocumentoRow> documentoList;
    @XmlElement(name = "ent_clave")
    protected String entClave;
    @XmlElement(name = "ent_id")
    protected Integer entId;
    protected EntidadRow entidadRow;
    protected String realContextPath;
    @XmlElement(name = "reu_aviso_cambios")
    protected boolean reuAvisoCambios;
    @XmlElement(name = "reu_comentario")
    protected String reuComentario;
    @XmlElement(name = "reu_comentario_desc")
    protected String reuComentarioDesc;
    @XmlElement(name = "reu_duracion")
    protected Integer reuDuracion;
    @XmlElement(name = "reu_duracion_min")
    protected Integer reuDuracionMin;
    @XmlElement(name = "reu_duracion_min_real")
    protected String reuDuracionMinReal;
    @XmlElement(name = "reu_fec_act")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reuFecAct;
    @XmlElement(name = "reu_fec_fin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reuFecFin;
    @XmlElement(name = "reu_fec_inicio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reuFecInicio;
    @XmlElement(name = "reu_fec_pendientes")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reuFecPendientes;
    @XmlElement(name = "reu_fec_reg")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reuFecReg;
    @XmlElement(name = "reu_fecha")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reuFecha;
    @XmlElement(name = "reu_fecha_fin_estimada")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reuFechaFinEstimada;
    @XmlElement(name = "reu_id")
    protected Integer reuId;
    @XmlElement(name = "reu_id_anterior")
    protected Integer reuIdAnterior;
    @XmlElement(name = "reu_id_desc")
    protected String reuIdDesc;
    @XmlElement(name = "reu_pen_activados")
    protected boolean reuPenActivados;
    @XmlElement(name = "reu_status")
    protected MultivaluadaRow reuStatus;
    @XmlElement(name = "reu_status_desc")
    protected String reuStatusDesc;
    @XmlElement(name = "reu_tip_cambio")
    protected String reuTipCambio;
    @XmlElement(name = "reu_tipo")
    protected MultivaluadaRow reuTipo;
    @XmlElement(name = "reu_tipo_desc")
    protected String reuTipoDesc;
    @XmlElement(name = "reu_ubicacion")
    protected String reuUbicacion;
    @XmlElement(name = "reu_usu_act")
    protected String reuUsuAct;
    @XmlElement(name = "reu_usu_reg")
    protected String reuUsuReg;
    protected ReunionRow reunionAnteriorRow;
    protected String serverName;
    protected Integer serverPort;
    @XmlElement(name = "usu_cve")
    protected String usuCve;

    /**
     * Gets the value of the asistenteList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asistenteList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsistenteList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AsistenteRow }
     * 
     * 
     */
    public List<AsistenteRow> getAsistenteList() {
        if (asistenteList == null) {
            asistenteList = new ArrayList<AsistenteRow>();
        }
        return this.asistenteList;
    }

    /**
     * Gets the value of the asuntoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asuntoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsuntoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AsuntoRow }
     * 
     * 
     */
    public List<AsuntoRow> getAsuntoList() {
        if (asuntoList == null) {
            asuntoList = new ArrayList<AsuntoRow>();
        }
        return this.asuntoList;
    }

    /**
     * Obtiene el valor de la propiedad contextPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextPath() {
        return contextPath;
    }

    /**
     * Define el valor de la propiedad contextPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextPath(String value) {
        this.contextPath = value;
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
     * Obtiene el valor de la propiedad entClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntClave() {
        return entClave;
    }

    /**
     * Define el valor de la propiedad entClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntClave(String value) {
        this.entClave = value;
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
     * Obtiene el valor de la propiedad entidadRow.
     * 
     * @return
     *     possible object is
     *     {@link EntidadRow }
     *     
     */
    public EntidadRow getEntidadRow() {
        return entidadRow;
    }

    /**
     * Define el valor de la propiedad entidadRow.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadRow }
     *     
     */
    public void setEntidadRow(EntidadRow value) {
        this.entidadRow = value;
    }

    /**
     * Obtiene el valor de la propiedad realContextPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealContextPath() {
        return realContextPath;
    }

    /**
     * Define el valor de la propiedad realContextPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealContextPath(String value) {
        this.realContextPath = value;
    }

    /**
     * Obtiene el valor de la propiedad reuAvisoCambios.
     * 
     */
    public boolean isReuAvisoCambios() {
        return reuAvisoCambios;
    }

    /**
     * Define el valor de la propiedad reuAvisoCambios.
     * 
     */
    public void setReuAvisoCambios(boolean value) {
        this.reuAvisoCambios = value;
    }

    /**
     * Obtiene el valor de la propiedad reuComentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuComentario() {
        return reuComentario;
    }

    /**
     * Define el valor de la propiedad reuComentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuComentario(String value) {
        this.reuComentario = value;
    }

    /**
     * Obtiene el valor de la propiedad reuComentarioDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuComentarioDesc() {
        return reuComentarioDesc;
    }

    /**
     * Define el valor de la propiedad reuComentarioDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuComentarioDesc(String value) {
        this.reuComentarioDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad reuDuracion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReuDuracion() {
        return reuDuracion;
    }

    /**
     * Define el valor de la propiedad reuDuracion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReuDuracion(Integer value) {
        this.reuDuracion = value;
    }

    /**
     * Obtiene el valor de la propiedad reuDuracionMin.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReuDuracionMin() {
        return reuDuracionMin;
    }

    /**
     * Define el valor de la propiedad reuDuracionMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReuDuracionMin(Integer value) {
        this.reuDuracionMin = value;
    }

    /**
     * Obtiene el valor de la propiedad reuDuracionMinReal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuDuracionMinReal() {
        return reuDuracionMinReal;
    }

    /**
     * Define el valor de la propiedad reuDuracionMinReal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuDuracionMinReal(String value) {
        this.reuDuracionMinReal = value;
    }

    /**
     * Obtiene el valor de la propiedad reuFecAct.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReuFecAct() {
        return reuFecAct;
    }

    /**
     * Define el valor de la propiedad reuFecAct.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReuFecAct(XMLGregorianCalendar value) {
        this.reuFecAct = value;
    }

    /**
     * Obtiene el valor de la propiedad reuFecFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReuFecFin() {
        return reuFecFin;
    }

    /**
     * Define el valor de la propiedad reuFecFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReuFecFin(XMLGregorianCalendar value) {
        this.reuFecFin = value;
    }

    /**
     * Obtiene el valor de la propiedad reuFecInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReuFecInicio() {
        return reuFecInicio;
    }

    /**
     * Define el valor de la propiedad reuFecInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReuFecInicio(XMLGregorianCalendar value) {
        this.reuFecInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad reuFecPendientes.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReuFecPendientes() {
        return reuFecPendientes;
    }

    /**
     * Define el valor de la propiedad reuFecPendientes.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReuFecPendientes(XMLGregorianCalendar value) {
        this.reuFecPendientes = value;
    }

    /**
     * Obtiene el valor de la propiedad reuFecReg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReuFecReg() {
        return reuFecReg;
    }

    /**
     * Define el valor de la propiedad reuFecReg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReuFecReg(XMLGregorianCalendar value) {
        this.reuFecReg = value;
    }

    /**
     * Obtiene el valor de la propiedad reuFecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReuFecha() {
        return reuFecha;
    }

    /**
     * Define el valor de la propiedad reuFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReuFecha(XMLGregorianCalendar value) {
        this.reuFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad reuFechaFinEstimada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReuFechaFinEstimada() {
        return reuFechaFinEstimada;
    }

    /**
     * Define el valor de la propiedad reuFechaFinEstimada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReuFechaFinEstimada(XMLGregorianCalendar value) {
        this.reuFechaFinEstimada = value;
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
     * Obtiene el valor de la propiedad reuIdAnterior.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReuIdAnterior() {
        return reuIdAnterior;
    }

    /**
     * Define el valor de la propiedad reuIdAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReuIdAnterior(Integer value) {
        this.reuIdAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad reuIdDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuIdDesc() {
        return reuIdDesc;
    }

    /**
     * Define el valor de la propiedad reuIdDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuIdDesc(String value) {
        this.reuIdDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad reuPenActivados.
     * 
     */
    public boolean isReuPenActivados() {
        return reuPenActivados;
    }

    /**
     * Define el valor de la propiedad reuPenActivados.
     * 
     */
    public void setReuPenActivados(boolean value) {
        this.reuPenActivados = value;
    }

    /**
     * Obtiene el valor de la propiedad reuStatus.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getReuStatus() {
        return reuStatus;
    }

    /**
     * Define el valor de la propiedad reuStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setReuStatus(MultivaluadaRow value) {
        this.reuStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad reuStatusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuStatusDesc() {
        return reuStatusDesc;
    }

    /**
     * Define el valor de la propiedad reuStatusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuStatusDesc(String value) {
        this.reuStatusDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad reuTipCambio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuTipCambio() {
        return reuTipCambio;
    }

    /**
     * Define el valor de la propiedad reuTipCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuTipCambio(String value) {
        this.reuTipCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad reuTipo.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getReuTipo() {
        return reuTipo;
    }

    /**
     * Define el valor de la propiedad reuTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setReuTipo(MultivaluadaRow value) {
        this.reuTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad reuTipoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuTipoDesc() {
        return reuTipoDesc;
    }

    /**
     * Define el valor de la propiedad reuTipoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuTipoDesc(String value) {
        this.reuTipoDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad reuUbicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuUbicacion() {
        return reuUbicacion;
    }

    /**
     * Define el valor de la propiedad reuUbicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuUbicacion(String value) {
        this.reuUbicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad reuUsuAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuUsuAct() {
        return reuUsuAct;
    }

    /**
     * Define el valor de la propiedad reuUsuAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuUsuAct(String value) {
        this.reuUsuAct = value;
    }

    /**
     * Obtiene el valor de la propiedad reuUsuReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReuUsuReg() {
        return reuUsuReg;
    }

    /**
     * Define el valor de la propiedad reuUsuReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReuUsuReg(String value) {
        this.reuUsuReg = value;
    }

    /**
     * Obtiene el valor de la propiedad reunionAnteriorRow.
     * 
     * @return
     *     possible object is
     *     {@link ReunionRow }
     *     
     */
    public ReunionRow getReunionAnteriorRow() {
        return reunionAnteriorRow;
    }

    /**
     * Define el valor de la propiedad reunionAnteriorRow.
     * 
     * @param value
     *     allowed object is
     *     {@link ReunionRow }
     *     
     */
    public void setReunionAnteriorRow(ReunionRow value) {
        this.reunionAnteriorRow = value;
    }

    /**
     * Obtiene el valor de la propiedad serverName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Define el valor de la propiedad serverName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    /**
     * Obtiene el valor de la propiedad serverPort.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServerPort() {
        return serverPort;
    }

    /**
     * Define el valor de la propiedad serverPort.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServerPort(Integer value) {
        this.serverPort = value;
    }

    /**
     * Obtiene el valor de la propiedad usuCve.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuCve() {
        return usuCve;
    }

    /**
     * Define el valor de la propiedad usuCve.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuCve(String value) {
        this.usuCve = value;
    }

}
