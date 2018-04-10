
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setGuestAccountDesignAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setGuestAccountDesignAssociation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountDesignAssociation" type="{http://design.service.menards.com}accountDesignAssociation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setGuestAccountDesignAssociation", propOrder = {
    "accountDesignAssociation"
})
public class SetGuestAccountDesignAssociation {

    @XmlElement(namespace = "", required = true)
    protected AccountDesignAssociation accountDesignAssociation;

    /**
     * Gets the value of the accountDesignAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDesignAssociation }
     *     
     */
    public AccountDesignAssociation getAccountDesignAssociation() {
        return accountDesignAssociation;
    }

    /**
     * Sets the value of the accountDesignAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDesignAssociation }
     *     
     */
    public void setAccountDesignAssociation(AccountDesignAssociation value) {
        this.accountDesignAssociation = value;
    }

}
