
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de categoriaServico.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="categoriaServico"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SEM_CATEGORIA"/&gt;
 *     &lt;enumeration value="PAC"/&gt;
 *     &lt;enumeration value="SEDEX"/&gt;
 *     &lt;enumeration value="CARTA_REGISTRADA"/&gt;
 *     &lt;enumeration value="SERVICO_COM_RESTRICAO"/&gt;
 *     &lt;enumeration value="REVERSO"/&gt;
 *     &lt;enumeration value="CARTA_CTR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "categoriaServico")
@XmlEnum
public enum CategoriaServico {

    SEM_CATEGORIA,
    PAC,
    SEDEX,
    CARTA_REGISTRADA,
    SERVICO_COM_RESTRICAO,
    REVERSO,
    CARTA_CTR;

    public String value() {
        return name();
    }

    public static CategoriaServico fromValue(String v) {
        return valueOf(v);
    }

}
