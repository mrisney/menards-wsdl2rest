
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for followUpClosed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="followUpClosed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="followUpId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
 *         &lt;element name="storeNumber" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="estimateNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="estimateClosedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "followUpClosed", propOrder = {
    "followUpId",
    "storeNumber",
    "estimateNumber",
    "estimateClosedDateTime"
})
public class FollowUpClosed {

    protected long followUpId;
    protected int storeNumber;
    @XmlElement(required = true)
    protected String estimateNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimateClosedDateTime;

    /**
     * Gets the value of the followUpId property.
     * 
     */
    public long getFollowUpId() {
        return followUpId;
    }

    /**
     * Sets the value of the followUpId property.
     * 
     */
    public void setFollowUpId(long value) {
        this.followUpId = value;
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
     * Gets the value of the estimateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimateNumber() {
        return estimateNumber;
    }

    /**
     * Sets the value of the estimateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimateNumber(String value) {
        this.estimateNumber = value;
    }

    /**
     * Gets the value of the estimateClosedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimateClosedDateTime() {
        return estimateClosedDateTime;
    }

    /**
     * Sets the value of the estimateClosedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimateClosedDateTime(XMLGregorianCalendar value) {
        this.estimateClosedDateTime = value;
    }

}
