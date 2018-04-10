
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setDesign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setDesign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sendToEstimateFollowUpSystem" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="designAssembly" type="{http://design.service.menards.com}designAssembly"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setDesign", propOrder = {
    "sendToEstimateFollowUpSystem",
    "designAssembly"
})
public class SetDesign {

    @XmlElement(namespace = "")
    protected boolean sendToEstimateFollowUpSystem;
    @XmlElement(namespace = "", required = true)
    protected DesignAssembly designAssembly;

    /**
     * Gets the value of the sendToEstimateFollowUpSystem property.
     * 
     */
    public boolean isSendToEstimateFollowUpSystem() {
        return sendToEstimateFollowUpSystem;
    }

    /**
     * Sets the value of the sendToEstimateFollowUpSystem property.
     * 
     */
    public void setSendToEstimateFollowUpSystem(boolean value) {
        this.sendToEstimateFollowUpSystem = value;
    }

    /**
     * Gets the value of the designAssembly property.
     * 
     * @return
     *     possible object is
     *     {@link DesignAssembly }
     *     
     */
    public DesignAssembly getDesignAssembly() {
        return designAssembly;
    }

    /**
     * Sets the value of the designAssembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignAssembly }
     *     
     */
    public void setDesignAssembly(DesignAssembly value) {
        this.designAssembly = value;
    }

}
