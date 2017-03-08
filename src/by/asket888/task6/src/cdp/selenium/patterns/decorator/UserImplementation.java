package cdp.selenium.patterns.decorator;

public class UserImplementation implements User {

    private String role, login, password;

    public UserImplementation(String role) {
        super();
        this.role = role;
    }

    public String role() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String login(String login) {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String password(String password) {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
