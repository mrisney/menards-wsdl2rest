
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPreConfiguredDesign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPreConfiguredDesign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preConfiguredDesignAssembly" type="{http://design.service.menards.com}preConfiguredDesignAssembly"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPreConfiguredDesign", propOrder = {
    "preConfiguredDesignAssembly"
})
public class SetPreConfiguredDesign {

    @XmlElement(namespace = "", required = true)
    protected PreConfiguredDesignAssembly preConfiguredDesignAssembly;

    /**
     * Gets the value of the preConfiguredDesignAssembly property.
     * 
     * @return
     *     possible object is
     *     {@link PreConfiguredDesignAssembly }
     *     
     */
    public PreConfiguredDesignAssembly getPreConfiguredDesignAssembly() {
        return preConfiguredDesignAssembly;
    }

    /**
     * Sets the value of the preConfiguredDesignAssembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreConfiguredDesignAssembly }
     *     
     */
    public void setPreConfiguredDesignAssembly(PreConfiguredDesignAssembly value) {
        this.preConfiguredDesignAssembly = value;
    }

}
