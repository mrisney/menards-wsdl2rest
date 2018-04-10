
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for followUpClosedAssembly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="followUpClosedAssembly"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="followUpClosed" type="{http://design.service.menards.com}followUpClosed" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "followUpClosedAssembly", propOrder = {
    "followUpClosed"
})
public class FollowUpClosedAssembly {

    @XmlElement(required = true)
    protected FollowUpClosed followUpClosed;

    /**
     * Gets the value of the followUpClosed property.
     * 
     * @return
     *     possible object is
     *     {@link FollowUpClosed }
     *     
     */
    public FollowUpClosed getFollowUpClosed() {
        return followUpClosed;
    }

    /**
     * Sets the value of the followUpClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link FollowUpClosed }
     *     
     */
    public void setFollowUpClosed(FollowUpClosed value) {
        this.followUpClosed = value;
    }

}
