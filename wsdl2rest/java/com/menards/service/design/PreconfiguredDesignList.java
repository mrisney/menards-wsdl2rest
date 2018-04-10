
package com.menards.service.design;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preconfiguredDesignList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="preconfiguredDesignList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preconfiguredDesign" type="{http://design.service.menards.com}preconfiguredDesign" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preconfiguredDesignList", propOrder = {
    "preconfiguredDesign"
})
public class PreconfiguredDesignList {

    @XmlElement(nillable = true)
    protected List<PreconfiguredDesign> preconfiguredDesign;

    /**
     * Gets the value of the preconfiguredDesign property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preconfiguredDesign property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreconfiguredDesign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreconfiguredDesign }
     * 
     * 
     */
    public List<PreconfiguredDesign> getPreconfiguredDesign() {
        if (preconfiguredDesign == null) {
            preconfiguredDesign = new ArrayList<PreconfiguredDesign>();
        }
        return this.preconfiguredDesign;
    }

}
