package cdp.selenium.util;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlReaderUtil {

    private Document XmlDocumentCreation(String file) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document document = builder.parse(new File(file));
        document.normalizeDocument();

        return document;
    }

    public String getParameter(int id, String file, String value) throws ParserConfigurationException, IOException, SAXException {

        Document document = XmlDocumentCreation(file);

        Element rootElement = document.getDocumentElement();
        NodeList loginCollection = rootElement.getElementsByTagName("parameter");

        Element element = (Element) loginCollection.item(id);
        Element elementValue = (Element) element.getElementsByTagName(value).item(0);
        String login = elementValue.getTextContent();

        return login;
    }

}
