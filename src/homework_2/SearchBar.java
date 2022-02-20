package homework_2;

public class SearchBar {

    private String field; //инкапсуляция (поля закрыты для общего использования)
    private String icon;

    public SearchBar(String field, String icon) { //конструктор класса
        System.out.println("Открыта страница Ozon");
        setValues(field, icon);
        System.out.println(getValues() + "\n");
    }

    public void setValues(String field, String icon) {
        this.field = field;
        this.icon = icon;
    }

    public String getValues() {
        String info = "Открыто поле поиска с надписью " + field + "\n" + "Теперь в этом поле можно написать название нужного товара" + "\n" + "И " + icon + "\n" + "Но нам этого не нужно, остаемся на этой странице";
        return info;
    }


}
