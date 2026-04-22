
package mx.penoles;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoColumna.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoColumna">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEXTO"/>
 *     &lt;enumeration value="NUMERO"/>
 *     &lt;enumeration value="MONEDA"/>
 *     &lt;enumeration value="FECHA"/>
 *     &lt;enumeration value="PORCENTAJE"/>
 *     &lt;enumeration value="IMAGEN"/>
 *     &lt;enumeration value="IMAGEN_COLUMNA"/>
 *     &lt;enumeration value="CHECKBOX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoColumna")
@XmlEnum
public enum TipoColumna {

    TEXTO,
    NUMERO,
    MONEDA,
    FECHA,
    PORCENTAJE,
    IMAGEN,
    IMAGEN_COLUMNA,
    CHECKBOX;

    public String value() {
        return name();
    }

    public static TipoColumna fromValue(String v) {
        return valueOf(v);
    }

}
