
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountDesignAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountDesignAssociation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountDesign" type="{http://design.service.menards.com}accountDesign" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountDesignAssociation", propOrder = {
    "accountDesign"
})
public class AccountDesignAssociation {

    @XmlElement(required = true)
    protected AccountDesign accountDesign;

    /**
     * Gets the value of the accountDesign property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDesign }
     *     
     */
    public AccountDesign getAccountDesign() {
        return accountDesign;
    }

    /**
     * Sets the value of the accountDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDesign }
     *     
     */
    public void setAccountDesign(AccountDesign value) {
        this.accountDesign = value;
    }

}
