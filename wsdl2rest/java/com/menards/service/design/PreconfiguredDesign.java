
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
 * <p>Java class for preconfiguredDesign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="preconfiguredDesign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="designId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/&gt;
 *         &lt;element name="programId" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="programVersion" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="teamMemberName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="createdTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="modifiedTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="accessedTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="designActive" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/&gt;
 *         &lt;element name="designDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/&gt;
 *         &lt;element name="preconfiguredDesignAttribute" type="{http://design.service.menards.com}preconfiguredDesignAttribute" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preconfiguredDesign", propOrder = {
    "designId",
    "programId",
    "programVersion",
    "teamMemberName",
    "createdTimestamp",
    "modifiedTimestamp",
    "accessedTimestamp",
    "designActive",
    "designDeleted",
    "preconfiguredDesignAttribute"
})
public class PreconfiguredDesign {

    protected long designId;
    protected int programId;
    @XmlElement(required = true)
    protected String programVersion;
    @XmlElement(required = true)
    protected String teamMemberName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTimestamp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedTimestamp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accessedTimestamp;
    protected boolean designActive;
    protected boolean designDeleted;
    @XmlElement(nillable = true)
    protected List<PreconfiguredDesignAttribute> preconfiguredDesignAttribute;

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
     * Gets the value of the teamMemberName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberName() {
        return teamMemberName;
    }

    /**
     * Sets the value of the teamMemberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberName(String value) {
        this.teamMemberName = value;
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
     * Gets the value of the designDeleted property.
     * 
     */
    public boolean isDesignDeleted() {
        return designDeleted;
    }

    /**
     * Sets the value of the designDeleted property.
     * 
     */
    public void setDesignDeleted(boolean value) {
        this.designDeleted = value;
    }

    /**
     * Gets the value of the preconfiguredDesignAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preconfiguredDesignAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreconfiguredDesignAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreconfiguredDesignAttribute }
     * 
     * 
     */
    public List<PreconfiguredDesignAttribute> getPreconfiguredDesignAttribute() {
        if (preconfiguredDesignAttribute == null) {
            preconfiguredDesignAttribute = new ArrayList<PreconfiguredDesignAttribute>();
        }
        return this.preconfiguredDesignAttribute;
    }

}
