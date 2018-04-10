
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPreConfiguredDesignByProgramAttributeActive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPreConfiguredDesignByProgramAttributeActive"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="programId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="designActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="designAttributeList" type="{http://design.service.menards.com}designAttributeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPreConfiguredDesignByProgramAttributeActive", propOrder = {
    "programId",
    "designActive",
    "designAttributeList"
})
public class GetPreConfiguredDesignByProgramAttributeActive {

    @XmlElement(namespace = "")
    protected Integer programId;
    @XmlElement(namespace = "")
    protected boolean designActive;
    @XmlElement(namespace = "")
    protected DesignAttributeList designAttributeList;

    /**
     * Gets the value of the programId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgramId() {
        return programId;
    }

    /**
     * Sets the value of the programId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgramId(Integer value) {
        this.programId = value;
    }

    /**
     * Gets the value of the designActive property.
     * 
     */
    public boolean isDesignActive() {
        return designActive;
    }

    /**
     * Sets the value of the designActive property.
     * 
     */
    public void setDesignActive(boolean value) {
        this.designActive = value;
    }

    /**
     * Gets the value of the designAttributeList property.
     * 
     * @return
     *     possible object is
     *     {@link DesignAttributeList }
     *     
     */
    public DesignAttributeList getDesignAttributeList() {
        return designAttributeList;
    }

    /**
     * Sets the value of the designAttributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignAttributeList }
     *     
     */
    public void setDesignAttributeList(DesignAttributeList value) {
        this.designAttributeList = value;
    }

}
