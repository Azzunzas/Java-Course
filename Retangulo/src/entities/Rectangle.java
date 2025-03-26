package entities;

public class Rectangle {

    public double width;
    public double height;

    public double area(){
        return width * height;
    }
    public double perimeter(){
        return (width * 2.00) + (height * 2.00);
    }
    public double diagonal(){
        return Math.sqrt((width * width) + (height * height));
    }
    public String toString(){
        return "area: "+ String.format("%.2f", area()) + " perimetro: "+String.format("%.2f", perimeter())+ " diagonal: "+ String.format("%.2f",diagonal());
    }
}


