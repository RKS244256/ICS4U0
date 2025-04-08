package Homework;
// special methods: toString, equals, clone

// special methods are methods that were inherited from the object class


class Point{

    private double x;
    private double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // toString purpose is to give a 
    // String representation of your object
    public String toString(){
        return String.format("(%.2f, %.2f)", x, y);
    }

    public boolean equals(Point another){
        return x == another.x && y == another.y;
    }

    public Point clone(){
        return new Point(x, y);
    }

    // quadrant
    int quadrant(){
        if (x > 0 && y > 0){
            return 1;
        }
        else if (x > 0 && y < 0){
            return 4;
        }
        else if (x < 0 && y > 0){
            return 2;
        }
        else{
            return 3; // fix for origin, axes later
        }
    }
    // midPoint

    Point midPoint(Point another){
        return new Point((x + another.x) / 2, (y + another.y) / 2);
    }

    // slope
    double slope(Point another){
        return (x-another.x)/(y-another.y);
    }
    // distance
    double distance(Point another){
        return Math.abs(Math.sqrt((Math.pow(x-another.x, 2)+Math.pow(y-another.y, 2))));
    }
    // translateX
    Point translateX(double x){
        return new Point(this.x+x, y);
    }
    // translateY
    Point translateY(double y){
        return new Point(x, this.y+y);
    }
    // reflectAcrossXAxis
    Point reflectAcrossXAxis(){
        return new Point(x, y*-1);
    }
    // reflectAccrossYAxis
    Point reflectAcrossYAxis(){
        return new Point(x*-1, y);
    }


    public static void main(String[] args) {
        Point p = new Point(8, 4);
        //System.out.println(p.toString());
        System.out.println(p);
        Point q = new Point(-5, 6);
        System.out.println(p == q); 
        // false for sure because == compares memory locations 
        System.out.println(p.equals(q));
        //Point z = p; // z point to where p is which is why when I modified p I also modified z
        Point z = p.clone();
        // p.setX(5);
        System.out.println(p); 
        System.out.println(z);
        System.out.println(p.midPoint(q));
        
    }

    
}