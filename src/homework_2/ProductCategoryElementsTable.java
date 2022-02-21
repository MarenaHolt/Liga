package homework_2;

import java.util.Arrays;

public class ProductCategoryElementsTable extends Category implements Element{

    String[] array = {"Смартфоны ", "Планшеты ", "Ноутбуки", "Телевизоры", "Компьютеры и комплектующие", "Смарт-часы и фитнес-браслеты"};
    String[] arrayTwo = {"Аксессуары для смартфоном ", "Наушники и аудиотехника ", "Фото- и видеокамеры", "Игры и консоли", "Умный дом и безопасность", "Офисная техника"};


    public ProductCategoryElementsTable(String name){
        super(name);
        System.out.println("Открыты " + name);
        System.out.println(Arrays.toString(array) + "\n" + Arrays.toString(arrayTwo));
        click();
        open();

    }


    @Override
    public void open() {
        System.out.println("Открыта эта группа товаров");
    }



    @Override
    public String getType() {
        return null;
    }

    @Override
    public void click() {
        System.out.println("Кликнуть по любой группе товаров в категории Электроника");
    }
}
