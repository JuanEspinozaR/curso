
package mx.penoles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para columna complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="columna">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnImageRender" type="{http://service.reunion.bsc.penoles/}tipoImagen" minOccurs="0"/>
 *         &lt;element name="columnType" type="{http://service.reunion.bsc.penoles/}tipoColumna" minOccurs="0"/>
 *         &lt;element name="dataField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageRender" type="{http://service.reunion.bsc.penoles/}tipoImagen" minOccurs="0"/>
 *         &lt;element name="tipoColumna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoImagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoImagenColumna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "columna", propOrder = {
    "columnImageRender",
    "columnType",
    "dataField",
    "headerText",
    "imageRender",
    "tipoColumna",
    "tipoImagen",
    "tipoImagenColumna",
    "visible",
    "width"
})
public class Columna {

    protected TipoImagen columnImageRender;
    protected TipoColumna columnType;
    protected String dataField;
    protected String headerText;
    protected TipoImagen imageRender;
    protected String tipoColumna;
    protected String tipoImagen;
    protected String tipoImagenColumna;
    protected boolean visible;
    protected Integer width;

    /**
     * Obtiene el valor de la propiedad columnImageRender.
     * 
     * @return
     *     possible object is
     *     {@link TipoImagen }
     *     
     */
    public TipoImagen getColumnImageRender() {
        return columnImageRender;
    }

    /**
     * Define el valor de la propiedad columnImageRender.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoImagen }
     *     
     */
    public void setColumnImageRender(TipoImagen value) {
        this.columnImageRender = value;
    }

    /**
     * Obtiene el valor de la propiedad columnType.
     * 
     * @return
     *     possible object is
     *     {@link TipoColumna }
     *     
     */
    public TipoColumna getColumnType() {
        return columnType;
    }

    /**
     * Define el valor de la propiedad columnType.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoColumna }
     *     
     */
    public void setColumnType(TipoColumna value) {
        this.columnType = value;
    }

    /**
     * Obtiene el valor de la propiedad dataField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataField() {
        return dataField;
    }

    /**
     * Define el valor de la propiedad dataField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataField(String value) {
        this.dataField = value;
    }

    /**
     * Obtiene el valor de la propiedad headerText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderText() {
        return headerText;
    }

    /**
     * Define el valor de la propiedad headerText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderText(String value) {
        this.headerText = value;
    }

    /**
     * Obtiene el valor de la propiedad imageRender.
     * 
     * @return
     *     possible object is
     *     {@link TipoImagen }
     *     
     */
    public TipoImagen getImageRender() {
        return imageRender;
    }

    /**
     * Define el valor de la propiedad imageRender.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoImagen }
     *     
     */
    public void setImageRender(TipoImagen value) {
        this.imageRender = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoColumna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoColumna() {
        return tipoColumna;
    }

    /**
     * Define el valor de la propiedad tipoColumna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoColumna(String value) {
        this.tipoColumna = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoImagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoImagen() {
        return tipoImagen;
    }

    /**
     * Define el valor de la propiedad tipoImagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoImagen(String value) {
        this.tipoImagen = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoImagenColumna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoImagenColumna() {
        return tipoImagenColumna;
    }

    /**
     * Define el valor de la propiedad tipoImagenColumna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoImagenColumna(String value) {
        this.tipoImagenColumna = value;
    }

    /**
     * Obtiene el valor de la propiedad visible.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Define el valor de la propiedad visible.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

    /**
     * Obtiene el valor de la propiedad width.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Define el valor de la propiedad width.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

}
