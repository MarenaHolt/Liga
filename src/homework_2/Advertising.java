package homework_2;

public class Advertising implements Element {

    private String name;
    protected String guarantee = "Гарантия от производителей";
    protected String refund = "Возврат 30 дней";
    protected String payment = "Рассрочка от 6 месяцев";
    protected String cashback = "Кэшбек до 8% с Ozon Счётом";


    public Advertising(String name){
        System.out.println("В этой части страницы отображается " + name);
        click();
        open();
    }



    public void open() {
        System.out.println("Открывается рекламное сообщение" + "\n");
    }


    @Override
    public String getType() {
        return null;
    }

    @Override
    public void click() {
        System.out.println("Кликнуть мышкой на рекламу");
    }


}

