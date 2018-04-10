
package com.menards.service.design;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operationStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="successful" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="operationStatusFault" type="{http://design.service.menards.com}operationStatusFault" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operationStatus", propOrder = {
    "successful",
    "operationStatusFault"
})
public class OperationStatus {

    protected Boolean successful;
    protected List<OperationStatusFault> operationStatusFault;

    /**
     * Gets the value of the successful property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuccessful() {
        return successful;
    }

    /**
     * Sets the value of the successful property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuccessful(Boolean value) {
        this.successful = value;
    }

    /**
     * Gets the value of the operationStatusFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationStatusFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationStatusFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationStatusFault }
     * 
     * 
     */
    public List<OperationStatusFault> getOperationStatusFault() {
        if (operationStatusFault == null) {
            operationStatusFault = new ArrayList<OperationStatusFault>();
        }
        return this.operationStatusFault;
    }

}
