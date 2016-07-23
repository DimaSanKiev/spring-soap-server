package hello;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currency.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="currency">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UAH"/>
 *     <enumeration value="USD"/>
 *     <enumeration value="EUR"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 */
@XmlType(name = "currency")
@XmlEnum
public enum Currency {

    UAH,
    USD,
    EUR;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }

}
