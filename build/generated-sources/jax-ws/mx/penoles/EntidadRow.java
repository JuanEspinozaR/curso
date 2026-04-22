
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
 * <p>Clase Java para entidadRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="entidadRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agendadorRows" type="{http://service.reunion.bsc.penoles/}entidadResponsableRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coordinadorRows" type="{http://service.reunion.bsc.penoles/}entidadResponsableRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="copiaOcultaRows" type="{http://service.reunion.bsc.penoles/}entidadResponsableRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ent_clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ent_fec_act" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ent_fec_reg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ent_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ent_id_padre" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ent_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ent_nombre_corto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ent_path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ent_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ent_usu_act" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ent_usu_reg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidadList" type="{http://service.reunion.bsc.penoles/}entidadRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entidadPadre" type="{http://service.reunion.bsc.penoles/}entidadRow" minOccurs="0"/>
 *         &lt;element name="niv_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="niv_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nivel" type="{http://service.reunion.bsc.penoles/}nivelRow" minOccurs="0"/>
 *         &lt;element name="responsableRows" type="{http://service.reunion.bsc.penoles/}entidadResponsableRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="seguimientoPendienteRows" type="{http://service.reunion.bsc.penoles/}entidadResponsableRow" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "entidadRow", propOrder = {
    "agendadorRows",
    "coordinadorRows",
    "copiaOcultaRows",
    "entClave",
    "entFecAct",
    "entFecReg",
    "entId",
    "entIdPadre",
    "entNombre",
    "entNombreCorto",
    "entPath",
    "entStatus",
    "entUsuAct",
    "entUsuReg",
    "entidadList",
    "entidadPadre",
    "nivId",
    "nivNombre",
    "nivel",
    "responsableRows",
    "seguimientoPendienteRows",
    "usuCve"
})
public class EntidadRow {

    @XmlElement(nillable = true)
    protected List<EntidadResponsableRow> agendadorRows;
    @XmlElement(nillable = true)
    protected List<EntidadResponsableRow> coordinadorRows;
    @XmlElement(nillable = true)
    protected List<EntidadResponsableRow> copiaOcultaRows;
    @XmlElement(name = "ent_clave")
    protected String entClave;
    @XmlElement(name = "ent_fec_act")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entFecAct;
    @XmlElement(name = "ent_fec_reg")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entFecReg;
    @XmlElement(name = "ent_id")
    protected Integer entId;
    @XmlElement(name = "ent_id_padre")
    protected Integer entIdPadre;
    @XmlElement(name = "ent_nombre")
    protected String entNombre;
    @XmlElement(name = "ent_nombre_corto")
    protected String entNombreCorto;
    @XmlElement(name = "ent_path")
    protected String entPath;
    @XmlElement(name = "ent_status")
    protected String entStatus;
    @XmlElement(name = "ent_usu_act")
    protected String entUsuAct;
    @XmlElement(name = "ent_usu_reg")
    protected String entUsuReg;
    @XmlElement(nillable = true)
    protected List<EntidadRow> entidadList;
    protected EntidadRow entidadPadre;
    @XmlElement(name = "niv_id")
    protected Short nivId;
    @XmlElement(name = "niv_nombre")
    protected String nivNombre;
    protected NivelRow nivel;
    @XmlElement(nillable = true)
    protected List<EntidadResponsableRow> responsableRows;
    @XmlElement(nillable = true)
    protected List<EntidadResponsableRow> seguimientoPendienteRows;
    @XmlElement(name = "usu_cve")
    protected String usuCve;

    /**
     * Gets the value of the agendadorRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agendadorRows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgendadorRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntidadResponsableRow }
     * 
     * 
     */
    public List<EntidadResponsableRow> getAgendadorRows() {
        if (agendadorRows == null) {
            agendadorRows = new ArrayList<EntidadResponsableRow>();
        }
        return this.agendadorRows;
    }

    /**
     * Gets the value of the coordinadorRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinadorRows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinadorRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntidadResponsableRow }
     * 
     * 
     */
    public List<EntidadResponsableRow> getCoordinadorRows() {
        if (coordinadorRows == null) {
            coordinadorRows = new ArrayList<EntidadResponsableRow>();
        }
        return this.coordinadorRows;
    }

    /**
     * Gets the value of the copiaOcultaRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copiaOcultaRows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopiaOcultaRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntidadResponsableRow }
     * 
     * 
     */
    public List<EntidadResponsableRow> getCopiaOcultaRows() {
        if (copiaOcultaRows == null) {
            copiaOcultaRows = new ArrayList<EntidadResponsableRow>();
        }
        return this.copiaOcultaRows;
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
     * Obtiene el valor de la propiedad entFecAct.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntFecAct() {
        return entFecAct;
    }

    /**
     * Define el valor de la propiedad entFecAct.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntFecAct(XMLGregorianCalendar value) {
        this.entFecAct = value;
    }

    /**
     * Obtiene el valor de la propiedad entFecReg.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntFecReg() {
        return entFecReg;
    }

    /**
     * Define el valor de la propiedad entFecReg.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntFecReg(XMLGregorianCalendar value) {
        this.entFecReg = value;
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
     * Obtiene el valor de la propiedad entNombreCorto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntNombreCorto() {
        return entNombreCorto;
    }

    /**
     * Define el valor de la propiedad entNombreCorto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntNombreCorto(String value) {
        this.entNombreCorto = value;
    }

    /**
     * Obtiene el valor de la propiedad entPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntPath() {
        return entPath;
    }

    /**
     * Define el valor de la propiedad entPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntPath(String value) {
        this.entPath = value;
    }

    /**
     * Obtiene el valor de la propiedad entStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntStatus() {
        return entStatus;
    }

    /**
     * Define el valor de la propiedad entStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntStatus(String value) {
        this.entStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad entUsuAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntUsuAct() {
        return entUsuAct;
    }

    /**
     * Define el valor de la propiedad entUsuAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntUsuAct(String value) {
        this.entUsuAct = value;
    }

    /**
     * Obtiene el valor de la propiedad entUsuReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntUsuReg() {
        return entUsuReg;
    }

    /**
     * Define el valor de la propiedad entUsuReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntUsuReg(String value) {
        this.entUsuReg = value;
    }

    /**
     * Gets the value of the entidadList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entidadList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntidadList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntidadRow }
     * 
     * 
     */
    public List<EntidadRow> getEntidadList() {
        if (entidadList == null) {
            entidadList = new ArrayList<EntidadRow>();
        }
        return this.entidadList;
    }

    /**
     * Obtiene el valor de la propiedad entidadPadre.
     * 
     * @return
     *     possible object is
     *     {@link EntidadRow }
     *     
     */
    public EntidadRow getEntidadPadre() {
        return entidadPadre;
    }

    /**
     * Define el valor de la propiedad entidadPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadRow }
     *     
     */
    public void setEntidadPadre(EntidadRow value) {
        this.entidadPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad nivId.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNivId() {
        return nivId;
    }

    /**
     * Define el valor de la propiedad nivId.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNivId(Short value) {
        this.nivId = value;
    }

    /**
     * Obtiene el valor de la propiedad nivNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivNombre() {
        return nivNombre;
    }

    /**
     * Define el valor de la propiedad nivNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivNombre(String value) {
        this.nivNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nivel.
     * 
     * @return
     *     possible object is
     *     {@link NivelRow }
     *     
     */
    public NivelRow getNivel() {
        return nivel;
    }

    /**
     * Define el valor de la propiedad nivel.
     * 
     * @param value
     *     allowed object is
     *     {@link NivelRow }
     *     
     */
    public void setNivel(NivelRow value) {
        this.nivel = value;
    }

    /**
     * Gets the value of the responsableRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsableRows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsableRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntidadResponsableRow }
     * 
     * 
     */
    public List<EntidadResponsableRow> getResponsableRows() {
        if (responsableRows == null) {
            responsableRows = new ArrayList<EntidadResponsableRow>();
        }
        return this.responsableRows;
    }

    /**
     * Gets the value of the seguimientoPendienteRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seguimientoPendienteRows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeguimientoPendienteRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntidadResponsableRow }
     * 
     * 
     */
    public List<EntidadResponsableRow> getSeguimientoPendienteRows() {
        if (seguimientoPendienteRows == null) {
            seguimientoPendienteRows = new ArrayList<EntidadResponsableRow>();
        }
        return this.seguimientoPendienteRows;
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
