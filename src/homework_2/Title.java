package homework_2;

public class Title extends Category{



    public Title(String name){
        super(name);
        open();
        stay();


    }

    @Override
    public void open() {
        System.out.println("Открыта категория товаров " + name);
    }

    @Override
    public void stay() {
        System.out.println("Здесь и останемся" + "\n");

    }

    public void setValues (String name) {
        this.name = name;
    }


}

