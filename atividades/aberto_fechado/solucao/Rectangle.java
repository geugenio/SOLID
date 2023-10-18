public class Rectangle extends Shape{

    public void Rectangle(){
        super("rectangle")
    }
    @Override
    public void draw(){
        System.out.println("Drawing a " + this.type);
    }
}