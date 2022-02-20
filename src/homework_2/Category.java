package homework_2;

public abstract class Category {
    protected String iconDescription;
    protected String name;

    public Category(String name) {
        setValues(name);
    }


    public abstract void open();

    public abstract void stay();


    public void setValues (String name) {
        this.name = name;
    }

    public void setValue (String iconDescription) {
        this.iconDescription = iconDescription;
    }
}


