
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for designActiveAssembly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="designActiveAssembly"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designActive" type="{http://design.service.menards.com}designActive" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "designActiveAssembly", propOrder = {
    "designActive"
})
public class DesignActiveAssembly {

    @XmlElement(required = true)
    protected DesignActive designActive;

    /**
     * Gets the value of the designActive property.
     * 
     * @return
     *     possible object is
     *     {@link DesignActive }
     *     
     */
    public DesignActive getDesignActive() {
        return designActive;
    }

    /**
     * Sets the value of the designActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignActive }
     *     
     */
    public void setDesignActive(DesignActive value) {
        this.designActive = value;
    }

}
