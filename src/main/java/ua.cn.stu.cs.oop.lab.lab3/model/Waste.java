package ua.cn.stu.cs.oop.lab.lab3.model;

public class Waste extends AbstractForm implements IWeight {
    private float weight;

    @Override
    public float volume() {
        return 0;
    }

    @Override
    public float weight() {
        return weight;
    }

    public Waste(Wood wood, float weight) {
        super(wood);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Waste{" +
                "weight=" + weight +
                '}';
    }
}
