
package mx.penoles;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para seguimientoRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="seguimientoRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentoList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="documentoList" type="{http://service.reunion.bsc.penoles/}documentoRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pen_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pendiente" type="{http://service.reunion.bsc.penoles/}pendienteRow" minOccurs="0"/>
 *         &lt;element name="seg_avance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="seg_comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seg_fec_act" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="seg_fec_reg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="seg_fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="seg_status" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="seg_usu_act" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seg_usu_reg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usu_cve" type="{http://service.reunion.bsc.penoles/}usuarioRow" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://service.reunion.bsc.penoles/}usuarioRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seguimientoRow", propOrder = {
    "documentoList",
    "penId",
    "pendiente",
    "segAvance",
    "segComentario",
    "segFecAct",
    "segFecReg",
    "segFecha",
    "segStatus",
    "segUsuAct",
    "segUsuReg",
    "usuCve",
    "usuario"
})
public class SeguimientoRow {

    @XmlElement(required = true)
    protected SeguimientoRow.DocumentoList documentoList;
    @XmlElement(name = "pen_id")
    protected Integer penId;
    protected PendienteRow pendiente;
    @XmlElement(name = "seg_avance")
    protected BigDecimal segAvance;
    @XmlElement(name = "seg_comentario")
    protected String segComentario;
    @XmlElement(name = "seg_fec_act")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar segFecAct;
    @XmlElement(name = "seg_fec_reg")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar segFecReg;
    @XmlElement(name = "seg_fecha")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar segFecha;
    @XmlElement(name = "seg_status")
    protected MultivaluadaRow segStatus;
    @XmlElement(name = "seg_usu_act")
    protected String segUsuAct;
    @XmlElement(name = "seg_usu_reg")
    protected String segUsuReg;
    @XmlElement(name = "usu_cve")
    protected UsuarioRow usuCve;
    protected UsuarioRow usuario;

    /**
     * Obtiene el valor de la propiedad documentoList.
     * 
     * @return
     *     possible object is
     *     {@link SeguimientoRow.DocumentoList }
     *     
     */
    public SeguimientoRow.DocumentoList getDocumentoList() {
        return documentoList;
    }

    /**
     * Define el valor de la propiedad documentoList.
     * 
     * @param value
     *     allowed object is
     *     {@link SeguimientoRow.DocumentoList }
     *     
     */
    public void setDocumentoList(SeguimientoRow.DocumentoList value) {
        this.documentoList = value;
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
     * Obtiene el valor de la propiedad segAvance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSegAvance() {
        return segAvance;
    }

    /**
     * Define el valor de la propiedad segAvance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSegAvance(BigDecimal value) {
        this.segAvance = value;
    }

    /**
     * Obtiene el valor de la propiedad segComentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegComentario() {
        return segComentario;
    }

    /**
     * Define el valor de la propiedad segComentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegComentario(String value) {
        this.segComentario = value;
    }

    /**
     * Obtiene el valor de la propiedad segFecAct.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSegFecAct() {
        return segFecAct;
    }

    /**
     * Define el valor de la propiedad segFecAct.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSegFecAct(XMLGregorianCalendar value) {
        this.segFecAct = value;
    }

    /**
     * Obtiene el valor de la propiedad segFecReg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSegFecReg() {
        return segFecReg;
    }

    /**
     * Define el valor de la propiedad segFecReg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSegFecReg(XMLGregorianCalendar value) {
        this.segFecReg = value;
    }

    /**
     * Obtiene el valor de la propiedad segFecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSegFecha() {
        return segFecha;
    }

    /**
     * Define el valor de la propiedad segFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSegFecha(XMLGregorianCalendar value) {
        this.segFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad segStatus.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getSegStatus() {
        return segStatus;
    }

    /**
     * Define el valor de la propiedad segStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setSegStatus(MultivaluadaRow value) {
        this.segStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad segUsuAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegUsuAct() {
        return segUsuAct;
    }

    /**
     * Define el valor de la propiedad segUsuAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegUsuAct(String value) {
        this.segUsuAct = value;
    }

    /**
     * Obtiene el valor de la propiedad segUsuReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegUsuReg() {
        return segUsuReg;
    }

    /**
     * Define el valor de la propiedad segUsuReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegUsuReg(String value) {
        this.segUsuReg = value;
    }

    /**
     * Obtiene el valor de la propiedad usuCve.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioRow }
     *     
     */
    public UsuarioRow getUsuCve() {
        return usuCve;
    }

    /**
     * Define el valor de la propiedad usuCve.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioRow }
     *     
     */
    public void setUsuCve(UsuarioRow value) {
        this.usuCve = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioRow }
     *     
     */
    public UsuarioRow getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioRow }
     *     
     */
    public void setUsuario(UsuarioRow value) {
        this.usuario = value;
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
     *         &lt;element name="documentoList" type="{http://service.reunion.bsc.penoles/}documentoRow" maxOccurs="unbounded" minOccurs="0"/>
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
        "documentoList"
    })
    public static class DocumentoList {

        protected List<DocumentoRow> documentoList;

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

    }

}
