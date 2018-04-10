
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specialOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="specialOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="socNumber" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
 *         &lt;element name="storeNumber" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="designId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specialOrder", propOrder = {
    "socNumber",
    "storeNumber",
    "designId"
})
public class SpecialOrder {

    protected long socNumber;
    protected int storeNumber;
    protected Long designId;

    /**
     * Gets the value of the socNumber property.
     * 
     */
    public long getSocNumber() {
        return socNumber;
    }

    /**
     * Sets the value of the socNumber property.
     * 
     */
    public void setSocNumber(long value) {
        this.socNumber = value;
    }

    /**
     * Gets the value of the storeNumber property.
     * 
     */
    public int getStoreNumber() {
        return storeNumber;
    }

    /**
     * Sets the value of the storeNumber property.
     * 
     */
    public void setStoreNumber(int value) {
        this.storeNumber = value;
    }

    /**
     * Gets the value of the designId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDesignId() {
        return designId;
    }

    /**
     * Sets the value of the designId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDesignId(Long value) {
        this.designId = value;
    }

}
