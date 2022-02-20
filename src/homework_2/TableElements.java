package homework_2;

import java.util.Arrays;

public class TableElements extends Category implements Element{

    String[] array = {"Смартфоны ", "Планшеты ", "Ноутбуки", "Телевизоры", "Компьютеры и комплектующие", "Смарт-часы и фитнес-браслеты"};
    String[] arrayTwo = {"Аксессуары для смартфоном ", "Наушники и аудиотехника ", "Фото- и видеокамеры", "Игры и консоли", "Умный дом и безопасность", "Офисная техника"};


    public TableElements(String name){
        super(name);
        open();
        click();
        stay();
    }


    @Override
    public void open() {
        System.out.println("Открыты " + name);
        System.out.println(Arrays.toString(array) + "\n" + Arrays.toString(arrayTwo));

    }

    @Override
    public void stay() {
        System.out.println("Но нам этого не нужно, остаемся на этой странице" + "\n");
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void click() {
        System.out.println("Можно кликнуть по любой группе товаров в категории Электроника и увидеть товары из данной группы на новой странице");

    }
}
