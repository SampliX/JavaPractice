package HomeWorks.Practice6;

class MovableRectangle implements Movable{
    protected int speed;
    private int height, width;
    MovableRectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    @Override
    public void speedCheck() { }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public void setPoints(int x, int y){ }
}
