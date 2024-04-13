package org.example.shape.wrong;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle() {}

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return length*width;
    }

}
