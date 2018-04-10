
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
 *         &lt;element name="attributeId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteAttribute", propOrder = {
    "designId",
    "attributeId"
})
public class DeleteAttribute {

    protected long designId;
    protected long attributeId;

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
     * Gets the value of the attributeId property.
     * 
     */
    public long getAttributeId() {
        return attributeId;
    }

    /**
     * Sets the value of the attributeId property.
     * 
     */
    public void setAttributeId(long value) {
        this.attributeId = value;
    }

}
