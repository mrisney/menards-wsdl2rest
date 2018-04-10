
package com.menards.service.design;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for design complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="design"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
 *         &lt;element name="programId" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="programVersion" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="storeNumber" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="teamMemberNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="specialNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="estimateNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="estimateTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="estimatePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="jobDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="requestedTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="createdTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="accessedTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="modifiedTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="designDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="followUpId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="followUpClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="midwestDesigner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="midwestTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="midwestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="guestAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="guestAccountAddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="anonymousDesign" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="specialOrder" type="{http://design.service.menards.com}specialOrder" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "design", propOrder = {
    "designId",
    "programId",
    "programVersion",
    "storeNumber",
    "teamMemberNumber",
    "specialNotes",
    "estimateNumber",
    "estimateTypeId",
    "estimatePrice",
    "jobDescription",
    "requestedTimestamp",
    "createdTimestamp",
    "accessedTimestamp",
    "modifiedTimestamp",
    "designDeleted",
    "followUpId",
    "followUpClosed",
    "midwestDesigner",
    "midwestTrackingNumber",
    "midwestDescription",
    "guestAccountId",
    "guestAccountAddressId",
    "anonymousDesign",
    "specialOrder"
})
public class Design {

    protected long designId;
    protected int programId;
    @XmlElement(required = true)
    protected String programVersion;
    protected int storeNumber;
    protected Long teamMemberNumber;
    protected String specialNotes;
    protected Long estimateNumber;
    protected Integer estimateTypeId;
    protected Double estimatePrice;
    protected String jobDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedTimestamp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTimestamp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accessedTimestamp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedTimestamp;
    protected Boolean designDeleted;
    protected Long followUpId;
    protected Boolean followUpClosed;
    protected String midwestDesigner;
    protected String midwestTrackingNumber;
    protected String midwestDescription;
    protected Long guestAccountId;
    protected Long guestAccountAddressId;
    protected Boolean anonymousDesign;
    @XmlElement(nillable = true)
    protected List<SpecialOrder> specialOrder;

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
     * Gets the value of the programId property.
     * 
     */
    public int getProgramId() {
        return programId;
    }

    /**
     * Sets the value of the programId property.
     * 
     */
    public void setProgramId(int value) {
        this.programId = value;
    }

    /**
     * Gets the value of the programVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramVersion() {
        return programVersion;
    }

    /**
     * Sets the value of the programVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramVersion(String value) {
        this.programVersion = value;
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
     * Gets the value of the teamMemberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTeamMemberNumber() {
        return teamMemberNumber;
    }

    /**
     * Sets the value of the teamMemberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTeamMemberNumber(Long value) {
        this.teamMemberNumber = value;
    }

    /**
     * Gets the value of the specialNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialNotes() {
        return specialNotes;
    }

    /**
     * Sets the value of the specialNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialNotes(String value) {
        this.specialNotes = value;
    }

    /**
     * Gets the value of the estimateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimateNumber() {
        return estimateNumber;
    }

    /**
     * Sets the value of the estimateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimateNumber(Long value) {
        this.estimateNumber = value;
    }

    /**
     * Gets the value of the estimateTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstimateTypeId() {
        return estimateTypeId;
    }

    /**
     * Sets the value of the estimateTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstimateTypeId(Integer value) {
        this.estimateTypeId = value;
    }

    /**
     * Gets the value of the estimatePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatePrice() {
        return estimatePrice;
    }

    /**
     * Sets the value of the estimatePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatePrice(Double value) {
        this.estimatePrice = value;
    }

    /**
     * Gets the value of the jobDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDescription() {
        return jobDescription;
    }

    /**
     * Sets the value of the jobDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDescription(String value) {
        this.jobDescription = value;
    }

    /**
     * Gets the value of the requestedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedTimestamp() {
        return requestedTimestamp;
    }

    /**
     * Sets the value of the requestedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedTimestamp(XMLGregorianCalendar value) {
        this.requestedTimestamp = value;
    }

    /**
     * Gets the value of the createdTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * Sets the value of the createdTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTimestamp(XMLGregorianCalendar value) {
        this.createdTimestamp = value;
    }

    /**
     * Gets the value of the accessedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccessedTimestamp() {
        return accessedTimestamp;
    }

    /**
     * Sets the value of the accessedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccessedTimestamp(XMLGregorianCalendar value) {
        this.accessedTimestamp = value;
    }

    /**
     * Gets the value of the modifiedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedTimestamp() {
        return modifiedTimestamp;
    }

    /**
     * Sets the value of the modifiedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedTimestamp(XMLGregorianCalendar value) {
        this.modifiedTimestamp = value;
    }

    /**
     * Gets the value of the designDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDesignDeleted() {
        return designDeleted;
    }

    /**
     * Sets the value of the designDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDesignDeleted(Boolean value) {
        this.designDeleted = value;
    }

    /**
     * Gets the value of the followUpId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFollowUpId() {
        return followUpId;
    }

    /**
     * Sets the value of the followUpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFollowUpId(Long value) {
        this.followUpId = value;
    }

    /**
     * Gets the value of the followUpClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFollowUpClosed() {
        return followUpClosed;
    }

    /**
     * Sets the value of the followUpClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFollowUpClosed(Boolean value) {
        this.followUpClosed = value;
    }

    /**
     * Gets the value of the midwestDesigner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidwestDesigner() {
        return midwestDesigner;
    }

    /**
     * Sets the value of the midwestDesigner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidwestDesigner(String value) {
        this.midwestDesigner = value;
    }

    /**
     * Gets the value of the midwestTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidwestTrackingNumber() {
        return midwestTrackingNumber;
    }

    /**
     * Sets the value of the midwestTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidwestTrackingNumber(String value) {
        this.midwestTrackingNumber = value;
    }

    /**
     * Gets the value of the midwestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidwestDescription() {
        return midwestDescription;
    }

    /**
     * Sets the value of the midwestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidwestDescription(String value) {
        this.midwestDescription = value;
    }

    /**
     * Gets the value of the guestAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestAccountId() {
        return guestAccountId;
    }

    /**
     * Sets the value of the guestAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestAccountId(Long value) {
        this.guestAccountId = value;
    }

    /**
     * Gets the value of the guestAccountAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGuestAccountAddressId() {
        return guestAccountAddressId;
    }

    /**
     * Sets the value of the guestAccountAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGuestAccountAddressId(Long value) {
        this.guestAccountAddressId = value;
    }

    /**
     * Gets the value of the anonymousDesign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnonymousDesign() {
        return anonymousDesign;
    }

    /**
     * Sets the value of the anonymousDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnonymousDesign(Boolean value) {
        this.anonymousDesign = value;
    }

    /**
     * Gets the value of the specialOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialOrder }
     * 
     * 
     */
    public List<SpecialOrder> getSpecialOrder() {
        if (specialOrder == null) {
            specialOrder = new ArrayList<SpecialOrder>();
        }
        return this.specialOrder;
    }

}
