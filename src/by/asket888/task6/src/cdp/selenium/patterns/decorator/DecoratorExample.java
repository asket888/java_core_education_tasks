package cdp.selenium.patterns.decorator;

public class DecoratorExample {

    public static void main(String[] args) {
        // create new employee
        User user = new UserImplementation("admin");
        user.login("Administrator");
        user.password("Password");
    }
}
