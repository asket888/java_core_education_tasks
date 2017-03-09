package add_to_card.locators;

public interface AddToCardLocator {

    String searchInputLocator = "//input[@id='gh-ac']";
    String searchButtonLocator = "//input[@id='gh-btn']";
    String firstElementInSearchQueryTitleLocator = "//ul[@id='ListViewInner']/li[1]/h3/a";
    String addToCardButtonLocator = "//a[@id='isCartBtn_btn']";
    String pageTitleLocator = "//div[@id='PageTitle']/h1";
    String goodsInCartTitleLocator = "//a[contains(@id,'title')]";

    String cartButtonLocator = "//li[@id='gh-cart']/a";

    String deleteButtonLocator = "//div[contains(@id, 'item1')]//a[contains(@aria-label, 'Удалить')]";
}
