package homework_2;

public class SearchBar {

    private String field; //инкапсуляция (поля закрыты для общего использования)
    private String iconMagnifier;

    public SearchBar(String field, String iconMagnifier) { //конструктор класса
        System.out.println("Открыта страница Ozon");
        setValues(field, iconMagnifier);
        System.out.println(getDescription() + "\n");
    }

    public void setValues(String field, String iconMagnifier) {
        this.field = field;
        this.iconMagnifier = iconMagnifier;
    }

    public String getDescription() {
        String info = "Открыто поле поиска с надписью " + field + "\n" + "Теперь в этом поле можно написать название нужного товара" + "\n" + "И " + iconMagnifier;
        return info;
    }


}
