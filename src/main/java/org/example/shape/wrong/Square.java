package org.example.shape.wrong;

public class Square extends Rectangle{

    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public int getArea() {
        return super.getArea();
    }
}
