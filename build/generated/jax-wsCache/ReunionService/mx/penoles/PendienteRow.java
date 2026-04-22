
package mx.penoles;

import java.math.BigDecimal;
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
 * <p>Clase Java para pendienteRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pendienteRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responsableList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="responsableList" type="{http://service.reunion.bsc.penoles/}responsableRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="seguimientoList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="seguimientoList" type="{http://service.reunion.bsc.penoles/}seguimientoRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="documentosList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="documentosList" type="{http://service.reunion.bsc.penoles/}documentoRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="adjuntoCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="asu_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="asunto" type="{http://service.reunion.bsc.penoles/}asuntoRow" minOccurs="0"/>
 *         &lt;element name="ent_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ent_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidad" type="{http://service.reunion.bsc.penoles/}entidadRow" minOccurs="0"/>
 *         &lt;element name="ind_clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_avance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pen_clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_clave_aux" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_entregable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_fec_act" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pen_fec_fin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pen_fec_inicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pen_fec_objetivo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pen_fec_reg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pen_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pen_id_key" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pen_id_mes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pen_id_proyecto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pen_objetivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_salud" type="{http://service.reunion.bsc.penoles/}pendienteHealth" minOccurs="0"/>
 *         &lt;element name="pen_status" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="pen_status_old" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="pen_tip_entregable" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="pen_tip_pendiente" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="pen_tipo" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="pen_url_administracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_url_seguimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_usu_act" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_usu_reg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proyecto" type="{http://service.reunion.bsc.penoles/}proyectoRow" minOccurs="0"/>
 *         &lt;element name="reu_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reunion" type="{http://service.reunion.bsc.penoles/}reunionRow" minOccurs="0"/>
 *         &lt;element name="rol_responsable" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pendienteRow", propOrder = {
    "responsableList",
    "seguimientoList",
    "documentosList",
    "adjuntoCount",
    "asuId",
    "asunto",
    "entId",
    "entNombre",
    "entidad",
    "indClave",
    "penAvance",
    "penClave",
    "penClaveAux",
    "penComentario",
    "penDescripcion",
    "penEntregable",
    "penFecAct",
    "penFecFin",
    "penFecInicio",
    "penFecObjetivo",
    "penFecReg",
    "penId",
    "penIdKey",
    "penIdMes",
    "penIdProyecto",
    "penObjetivo",
    "penSalud",
    "penStatus",
    "penStatusOld",
    "penTipEntregable",
    "penTipPendiente",
    "penTipo",
    "penUrlAdministracion",
    "penUrlSeguimiento",
    "penUsuAct",
    "penUsuReg",
    "proyecto",
    "reuId",
    "reunion",
    "rolResponsable"
})
@XmlSeeAlso({
    PendienteServiceRow.class,
    ProyectoRow.class
})
public class PendienteRow {

    @XmlElement(required = true)
    protected PendienteRow.ResponsableList responsableList;
    @XmlElement(required = true)
    protected PendienteRow.SeguimientoList seguimientoList;
    @XmlElement(required = true)
    protected PendienteRow.DocumentosList documentosList;
    protected Integer adjuntoCount;
    @XmlElement(name = "asu_id")
    protected Short asuId;
    protected AsuntoRow asunto;
    @XmlElement(name = "ent_id")
    protected Integer entId;
    @XmlElement(name = "ent_nombre")
    protected String entNombre;
    protected EntidadRow entidad;
    @XmlElement(name = "ind_clave")
    protected String indClave;
    @XmlElement(name = "pen_avance")
    protected BigDecimal penAvance;
    @XmlElement(name = "pen_clave")
    protected String penClave;
    @XmlElement(name = "pen_clave_aux")
    protected String penClaveAux;
    @XmlElement(name = "pen_comentario")
    protected String penComentario;
    @XmlElement(name = "pen_descripcion")
    protected String penDescripcion;
    @XmlElement(name = "pen_entregable")
    protected String penEntregable;
    @XmlElement(name = "pen_fec_act")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar penFecAct;
    @XmlElement(name = "pen_fec_fin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar penFecFin;
    @XmlElement(name = "pen_fec_inicio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar penFecInicio;
    @XmlElement(name = "pen_fec_objetivo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar penFecObjetivo;
    @XmlElement(name = "pen_fec_reg")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar penFecReg;
    @XmlElement(name = "pen_id")
    protected Integer penId;
    @XmlElement(name = "pen_id_key")
    protected Integer penIdKey;
    @XmlElement(name = "pen_id_mes")
    protected Integer penIdMes;
    @XmlElement(name = "pen_id_proyecto")
    protected Integer penIdProyecto;
    @XmlElement(name = "pen_objetivo")
    protected String penObjetivo;
    @XmlElement(name = "pen_salud")
    protected PendienteHealth penSalud;
    @XmlElement(name = "pen_status")
    protected MultivaluadaRow penStatus;
    @XmlElement(name = "pen_status_old")
    protected MultivaluadaRow penStatusOld;
    @XmlElement(name = "pen_tip_entregable")
    protected MultivaluadaRow penTipEntregable;
    @XmlElement(name = "pen_tip_pendiente")
    protected MultivaluadaRow penTipPendiente;
    @XmlElement(name = "pen_tipo")
    protected MultivaluadaRow penTipo;
    @XmlElement(name = "pen_url_administracion")
    protected String penUrlAdministracion;
    @XmlElement(name = "pen_url_seguimiento")
    protected String penUrlSeguimiento;
    @XmlElement(name = "pen_usu_act")
    protected String penUsuAct;
    @XmlElement(name = "pen_usu_reg")
    protected String penUsuReg;
    protected ProyectoRow proyecto;
    @XmlElement(name = "reu_id")
    protected Integer reuId;
    protected ReunionRow reunion;
    @XmlElement(name = "rol_responsable")
    protected MultivaluadaRow rolResponsable;

    /**
     * Obtiene el valor de la propiedad responsableList.
     * 
     * @return
     *     possible object is
     *     {@link PendienteRow.ResponsableList }
     *     
     */
    public PendienteRow.ResponsableList getResponsableList() {
        return responsableList;
    }

    /**
     * Define el valor de la propiedad responsableList.
     * 
     * @param value
     *     allowed object is
     *     {@link PendienteRow.ResponsableList }
     *     
     */
    public void setResponsableList(PendienteRow.ResponsableList value) {
        this.responsableList = value;
    }

    /**
     * Obtiene el valor de la propiedad seguimientoList.
     * 
     * @return
     *     possible object is
     *     {@link PendienteRow.SeguimientoList }
     *     
     */
    public PendienteRow.SeguimientoList getSeguimientoList() {
        return seguimientoList;
    }

    /**
     * Define el valor de la propiedad seguimientoList.
     * 
     * @param value
     *     allowed object is
     *     {@link PendienteRow.SeguimientoList }
     *     
     */
    public void setSeguimientoList(PendienteRow.SeguimientoList value) {
        this.seguimientoList = value;
    }

    /**
     * Obtiene el valor de la propiedad documentosList.
     * 
     * @return
     *     possible object is
     *     {@link PendienteRow.DocumentosList }
     *     
     */
    public PendienteRow.DocumentosList getDocumentosList() {
        return documentosList;
    }

    /**
     * Define el valor de la propiedad documentosList.
     * 
     * @param value
     *     allowed object is
     *     {@link PendienteRow.DocumentosList }
     *     
     */
    public void setDocumentosList(PendienteRow.DocumentosList value) {
        this.documentosList = value;
    }

    /**
     * Obtiene el valor de la propiedad adjuntoCount.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdjuntoCount() {
        return adjuntoCount;
    }

    /**
     * Define el valor de la propiedad adjuntoCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdjuntoCount(Integer value) {
        this.adjuntoCount = value;
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
     * Obtiene el valor de la propiedad penAvance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenAvance() {
        return penAvance;
    }

    /**
     * Define el valor de la propiedad penAvance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenAvance(BigDecimal value) {
        this.penAvance = value;
    }

    /**
     * Obtiene el valor de la propiedad penClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenClave() {
        return penClave;
    }

    /**
     * Define el valor de la propiedad penClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenClave(String value) {
        this.penClave = value;
    }

    /**
     * Obtiene el valor de la propiedad penClaveAux.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenClaveAux() {
        return penClaveAux;
    }

    /**
     * Define el valor de la propiedad penClaveAux.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenClaveAux(String value) {
        this.penClaveAux = value;
    }

    /**
     * Obtiene el valor de la propiedad penComentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenComentario() {
        return penComentario;
    }

    /**
     * Define el valor de la propiedad penComentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenComentario(String value) {
        this.penComentario = value;
    }

    /**
     * Obtiene el valor de la propiedad penDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenDescripcion() {
        return penDescripcion;
    }

    /**
     * Define el valor de la propiedad penDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenDescripcion(String value) {
        this.penDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad penEntregable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenEntregable() {
        return penEntregable;
    }

    /**
     * Define el valor de la propiedad penEntregable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenEntregable(String value) {
        this.penEntregable = value;
    }

    /**
     * Obtiene el valor de la propiedad penFecAct.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPenFecAct() {
        return penFecAct;
    }

    /**
     * Define el valor de la propiedad penFecAct.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPenFecAct(XMLGregorianCalendar value) {
        this.penFecAct = value;
    }

    /**
     * Obtiene el valor de la propiedad penFecFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPenFecFin() {
        return penFecFin;
    }

    /**
     * Define el valor de la propiedad penFecFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPenFecFin(XMLGregorianCalendar value) {
        this.penFecFin = value;
    }

    /**
     * Obtiene el valor de la propiedad penFecInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPenFecInicio() {
        return penFecInicio;
    }

    /**
     * Define el valor de la propiedad penFecInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPenFecInicio(XMLGregorianCalendar value) {
        this.penFecInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad penFecObjetivo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPenFecObjetivo() {
        return penFecObjetivo;
    }

    /**
     * Define el valor de la propiedad penFecObjetivo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPenFecObjetivo(XMLGregorianCalendar value) {
        this.penFecObjetivo = value;
    }

    /**
     * Obtiene el valor de la propiedad penFecReg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPenFecReg() {
        return penFecReg;
    }

    /**
     * Define el valor de la propiedad penFecReg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPenFecReg(XMLGregorianCalendar value) {
        this.penFecReg = value;
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
     * Obtiene el valor de la propiedad penIdKey.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPenIdKey() {
        return penIdKey;
    }

    /**
     * Define el valor de la propiedad penIdKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPenIdKey(Integer value) {
        this.penIdKey = value;
    }

    /**
     * Obtiene el valor de la propiedad penIdMes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPenIdMes() {
        return penIdMes;
    }

    /**
     * Define el valor de la propiedad penIdMes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPenIdMes(Integer value) {
        this.penIdMes = value;
    }

    /**
     * Obtiene el valor de la propiedad penIdProyecto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPenIdProyecto() {
        return penIdProyecto;
    }

    /**
     * Define el valor de la propiedad penIdProyecto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPenIdProyecto(Integer value) {
        this.penIdProyecto = value;
    }

    /**
     * Obtiene el valor de la propiedad penObjetivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenObjetivo() {
        return penObjetivo;
    }

    /**
     * Define el valor de la propiedad penObjetivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenObjetivo(String value) {
        this.penObjetivo = value;
    }

    /**
     * Obtiene el valor de la propiedad penSalud.
     * 
     * @return
     *     possible object is
     *     {@link PendienteHealth }
     *     
     */
    public PendienteHealth getPenSalud() {
        return penSalud;
    }

    /**
     * Define el valor de la propiedad penSalud.
     * 
     * @param value
     *     allowed object is
     *     {@link PendienteHealth }
     *     
     */
    public void setPenSalud(PendienteHealth value) {
        this.penSalud = value;
    }

    /**
     * Obtiene el valor de la propiedad penStatus.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getPenStatus() {
        return penStatus;
    }

    /**
     * Define el valor de la propiedad penStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setPenStatus(MultivaluadaRow value) {
        this.penStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad penStatusOld.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getPenStatusOld() {
        return penStatusOld;
    }

    /**
     * Define el valor de la propiedad penStatusOld.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setPenStatusOld(MultivaluadaRow value) {
        this.penStatusOld = value;
    }

    /**
     * Obtiene el valor de la propiedad penTipEntregable.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getPenTipEntregable() {
        return penTipEntregable;
    }

    /**
     * Define el valor de la propiedad penTipEntregable.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setPenTipEntregable(MultivaluadaRow value) {
        this.penTipEntregable = value;
    }

    /**
     * Obtiene el valor de la propiedad penTipPendiente.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getPenTipPendiente() {
        return penTipPendiente;
    }

    /**
     * Define el valor de la propiedad penTipPendiente.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setPenTipPendiente(MultivaluadaRow value) {
        this.penTipPendiente = value;
    }

    /**
     * Obtiene el valor de la propiedad penTipo.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getPenTipo() {
        return penTipo;
    }

    /**
     * Define el valor de la propiedad penTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setPenTipo(MultivaluadaRow value) {
        this.penTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad penUrlAdministracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenUrlAdministracion() {
        return penUrlAdministracion;
    }

    /**
     * Define el valor de la propiedad penUrlAdministracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenUrlAdministracion(String value) {
        this.penUrlAdministracion = value;
    }

    /**
     * Obtiene el valor de la propiedad penUrlSeguimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenUrlSeguimiento() {
        return penUrlSeguimiento;
    }

    /**
     * Define el valor de la propiedad penUrlSeguimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenUrlSeguimiento(String value) {
        this.penUrlSeguimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad penUsuAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenUsuAct() {
        return penUsuAct;
    }

    /**
     * Define el valor de la propiedad penUsuAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenUsuAct(String value) {
        this.penUsuAct = value;
    }

    /**
     * Obtiene el valor de la propiedad penUsuReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenUsuReg() {
        return penUsuReg;
    }

    /**
     * Define el valor de la propiedad penUsuReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenUsuReg(String value) {
        this.penUsuReg = value;
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
     * Obtiene el valor de la propiedad rolResponsable.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getRolResponsable() {
        return rolResponsable;
    }

    /**
     * Define el valor de la propiedad rolResponsable.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setRolResponsable(MultivaluadaRow value) {
        this.rolResponsable = value;
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
     *         &lt;element name="documentosList" type="{http://service.reunion.bsc.penoles/}documentoRow" maxOccurs="unbounded" minOccurs="0"/>
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
        "documentosList"
    })
    public static class DocumentosList {

        protected List<DocumentoRow> documentosList;

        /**
         * Gets the value of the documentosList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentosList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentosList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentoRow }
         * 
         * 
         */
        public List<DocumentoRow> getDocumentosList() {
            if (documentosList == null) {
                documentosList = new ArrayList<DocumentoRow>();
            }
            return this.documentosList;
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
     *         &lt;element name="responsableList" type="{http://service.reunion.bsc.penoles/}responsableRow" maxOccurs="unbounded" minOccurs="0"/>
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
        "responsableList"
    })
    public static class ResponsableList {

        protected List<ResponsableRow> responsableList;

        /**
         * Gets the value of the responsableList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the responsableList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponsableList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResponsableRow }
         * 
         * 
         */
        public List<ResponsableRow> getResponsableList() {
            if (responsableList == null) {
                responsableList = new ArrayList<ResponsableRow>();
            }
            return this.responsableList;
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
     *         &lt;element name="seguimientoList" type="{http://service.reunion.bsc.penoles/}seguimientoRow" maxOccurs="unbounded" minOccurs="0"/>
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
        "seguimientoList"
    })
    public static class SeguimientoList {

        protected List<SeguimientoRow> seguimientoList;

        /**
         * Gets the value of the seguimientoList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seguimientoList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeguimientoList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SeguimientoRow }
         * 
         * 
         */
        public List<SeguimientoRow> getSeguimientoList() {
            if (seguimientoList == null) {
                seguimientoList = new ArrayList<SeguimientoRow>();
            }
            return this.seguimientoList;
        }

    }

}
