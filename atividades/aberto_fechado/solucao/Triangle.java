public class Triangle extends Shape{

    public void Triangle(){
        super("triangle")
    }
    @Override
    public void draw(){
        System.out.println("Drawing a " + this.type);
    }
}