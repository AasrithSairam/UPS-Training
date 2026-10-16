class Shape{
    void area(){};
}

class Circle extends Shape{
    int r;
    Circle(int r){
        this.r=r;
    }
    void area(){
        System.out.println("Circle area:"+(3.14*r*r));
    }
}

class Rectangle extends Shape{
    int l,w;
    Rectangle(int l,int w){
        this.l=l;
        this.w=w;
    }
    void area(){
        System.out.println("Rectangle area:"+(l*w));
    }
}
class Triangle extends Shape{
    int b,h;
    Triangle(int b,int h){
        this.b=b;
        this.h=h;
    }
    void area(){
        System.out.println("Triangle area:"+(0.5*b*h));
    }
}


public class Shapes{
    public static void main(String[] args){
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(7);
        shapes[1]=new Rectangle(5,4);
        shapes[2]=new Triangle(6,8);

        for(int i=0;i<shapes.length;i++){
            shapes[i].area();
        }
    }
}