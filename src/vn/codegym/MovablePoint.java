package vn.codegym;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public float[] getSpeed() {
//        float[] arr = {this.xSpeed, this.ySpeed};
//        return arr;
        return new float[]{getXSpeed(), getYSpeed()};
    }


    public void move() {
        //kế thừa lớp cha point
        setXY(getX() + getY(), getY() + ySpeed);
    }

    @Override
    public String toString() {
        return "( " + getX() + " , " + getY() + "), Speed = " + getXSpeed() + "," + getYSpeed() + ")";
    }
}
