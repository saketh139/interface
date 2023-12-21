public interface Laptop {
    public void cut();

    public void paste();

    public void copy();

    public void keyboard();

    default void security(){
        System.out.println("implement code");
    }
    static  void camera(){
        System.out.println("implement code");
    }

    private void display(){
        System.out.println("implement code");
    }
}
