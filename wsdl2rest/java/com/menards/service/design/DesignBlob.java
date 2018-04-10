
package com.menards.service.design;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for designBlob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="designBlob"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="designBlob" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="blobMimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "designBlob", propOrder = {
    "designId",
    "designBlob",
    "blobMimeType"
})
public class DesignBlob {

    protected Long designId;
    protected byte[] designBlob;
    protected String blobMimeType;

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

    /**
     * Gets the value of the designBlob property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDesignBlob() {
        return designBlob;
    }

    /**
     * Sets the value of the designBlob property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDesignBlob(byte[] value) {
        this.designBlob = value;
    }

    /**
     * Gets the value of the blobMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlobMimeType() {
        return blobMimeType;
    }

    /**
     * Sets the value of the blobMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlobMimeType(String value) {
        this.blobMimeType = value;
    }

}
