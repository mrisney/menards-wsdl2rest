
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDesignByProgramGuestAccountIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDesignByProgramGuestAccountIdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designList" type="{http://design.service.menards.com}designList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDesignByProgramGuestAccountIdResponse", propOrder = {
    "designList"
})
public class GetDesignByProgramGuestAccountIdResponse {

    @XmlElement(namespace = "")
    protected DesignList designList;

    /**
     * Gets the value of the designList property.
     * 
     * @return
     *     possible object is
     *     {@link DesignList }
     *     
     */
    public DesignList getDesignList() {
        return designList;
    }

    /**
     * Sets the value of the designList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignList }
     *     
     */
    public void setDesignList(DesignList value) {
        this.designList = value;
    }

}
