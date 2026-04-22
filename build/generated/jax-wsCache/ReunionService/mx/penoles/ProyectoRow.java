
package mx.penoles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para proyectoRow complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="proyectoRow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.reunion.bsc.penoles/}pendienteRow">
 *       &lt;sequence>
 *         &lt;element name="est_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estrategia" type="{http://service.reunion.bsc.penoles/}estrategiaRow" minOccurs="0"/>
 *         &lt;element name="proyectoIndicadorList" type="{http://service.reunion.bsc.penoles/}proyectoIndicadorRow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pry_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pry_tipo" type="{http://service.reunion.bsc.penoles/}multivaluadaRow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proyectoRow", propOrder = {
    "estId",
    "estrategia",
    "proyectoIndicadorList",
    "pryNombre",
    "pryTipo"
})
@XmlSeeAlso({
    ProyectoServiceRow.class
})
public class ProyectoRow
    extends PendienteRow
{

    @XmlElement(name = "est_id")
    protected Integer estId;
    protected EstrategiaRow estrategia;
    @XmlElement(nillable = true)
    protected List<ProyectoIndicadorRow> proyectoIndicadorList;
    @XmlElement(name = "pry_nombre")
    protected String pryNombre;
    @XmlElement(name = "pry_tipo")
    protected MultivaluadaRow pryTipo;

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
     * Obtiene el valor de la propiedad estrategia.
     * 
     * @return
     *     possible object is
     *     {@link EstrategiaRow }
     *     
     */
    public EstrategiaRow getEstrategia() {
        return estrategia;
    }

    /**
     * Define el valor de la propiedad estrategia.
     * 
     * @param value
     *     allowed object is
     *     {@link EstrategiaRow }
     *     
     */
    public void setEstrategia(EstrategiaRow value) {
        this.estrategia = value;
    }

    /**
     * Gets the value of the proyectoIndicadorList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proyectoIndicadorList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProyectoIndicadorList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProyectoIndicadorRow }
     * 
     * 
     */
    public List<ProyectoIndicadorRow> getProyectoIndicadorList() {
        if (proyectoIndicadorList == null) {
            proyectoIndicadorList = new ArrayList<ProyectoIndicadorRow>();
        }
        return this.proyectoIndicadorList;
    }

    /**
     * Obtiene el valor de la propiedad pryNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPryNombre() {
        return pryNombre;
    }

    /**
     * Define el valor de la propiedad pryNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPryNombre(String value) {
        this.pryNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad pryTipo.
     * 
     * @return
     *     possible object is
     *     {@link MultivaluadaRow }
     *     
     */
    public MultivaluadaRow getPryTipo() {
        return pryTipo;
    }

    /**
     * Define el valor de la propiedad pryTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link MultivaluadaRow }
     *     
     */
    public void setPryTipo(MultivaluadaRow value) {
        this.pryTipo = value;
    }

}
