package homework_2;

public class MainCategoryList implements Element {

    private String name;

    public MainCategoryList(String name) {
        System.out.println("Открыт " + name);
        System.out.println(" БЫТОВАЯ ТЕХНИКА " + "\n " + "СМАРТФОНЫ И СМАРТ-ЧАСЫ " + "\n " + "ТЕЛЕВИЗОРЫ " + "\n " + "НОУТБУКИ И ПЛАНШЕТЫ "
                + "\n " + "КОМПЬЮТЕРЫ " + "\n " + "НАУШНИКИ И АУДИОТЕХНИКА " + "\n " + "ИГРЫ И КОНСОЛИ");
        click();
    }


    @Override
    public String getType() {
        return null;
    }

    @Override
    public void click() {
        System.out.println("Кликнуть мышкой на любую группу из списка товаров" + "\n");

    }



}
