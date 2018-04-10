
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountDesign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountDesign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
 *         &lt;element name="guestAccountId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
 *         &lt;element name="guestAccountAddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountDesign", propOrder = {
    "designId",
    "guestAccountId",
    "guestAccountAddressId"
})
public class AccountDesign {

    protected long designId;
    protected long guestAccountId;
    protected Long guestAccountAddressId;

    /**
     * Gets the value of the designId property.
     * 
     */
    public long getDesignId() {
        return designId;
    }

    /**
     * Sets the value of the designId property.
     * 
     */
    public void setDesignId(long value) {
        this.designId = value;
    }

    /**
     * Gets the value of the guestAccountId property.
     * 
     */
    public long getGuestAccountId() {
        return guestAccountId;
    }

    /**
     * Sets the value of the guestAccountId property.
     * 
     */
    public void setGuestAccountId(long value) {
        this.guestAccountId = value;
    }

    /**
     * Gets the value of the guestAccountAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestAccountAddressId() {
        return guestAccountAddressId;
    }

    /**
     * Sets the value of the guestAccountAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestAccountAddressId(Long value) {
        this.guestAccountAddressId = value;
    }

}
