package Homework;
class Rectangle {
    private double length;
    private double width;
    private Point topRight;

    // this is a Rectangle on the Cartesian plane

    // constructor

    Rectangle(double length, double width, Point topRight){
        this.length = length;
        this.width = width;
        this.topRight = topRight.clone();
    }
    
    // getters and setters
    double getLength(){
        return length;
    }
    double getWidth(){
        return width;
    }
    Point getTopRight(){
        return topRight;
    }

    // toString
    // equals
    // clone
    public Rectangle clone(){
        return new Rectangle(length, width, topRight);
    }

    boolean equals(Rectangle other){
        return other.getLength() == length && other.getWidth() == width && topRight.equals(other.getTopRight());
    }
    
    public double perimeter(){ 
        return (length*2)+(width*2);
    } 
    
    public double area(){ 
        return length*width;
    } 
    
    public double diagonal(){ 
        return topRight.distance(topRight.translateX(-1*width).translateY(-1*length));
    } 
    
    public Point bottomRight(){ 
        return topRight.translateY(length*-1);
    } 

    public Point bottomLeft(){
        return topRight.translateY(length*-1).translateX(width*-1);
    }

    public Point topLeft(){
        return topRight.translateX(width*-1);
    }
    
    public boolean overlap(Rectangle other){ 
        return (this.topLeft().getX()<other.bottomRight().getX()||other.topLeft().getX()<this.bottomRight().getX()) && (this.topLeft().getY()<other.bottomRight().getY()||other.topLeft().getY()<this.bottomRight().getY());
    } 
    
    
}






















// public double overlapArea(Rectangle other){ 
    //     // returns area of intersection between rectangles 
    // } 