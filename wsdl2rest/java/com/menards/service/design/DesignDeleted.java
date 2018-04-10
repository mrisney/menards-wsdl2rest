
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for designDeleted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="designDeleted"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
 *         &lt;element name="deleteFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "designDeleted", propOrder = {
    "designId",
    "deleteFlag"
})
public class DesignDeleted {

    protected long designId;
    protected boolean deleteFlag;

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
     * Gets the value of the deleteFlag property.
     * 
     */
    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Sets the value of the deleteFlag property.
     * 
     */
    public void setDeleteFlag(boolean value) {
        this.deleteFlag = value;
    }

}
