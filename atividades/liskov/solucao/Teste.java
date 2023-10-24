public class Teste{
    public static void main(String[]args) {
        Square quadrado = new Square();
        quadrado.setHeight(20);
        System.out.println(quadrado.width + " " + quadrado.height);

        Rectangle retangulo = new Rectangle();
        retangulo.setHeight(10);
        retangulo.setWidth(10);
        retangulo.calculateArea();
        System.out.println(retangulo.height + " " + retangulo.width + " " +retangulo.calculateArea());

    }
}