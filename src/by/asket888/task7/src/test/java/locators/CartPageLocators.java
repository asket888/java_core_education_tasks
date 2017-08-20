package locators;

public interface CartPageLocators {

    String cartButtonLocator = "//li[@id='gh-cart']/a";
    String deleteButtonLocator = "//a[contains(@aria-label, 'Remove')]";
    String goodsInCartTitleLocator = "//span[contains(@id,'title')]";
}
