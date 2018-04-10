
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for designAssembly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="designAssembly"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://design.service.menards.com}guest" minOccurs="0"/&gt;
 *         &lt;element name="design" type="{http://design.service.menards.com}design" form="qualified"/&gt;
 *         &lt;element name="attachment" type="{http://design.service.menards.com}attachment" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "designAssembly", propOrder = {
    "guest",
    "design",
    "attachment"
})
public class DesignAssembly {

    protected Guest guest;
    @XmlElement(required = true)
    protected Design design;
    protected Attachment attachment;

    /**
     * Gets the value of the guest property.
     * 
     * @return
     *     possible object is
     *     {@link Guest }
     *     
     */
    public Guest getGuest() {
        return guest;
    }

    /**
     * Sets the value of the guest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guest }
     *     
     */
    public void setGuest(Guest value) {
        this.guest = value;
    }

    /**
     * Gets the value of the design property.
     * 
     * @return
     *     possible object is
     *     {@link Design }
     *     
     */
    public Design getDesign() {
        return design;
    }

    /**
     * Sets the value of the design property.
     * 
     * @param value
     *     allowed object is
     *     {@link Design }
     *     
     */
    public void setDesign(Design value) {
        this.design = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setAttachment(Attachment value) {
        this.attachment = value;
    }

}
