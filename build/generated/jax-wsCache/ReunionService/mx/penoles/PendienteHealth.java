
package mx.penoles;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pendienteHealth.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="pendienteHealth">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ON_TIME"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="DANGER"/>
 *     &lt;enumeration value="BLANK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pendienteHealth")
@XmlEnum
public enum PendienteHealth {

    UNKNOWN,
    ON_TIME,
    EXPIRED,
    WARNING,
    DANGER,
    BLANK;

    public String value() {
        return name();
    }

    public static PendienteHealth fromValue(String v) {
        return valueOf(v);
    }

}
