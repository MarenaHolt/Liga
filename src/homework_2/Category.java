package homework_2;

public abstract class Category {
    protected String iconDescription;
    protected String name;

    public Category(String name) {
     setName(name);
  }


    public abstract void open();



    public void setName (String name) {
        this.name = name;
    }


}


