//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.29 at 09:58:06 PM IST 
//


package services.transaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;


/**
 * <p>Java class for transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="transactionTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="transactionRemarks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction", propOrder = {
    "transactionId",
    "transactionDate",
    "transactionTo",
    "transactionAmount",
    "transactionRemarks",
    "transactionBy"
})
public class Transaction {

    protected int transactionId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(required = true)
    protected String transactionTo;
    protected double transactionAmount;
    @XmlElement(required = true)
    protected String transactionRemarks;
    @XmlElement(required = true)
    protected String transactionBy;

    /**
     * Gets the value of the transactionId property.
     * 
     */
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(int value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTo() {
        return transactionTo;
    }

    /**
     * Sets the value of the transactionTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTo(String value) {
        this.transactionTo = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     */
    public double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     */
    public void setTransactionAmount(double value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the transactionRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionRemarks() {
        return transactionRemarks;
    }

    /**
     * Sets the value of the transactionRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionRemarks(String value) {
        this.transactionRemarks = value;
    }

    /**
     * Gets the value of the transactionBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionBy() {
        return transactionBy;
    }

    /**
     * Sets the value of the transactionBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionBy(String value) {
        this.transactionBy = value;
    }

}
