
package mx.penoles;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoImagen.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoImagen">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INSERTAR"/>
 *     &lt;enumeration value="ELIMINAR"/>
 *     &lt;enumeration value="MODIFICAR"/>
 *     &lt;enumeration value="VER_DETALLES"/>
 *     &lt;enumeration value="VER_RESPONSABLES"/>
 *     &lt;enumeration value="DOCUMENTO"/>
 *     &lt;enumeration value="DESCARGAR"/>
 *     &lt;enumeration value="CHECKBOX"/>
 *     &lt;enumeration value="SEMAFORO"/>
 *     &lt;enumeration value="EXCEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoImagen")
@XmlEnum
public enum TipoImagen {

    INSERTAR,
    ELIMINAR,
    MODIFICAR,
    VER_DETALLES,
    VER_RESPONSABLES,
    DOCUMENTO,
    DESCARGAR,
    CHECKBOX,
    SEMAFORO,
    EXCEL;

    public String value() {
        return name();
    }

    public static TipoImagen fromValue(String v) {
        return valueOf(v);
    }

}
