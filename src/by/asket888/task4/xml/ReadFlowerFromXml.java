package by.asket888.java.task4.xml;

import by.asket888.java.task4.overallclass.OverallAbsClass;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/** TASK 4.2:
 *  Add data reading from xml file */

public class ReadFlowerFromXml extends OverallAbsClass{

    private Document XmlDocumentCreation() throws ParserConfigurationException, IOException, SAXException {
        // Create new Builder factory
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        // Create specific Document builder
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        // Create new document using builder for working with it
        Document document = builder.parse(new File(
                "/home/asket/IdeaProjects/JavaTask/src/by/asket888/java/task4/xml/flowers.xml"));
        // normalize document for possible syntax mistakes preventing before working with the document
        document.normalizeDocument();

        // return document variable to use result in other methods
        return document;
    }

    // Override extended from OverallAbsClass method selectFlowerName()
    @Override
    public String selectFlowerName(int flowerId) throws ParserConfigurationException, IOException, SAXException {

        // Create internal variable and set XmlDocumentCreation() in it
        Document document = XmlDocumentCreation();

        // Get root element from xml document (goods_in_flowers_store)
        Element rootElement = document.getDocumentElement();
        // Create new NodeList collection variable and set all elements with tag name "flower" from document in it
        NodeList flowerCollection = rootElement.getElementsByTagName("flower");

        // Create new Element variable and set one element from flower collection with index = method's input parameter
        Element flowerElement = (Element) flowerCollection.item(flowerId);
        // Create new Element variable and set element with tag name "flower_name" with index = 0
        // We know that flower has only one name so we take element from first position
        Element flowerElementName = (Element) flowerElement.getElementsByTagName("flower_name").item(0);
        // Get text content from final Element and set one to extended variable flowerName
        flowerName = flowerElementName.getTextContent();

        // return flowerName variable to use result in child flowers classes
        return flowerName;
    }

    // Brand the same like in method above except different final Element getting
    @Override
    public double selectFlowerPrice(int flowerId) throws ParserConfigurationException, IOException, SAXException {

        Document document = XmlDocumentCreation();

        Element rootElement = document.getDocumentElement();
        NodeList flowerCollection = rootElement.getElementsByTagName("flower");

        Element flowerElement = (Element) flowerCollection.item(flowerId);
        Element flowerElementPrice = (Element) flowerElement.getElementsByTagName("flower_price").item(0);
        flowerPrice = Double.valueOf(flowerElementPrice.getTextContent());

        return flowerPrice;
    }
}
