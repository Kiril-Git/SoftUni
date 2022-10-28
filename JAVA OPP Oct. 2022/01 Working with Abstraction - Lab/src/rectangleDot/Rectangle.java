package rectangleDot;

public class Rectangle {

    private  Point bottomL;
    private  Point topR;

    public Rectangle(Point bottomL, Point topR) {
        this.bottomL = bottomL;
        this.topR = topR;
    }
    public boolean contains (Point point){

         boolean isX = point.getX() >= bottomL.getX() && point.getX() <= topR.getX();
         boolean isY = point.getY() >= bottomL.getY() & point.getY() <= topR.getY();

        return isX & isY;
    }

}
