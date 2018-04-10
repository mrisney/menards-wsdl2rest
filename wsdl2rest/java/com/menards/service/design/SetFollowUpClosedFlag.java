
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setFollowUpClosedFlag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setFollowUpClosedFlag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="followUpClosedAssembly" type="{http://design.service.menards.com}followUpClosedAssembly"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setFollowUpClosedFlag", propOrder = {
    "followUpClosedAssembly"
})
public class SetFollowUpClosedFlag {

    @XmlElement(namespace = "", required = true)
    protected FollowUpClosedAssembly followUpClosedAssembly;

    /**
     * Gets the value of the followUpClosedAssembly property.
     * 
     * @return
     *     possible object is
     *     {@link FollowUpClosedAssembly }
     *     
     */
    public FollowUpClosedAssembly getFollowUpClosedAssembly() {
        return followUpClosedAssembly;
    }

    /**
     * Sets the value of the followUpClosedAssembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link FollowUpClosedAssembly }
     *     
     */
    public void setFollowUpClosedAssembly(FollowUpClosedAssembly value) {
        this.followUpClosedAssembly = value;
    }

}
