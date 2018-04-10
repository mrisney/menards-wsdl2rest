
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for designActive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="designActive"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
 *         &lt;element name="activeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "designActive", propOrder = {
    "designId",
    "activeFlag"
})
public class DesignActive {

    protected long designId;
    protected boolean activeFlag;

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
     * Gets the value of the activeFlag property.
     * 
     */
    public boolean isActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     */
    public void setActiveFlag(boolean value) {
        this.activeFlag = value;
    }

}
