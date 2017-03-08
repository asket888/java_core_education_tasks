package cdp.selenium.patterns.decorator;

public interface User {

    public String role();
    public String login(String login);
    public String password(String password);
}
