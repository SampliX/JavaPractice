package HomeWorks.Practice6;

public class MovableRectangle implements Moveble
{
    protected double speed;
    private double height, width;
    MovableRectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    @Override
    public void speedCheck() { }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    @Override
    public void setPoints(double x, double y){ }
}
