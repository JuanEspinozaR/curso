
package mx.penoles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para responsableRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="responsableRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="administrador" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="autorizacionHecha" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="listaPendientesAdministrador" type="{http://service.reunion.bsc.penoles/}pendienteRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaPendientesAutorizador" type="{http://service.reunion.bsc.penoles/}pendienteRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaPendientesResponsable" type="{http://service.reunion.bsc.penoles/}pendienteRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaPendientesRevisor" type="{http://service.reunion.bsc.penoles/}pendienteRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pen_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="res_correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="res_id" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="res_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="res_status" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="res_tipo" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *         &lt;element name="res_tipo_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usu_cve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "responsableRow", propOrder = {
    "administrador",
    "autorizacionHecha",
    "listaPendientesAdministrador",
    "listaPendientesAutorizador",
    "listaPendientesResponsable",
    "listaPendientesRevisor",
    "penId",
    "resCorreo",
    "resId",
    "resNombre",
    "resStatus",
    "resTipo",
    "resTipoDesc",
    "usuCve",
    "usuario"
})
public class ResponsableRow {

    protected Boolean administrador;
    protected boolean autorizacionHecha;
    @XmlElement(nillable = true)
    protected List<PendienteRow> listaPendientesAdministrador;
    @XmlElement(nillable = true)
    protected List<PendienteRow> listaPendientesAutorizador;
    @XmlElement(nillable = true)
    protected List<PendienteRow> listaPendientesResponsable;
    @XmlElement(nillable = true)
    protected List<PendienteRow> listaPendientesRevisor;
    @XmlElement(name = "pen_id")
    protected Integer penId;
    @XmlElement(name = "res_correo")
    protected String resCorreo;
    @XmlElement(name = "res_id")
    protected Short resId;
    @XmlElement(name = "res_nombre")
    protected String resNombre;
    @XmlElement(name = "res_status")
    protected MultivaluadaRow resStatus;
    @XmlElement(name = "res_tipo")
    protected MultivaluadaRow resTipo;
    @XmlElement(name = "res_tipo_desc")
    protected String resTipoDesc;
    @XmlElement(name = "usu_cve")
    protected String usuCve;
    protected UsuarioRow usuario;

    /**
     * Obtiene el valor de la propiedad administrador.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdministrador() {
        return administrador;
    }

    /**
     * Define el valor de la propiedad administrador.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdministrador(Boolean value) {
        this.administrador = value;
    }

    /**
     * Obtiene el valor de la propiedad autorizacionHecha.
     * 
     */
    public boolean isAutorizacionHecha() {
        return autorizacionHecha;
    }

    /**
     * Define el valor de la propiedad autorizacionHecha.
     * 
     */
    public void setAutorizacionHecha(boolean value) {
        this.autorizacionHecha = value;
    }

    /**
     * Gets the value of the listaPendientesAdministrador property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaPendientesAdministrador property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaPendientesAdministrador().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendienteRow }
     * 
     * 
     */
    public List<PendienteRow> getListaPendientesAdministrador() {
        if (listaPendientesAdministrador == null) {
            listaPendientesAdministrador = new ArrayList<PendienteRow>();
        }
        return this.listaPendientesAdministrador;
    }

    /**
     * Gets the value of the listaPendientesAutorizador property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaPendientesAutorizador property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaPendientesAutorizador().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendienteRow }
     * 
     * 
     */
    public List<PendienteRow> getListaPendientesAutorizador() {
        if (listaPendientesAutorizador == null) {
            listaPendientesAutorizador = new ArrayList<PendienteRow>();
        }
        return this.listaPendientesAutorizador;
    }

    /**
     * Gets the value of the listaPendientesResponsable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaPendientesResponsable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaPendientesResponsable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendienteRow }
     * 
     * 
     */
    public List<PendienteRow> getListaPendientesResponsable() {
        if (listaPendientesResponsable == null) {
            listaPendientesResponsable = new ArrayList<PendienteRow>();
        }
        return this.listaPendientesResponsable;
    }

    /**
     * Gets the value of the listaPendientesRevisor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaPendientesRevisor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaPendientesRevisor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendienteRow }
     * 
     * 
     */
    public List<PendienteRow> getListaPendientesRevisor() {
        if (listaPendientesRevisor == null) {
            listaPendientesRevisor = new ArrayList<PendienteRow>();
        }
        return this.listaPendientesRevisor;
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
     * Obtiene el valor de la propiedad resCorreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResCorreo() {
        return resCorreo;
    }

    /**
     * Define el valor de la propiedad resCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResCorreo(String value) {
        this.resCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad resId.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getResId() {
        return resId;
    }

    /**
     * Define el valor de la propiedad resId.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setResId(Short value) {
        this.resId = value;
    }

    /**
     * Obtiene el valor de la propiedad resNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResNombre() {
        return resNombre;
    }

    /**
     * Define el valor de la propiedad resNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResNombre(String value) {
        this.resNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad resStatus.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getResStatus() {
        return resStatus;
    }

    /**
     * Define el valor de la propiedad resStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setResStatus(MultivaluadaRow value) {
        this.resStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad resTipo.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getResTipo() {
        return resTipo;
    }

    /**
     * Define el valor de la propiedad resTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setResTipo(MultivaluadaRow value) {
        this.resTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad resTipoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResTipoDesc() {
        return resTipoDesc;
    }

    /**
     * Define el valor de la propiedad resTipoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResTipoDesc(String value) {
        this.resTipoDesc = value;
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

}
