package HomeWorks.Practice6;

class MovablePoints implements Movable{
    protected int x,y;
    @Override
    public void speedCheck() {
        if(x==y){
            System.out.println("Right speed");
        } else {
            System.out.println("Wrong speed");
        }
    }

    @Override
    public void setSpeed(int speed) {

    }

    public void setPoints(int x, int y){
        this.x = x;
        this.y = y;
    }
}
