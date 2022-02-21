package homework_2;

public class Main {
    public static void main(String[] args) {

        SearchBar ozon = new SearchBar("Искать на Ozon", "Кликнуть мышкой на поиск");

        TitleCatalogResultsHeader titleCatalogResultsHeader_ozon = new TitleCatalogResultsHeader("Электроника");

        MainCategoryList mainCategoryList_ozon = new MainCategoryList("Список товаров");

        Advertising advertising_ozon = new Advertising("Рекламный блок");

        AdvertisingLoyalty advertisingLoyalty_ozon = new AdvertisingLoyalty("Рекламный блок лояльности от Ozon");

        ProductCategoryElementsTable te_ozon = new ProductCategoryElementsTable("Группы товаров в категории Электроника");


    }


}
