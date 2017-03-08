package cdp.selenium.business_objects;

import cdp.selenium.util.XmlReaderUtil;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class User {

    public User() throws Exception {
        setLogin();
        setPassword();
    }

    private String PASSWORD;
    private String LOGIN;

    public void setLogin() throws IOException, SAXException, ParserConfigurationException
    {this.LOGIN = new XmlReaderUtil().getParameter(0, "src/resources/authorizationData.xml", "login");}
    public String getLogin() {return LOGIN;}

    public void setPassword() throws IOException, SAXException, ParserConfigurationException
    {this.PASSWORD = new XmlReaderUtil().getParameter(0, "src/resources/authorizationData.xml", "password");}
    public String getPassword() {return PASSWORD;}

    public void setLogin(String login)
    {this.LOGIN = login;}

    public void setPassword(String password)
    {this.PASSWORD = password;}

//    public static User createUser() throws ParserConfigurationException, SAXException, IOException {
//        User user = new User();
//        user.setLogin();
//        user.setPassword();
//
//        return user;
//    }

}
