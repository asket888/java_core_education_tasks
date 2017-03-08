package cdp.selenium.patterns.decorator;

public class UserDecorator implements User{

    protected User user;

    protected UserDecorator(User user) {
        this.user = user;
    }

    public String role() {
        return user.role();
    }

    public String login(String login) {
        return user.login(login);
    }

    public String password(String password) {
        return user.password(password);
    }
}
