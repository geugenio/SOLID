public class Circle extends Shape{

    public void Circle(){
        super("circle")
    }
    @Override
    public void draw(){
        System.out.println("Drawing a " + this.type);
    }
}