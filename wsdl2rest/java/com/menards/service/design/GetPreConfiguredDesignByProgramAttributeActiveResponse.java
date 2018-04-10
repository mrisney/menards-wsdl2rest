
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPreConfiguredDesignByProgramAttributeActiveResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPreConfiguredDesignByProgramAttributeActiveResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preconfiguredDesignList" type="{http://design.service.menards.com}preconfiguredDesignList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPreConfiguredDesignByProgramAttributeActiveResponse", propOrder = {
    "preconfiguredDesignList"
})
public class GetPreConfiguredDesignByProgramAttributeActiveResponse {

    @XmlElement(namespace = "")
    protected PreconfiguredDesignList preconfiguredDesignList;

    /**
     * Gets the value of the preconfiguredDesignList property.
     * 
     * @return
     *     possible object is
     *     {@link PreconfiguredDesignList }
     *     
     */
    public PreconfiguredDesignList getPreconfiguredDesignList() {
        return preconfiguredDesignList;
    }

    /**
     * Sets the value of the preconfiguredDesignList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreconfiguredDesignList }
     *     
     */
    public void setPreconfiguredDesignList(PreconfiguredDesignList value) {
        this.preconfiguredDesignList = value;
    }

}
