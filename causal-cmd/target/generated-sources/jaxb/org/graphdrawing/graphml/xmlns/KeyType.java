//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.21 at 02:00:31 PM EDT 
//


package org.graphdrawing.graphml.xmlns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *       Complex type for the <key> element.
 *     
 * 
 * <p>Java class for key.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="key.type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}desc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}default" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}key.extra.attrib"/&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="dynamic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="for" type="{http://graphml.graphdrawing.org/xmlns}key.for.type" default="all" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "key.type", propOrder = {
    "desc",
    "_default"
})
public class KeyType {

    protected String desc;
    @XmlElement(name = "default")
    protected DefaultType _default;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "dynamic")
    protected Boolean dynamic;
    @XmlAttribute(name = "for")
    protected KeyForType _for;
    @XmlAttribute(name = "attr.name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String attrName;
    @XmlAttribute(name = "attr.type")
    protected KeyTypeType attrType;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultType }
     *     
     */
    public DefaultType getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultType }
     *     
     */
    public void setDefault(DefaultType value) {
        this._default = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the dynamic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDynamic() {
        if (dynamic == null) {
            return false;
        } else {
            return dynamic;
        }
    }

    /**
     * Sets the value of the dynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamic(Boolean value) {
        this.dynamic = value;
    }

    /**
     * Gets the value of the for property.
     * 
     * @return
     *     possible object is
     *     {@link KeyForType }
     *     
     */
    public KeyForType getFor() {
        if (_for == null) {
            return KeyForType.ALL;
        } else {
            return _for;
        }
    }

    /**
     * Sets the value of the for property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyForType }
     *     
     */
    public void setFor(KeyForType value) {
        this._for = value;
    }

    /**
     * Gets the value of the attrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * Sets the value of the attrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrName(String value) {
        this.attrName = value;
    }

    /**
     * Gets the value of the attrType property.
     * 
     * @return
     *     possible object is
     *     {@link KeyTypeType }
     *     
     */
    public KeyTypeType getAttrType() {
        return attrType;
    }

    /**
     * Sets the value of the attrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyTypeType }
     *     
     */
    public void setAttrType(KeyTypeType value) {
        this.attrType = value;
    }

}