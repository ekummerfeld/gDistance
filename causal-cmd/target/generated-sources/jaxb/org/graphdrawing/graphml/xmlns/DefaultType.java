//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.21 at 02:00:31 PM EDT 
//


package org.graphdrawing.graphml.xmlns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       Complex type for the <default> element.
 *       default.type is mixed, that is, data may contain #PCDATA.
 *       Content type: extension of data-extension.type which is empty
 *                     per default.
 *     
 * 
 * <p>Java class for default.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="default.type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://graphml.graphdrawing.org/xmlns}data-extension.type"&gt;
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}default.extra.attrib"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "default.type")
public class DefaultType
    extends DataExtensionType
{


}