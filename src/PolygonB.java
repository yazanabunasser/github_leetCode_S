public interface PolygonB {
    void getArea();
    default  void getSides(){
        System.out.println("I can get sides of a polygon. ");
    }
}

class RectangleB implements PolygonB{
    @Override
    public void getArea() {
        int length = 6 ;
        int breadth = 5 ;
        int area  = length * breadth;
        System.out.println(" the area of the rectangle is " + area);
    }
    public void getSides(){
        System.out.println("I have 4 sides. ");
    }
}

class Square implements PolygonB{
    public void getArea(){
        int length = 5 ;
        int area = length * length;
        System.out.println(" teh area of the square is " + area);
    }
}