public class Rectangle {

    double width, height;
    
    //Construtor para os valores do retângulo
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    //Área
    public double getArea() {
        return width * height;
    }
    //Perímetro
    public double getPerimeter() {
        return 2 * (width + height);
    }
    //Diagonal
    public double getDiagonal() {
        return Math.sqrt(width * width + height * height);
    }
}