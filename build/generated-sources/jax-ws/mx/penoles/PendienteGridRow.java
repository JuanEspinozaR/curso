
package mx.penoles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para pendienteGridRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pendienteGridRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pendienteList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pendienteList" type="{http://service.reunion.bsc.penoles/}pendienteGridRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pen_salud" type="{http://service.reunion.bsc.penoles/}pendienteHealth" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="entNombre" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="penAvanceDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="penClave" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="penDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="penFecObjetivo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="penId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="penSeguimiento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="penStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="responsables" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="segFecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pendienteGridRow", propOrder = {
    "pendienteList",
    "penSalud"
})
public class PendienteGridRow {

    @XmlElement(required = true)
    protected PendienteGridRow.PendienteList pendienteList;
    @XmlElement(name = "pen_salud")
    protected PendienteHealth penSalud;
    @XmlAttribute(name = "entNombre")
    protected String entNombre;
    @XmlAttribute(name = "penAvanceDesc")
    protected String penAvanceDesc;
    @XmlAttribute(name = "penClave")
    protected String penClave;
    @XmlAttribute(name = "penDescripcion")
    protected String penDescripcion;
    @XmlAttribute(name = "penFecObjetivo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar penFecObjetivo;
    @XmlAttribute(name = "penId")
    protected Integer penId;
    @XmlAttribute(name = "penSeguimiento")
    protected String penSeguimiento;
    @XmlAttribute(name = "penStatusDesc")
    protected String penStatusDesc;
    @XmlAttribute(name = "responsables")
    protected String responsables;
    @XmlAttribute(name = "segFecha")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar segFecha;

    /**
     * Obtiene el valor de la propiedad pendienteList.
     * 
     * @return
     *     possible object is
     *     {@link PendienteGridRow.PendienteList }
     *     
     */
    public PendienteGridRow.PendienteList getPendienteList() {
        return pendienteList;
    }

    /**
     * Define el valor de la propiedad pendienteList.
     * 
     * @param value
     *     allowed object is
     *     {@link PendienteGridRow.PendienteList }
     *     
     */
    public void setPendienteList(PendienteGridRow.PendienteList value) {
        this.pendienteList = value;
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
     * Obtiene el valor de la propiedad penAvanceDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenAvanceDesc() {
        return penAvanceDesc;
    }

    /**
     * Define el valor de la propiedad penAvanceDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenAvanceDesc(String value) {
        this.penAvanceDesc = value;
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
     * Obtiene el valor de la propiedad penSeguimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenSeguimiento() {
        return penSeguimiento;
    }

    /**
     * Define el valor de la propiedad penSeguimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenSeguimiento(String value) {
        this.penSeguimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad penStatusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenStatusDesc() {
        return penStatusDesc;
    }

    /**
     * Define el valor de la propiedad penStatusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenStatusDesc(String value) {
        this.penStatusDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad responsables.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsables() {
        return responsables;
    }

    /**
     * Define el valor de la propiedad responsables.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsables(String value) {
        this.responsables = value;
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="pendienteList" type="{http://service.reunion.bsc.penoles/}pendienteGridRow" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<PendienteGridRow> pendienteList;

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
         * {@link PendienteGridRow }
         * 
         * 
         */
        public List<PendienteGridRow> getPendienteList() {
            if (pendienteList == null) {
                pendienteList = new ArrayList<PendienteGridRow>();
            }
            return this.pendienteList;
        }

    }

}
