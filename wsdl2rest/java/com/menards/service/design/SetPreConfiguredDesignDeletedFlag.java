
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPreConfiguredDesignDeletedFlag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPreConfiguredDesignDeletedFlag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designDeletedAssembly" type="{http://design.service.menards.com}designDeletedAssembly"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPreConfiguredDesignDeletedFlag", propOrder = {
    "designDeletedAssembly"
})
public class SetPreConfiguredDesignDeletedFlag {

    @XmlElement(namespace = "", required = true)
    protected DesignDeletedAssembly designDeletedAssembly;

    /**
     * Gets the value of the designDeletedAssembly property.
     * 
     * @return
     *     possible object is
     *     {@link DesignDeletedAssembly }
     *     
     */
    public DesignDeletedAssembly getDesignDeletedAssembly() {
        return designDeletedAssembly;
    }

    /**
     * Sets the value of the designDeletedAssembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignDeletedAssembly }
     *     
     */
    public void setDesignDeletedAssembly(DesignDeletedAssembly value) {
        this.designDeletedAssembly = value;
    }

}
