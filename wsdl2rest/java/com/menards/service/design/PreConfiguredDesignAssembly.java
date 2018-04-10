
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preConfiguredDesignAssembly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="preConfiguredDesignAssembly"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preConfiguredDesign" type="{http://design.service.menards.com}preconfiguredDesign" form="qualified"/&gt;
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
@XmlType(name = "preConfiguredDesignAssembly", propOrder = {
    "preConfiguredDesign",
    "attachment"
})
public class PreConfiguredDesignAssembly {

    @XmlElement(required = true)
    protected PreconfiguredDesign preConfiguredDesign;
    protected Attachment attachment;

    /**
     * Gets the value of the preConfiguredDesign property.
     * 
     * @return
     *     possible object is
     *     {@link PreconfiguredDesign }
     *     
     */
    public PreconfiguredDesign getPreConfiguredDesign() {
        return preConfiguredDesign;
    }

    /**
     * Sets the value of the preConfiguredDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreconfiguredDesign }
     *     
     */
    public void setPreConfiguredDesign(PreconfiguredDesign value) {
        this.preConfiguredDesign = value;
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
