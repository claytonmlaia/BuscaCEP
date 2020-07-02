
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoBloqueio.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoBloqueio"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FRAUDE_BLOQUEIO"/&gt;
 *     &lt;enumeration value="EXTRAVIO_VAREJO_PRE_INDENIZADO"/&gt;
 *     &lt;enumeration value="EXTRAVIO_VAREJO_POS_INDENIZADO"/&gt;
 *     &lt;enumeration value="EXTRAVIO_CORPORATIVO"/&gt;
 *     &lt;enumeration value="INTERNACIONAL_LDI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoBloqueio")
@XmlEnum
public enum TipoBloqueio {

    FRAUDE_BLOQUEIO,
    EXTRAVIO_VAREJO_PRE_INDENIZADO,
    EXTRAVIO_VAREJO_POS_INDENIZADO,
    EXTRAVIO_CORPORATIVO,
    INTERNACIONAL_LDI;

    public String value() {
        return name();
    }

    public static TipoBloqueio fromValue(String v) {
        return valueOf(v);
    }

}
