
package mx.penoles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para proyectoServiceRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="proyectoServiceRow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.reunion.bsc.penoles/}proyectoRow">
 *       &lt;sequence>
 *         &lt;element name="proyectoList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="proyectoList" type="{http://service.reunion.bsc.penoles/}proyectoRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ent_id_Padre" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="est_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_avance_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_status_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pen_tipo_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pry_tipo_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proyectoServiceRow", propOrder = {
    "proyectoList",
    "entIdPadre",
    "estNombre",
    "penAvanceDesc",
    "penStatusDesc",
    "penTipoDesc",
    "pryTipoDesc"
})
public class ProyectoServiceRow
    extends ProyectoRow
{

    @XmlElement(required = true)
    protected ProyectoServiceRow.ProyectoList proyectoList;
    @XmlElement(name = "ent_id_Padre")
    protected Integer entIdPadre;
    @XmlElement(name = "est_nombre")
    protected String estNombre;
    @XmlElement(name = "pen_avance_desc")
    protected String penAvanceDesc;
    @XmlElement(name = "pen_status_desc")
    protected String penStatusDesc;
    @XmlElement(name = "pen_tipo_desc")
    protected String penTipoDesc;
    @XmlElement(name = "pry_tipo_desc")
    protected String pryTipoDesc;

    /**
     * Obtiene el valor de la propiedad proyectoList.
     * 
     * @return
     *     possible object is
     *     {@link ProyectoServiceRow.ProyectoList }
     *     
     */
    public ProyectoServiceRow.ProyectoList getProyectoList() {
        return proyectoList;
    }

    /**
     * Define el valor de la propiedad proyectoList.
     * 
     * @param value
     *     allowed object is
     *     {@link ProyectoServiceRow.ProyectoList }
     *     
     */
    public void setProyectoList(ProyectoServiceRow.ProyectoList value) {
        this.proyectoList = value;
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
     * Obtiene el valor de la propiedad estNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstNombre() {
        return estNombre;
    }

    /**
     * Define el valor de la propiedad estNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstNombre(String value) {
        this.estNombre = value;
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
     * Obtiene el valor de la propiedad penTipoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenTipoDesc() {
        return penTipoDesc;
    }

    /**
     * Define el valor de la propiedad penTipoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenTipoDesc(String value) {
        this.penTipoDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad pryTipoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPryTipoDesc() {
        return pryTipoDesc;
    }

    /**
     * Define el valor de la propiedad pryTipoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPryTipoDesc(String value) {
        this.pryTipoDesc = value;
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
     *         &lt;element name="proyectoList" type="{http://service.reunion.bsc.penoles/}proyectoRow" maxOccurs="unbounded" minOccurs="0"/>
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
        "proyectoList"
    })
    public static class ProyectoList {

        protected List<ProyectoRow> proyectoList;

        /**
         * Gets the value of the proyectoList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the proyectoList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProyectoList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProyectoRow }
         * 
         * 
         */
        public List<ProyectoRow> getProyectoList() {
            if (proyectoList == null) {
                proyectoList = new ArrayList<ProyectoRow>();
            }
            return this.proyectoList;
        }

    }

}
