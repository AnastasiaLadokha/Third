package ua.cn.stu.cs.oop.lab.lab3.model;

public class Cylinder extends AbstractForm {
    private float height;
    private float radius;

    @Override
    public float volume() {
        return (float)(height*Math.pow(radius, 2)*Math.PI);
    }

    public Cylinder(Wood wood, float height, float radius) {
        super(wood);
        this.height = height;
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "volume=" + volume() +
                '}';
    }
}
