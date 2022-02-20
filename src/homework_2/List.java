package homework_2;

public class List extends Category
        implements Element {

    public List (String name) {
        super(name);
        setValues(name);
        open();
        click();
        stay();
    }


    @Override
    public String getType() {
        return null;
    }

    @Override
    public void click() {
        System.out.println("Можно кликнуть мышкой по элементу 'ИГРЫ И КОНСОЛИ' или любой другой ");

    }

    @Override
    public void open() {
        System.out.println("Открыт " + name);
        System.out.println("БЫТОВАЯ ТЕХНИКА " + " СМАРТФОНЫ И СМАРТ-ЧАСЫ " + " ТЕЛЕВИЗОРЫ " + " НОУТБУКИ И ПЛАНШЕТЫ "
                + " КОМПЬЮТЕРЫ " + " НАУШНИКИ И АУДИОТЕХНИКА " + " ИГРЫ И КОНСОЛИ ");

    }

    @Override
    public void stay() {
        System.out.println("Но нам этого не нужно, остаемся на этой странице" + "\n");
    }
}
