package homework_2;

public class Ad extends Category implements Element {

    private String guarantee = "Гарантия от производителей";
    private String refund = "Возврат 30 дней";
    private String payment = "Рассрочка от 6 месяцев";
    private String cashback = "кэшбек до 8% с Ozon Счётом";

    public Ad (String name){
        super(name);
        open();
        click();
        stay();
    }

    public Ad (String name, String iconDescription) {
        super(iconDescription);
        setValues(name);
        setValue(iconDescription);
        openAd();
        stay();
    }






    @Override
    public void open() {
        System.out.println("Открыт " + name + "\n" + "Здесь могла бы быть ваша реклама, но пока много чужой");

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
        System.out.println("Кликнуть мышкой на рекламу");

    }

    public void openAd () {
        System.out.println("Открыт " + name + " " + iconDescription + "\n" + guarantee + "  " + refund + "  " + payment + "  " + cashback);

    }
}

