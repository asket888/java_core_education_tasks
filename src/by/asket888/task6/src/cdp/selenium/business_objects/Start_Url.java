package cdp.selenium.business_objects;

import cdp.selenium.util.XmlReaderUtil;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Start_Url {

    public Start_Url() throws Exception {
        setUrl();
    }

    private String START_URL;

    private void setUrl() throws IOException, SAXException, ParserConfigurationException
    {START_URL = new XmlReaderUtil().getParameter(0, "src/resources/startUrlData.xml", "start_url");}
    public String getUrl() {return START_URL;}
}
