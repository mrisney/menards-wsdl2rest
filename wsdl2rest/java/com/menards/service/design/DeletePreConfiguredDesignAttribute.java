
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deletePreConfiguredDesignAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deletePreConfiguredDesignAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deleteAttributeList" type="{http://design.service.menards.com}deleteAttributeList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletePreConfiguredDesignAttribute", propOrder = {
    "deleteAttributeList"
})
public class DeletePreConfiguredDesignAttribute {

    @XmlElement(namespace = "", required = true)
    protected DeleteAttributeList deleteAttributeList;

    /**
     * Gets the value of the deleteAttributeList property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteAttributeList }
     *     
     */
    public DeleteAttributeList getDeleteAttributeList() {
        return deleteAttributeList;
    }

    /**
     * Sets the value of the deleteAttributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteAttributeList }
     *     
     */
    public void setDeleteAttributeList(DeleteAttributeList value) {
        this.deleteAttributeList = value;
    }

}
