public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return (Math.sqrt(x*x+y*y));
    }

    public double distance(int x, int y){
        return (Math.sqrt((this.x - x)*(this.x-x)+(this.y - y)*(this.y-y)));
    }

    public double distance(Point duo){
        int yy = duo.getY();
        int xx = duo.getX();
        return (Math.sqrt((this.x - xx)*(this.x - xx) +(this.y - yy)*(this.y - yy)));

    }
}
