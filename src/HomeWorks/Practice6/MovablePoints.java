package HomeWorks.Practice6;

public class MovablePoints implements Moveble
{
    public double x,y;
    @Override
    public void speedCheck() {
        if(x==y){
            System.out.println("Right speed");
        } else {
            System.out.println("Wrong speed");
        }
    }

    @Override
    public void setSpeed(double speed) {

    }

    public void setPoints(double x, double y){
        this.x = x;
        this.y = y;
    }
}
