
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPreConfiguredDesignActiveFlag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPreConfiguredDesignActiveFlag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designActiveAssembly" type="{http://design.service.menards.com}designActiveAssembly"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPreConfiguredDesignActiveFlag", propOrder = {
    "designActiveAssembly"
})
public class SetPreConfiguredDesignActiveFlag {

    @XmlElement(namespace = "", required = true)
    protected DesignActiveAssembly designActiveAssembly;

    /**
     * Gets the value of the designActiveAssembly property.
     * 
     * @return
     *     possible object is
     *     {@link DesignActiveAssembly }
     *     
     */
    public DesignActiveAssembly getDesignActiveAssembly() {
        return designActiveAssembly;
    }

    /**
     * Sets the value of the designActiveAssembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignActiveAssembly }
     *     
     */
    public void setDesignActiveAssembly(DesignActiveAssembly value) {
        this.designActiveAssembly = value;
    }

}
