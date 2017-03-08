package cdp.selenium.patterns;

import cdp.selenium.business_objects.User;

public class StaticFactory {

    public static User createUser() throws Exception {
        User user = new User();
        user.setLogin();
        user.setPassword();

        return user;
    }

    public static User createUserLogin(String login) throws Exception {
        User user = createUser();
        user.setLogin("New_Login");
        return user;
    }

    public static User createUserPassword(String password) throws Exception {
        User user = createUser();
        user.setPassword("New_Password");
        return user;
    }
}
