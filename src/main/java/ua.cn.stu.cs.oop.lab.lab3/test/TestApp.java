package ua.cn.stu.cs.oop.lab.lab3.test;

import ua.cn.stu.cs.oop.lab.lab3.model.AbstractForm;
import ua.cn.stu.cs.oop.lab.lab3.model.Timber;
import ua.cn.stu.cs.oop.lab.lab3.model.Waste;
import ua.cn.stu.cs.oop.lab.lab3.model.Wood;
import ua.cn.stu.cs.oop.lab.lab3.store.ProductStore;
import ua.cn.stu.cs.oop.lab.lab3.store.WoodDirectory;

public class TestApp {
    private WoodDirectory woodDirectory = new WoodDirectory();
    private ProductStore productStore = new ProductStore();

    private void startApp() {

        productStore.add(new Timber(woodDirectory.get(0), 5f, 0.5f, 0.4f));
        productStore.add(new Timber(woodDirectory.get(1), 10f, 0.5f, 0.4f));
        productStore.add(new Timber(woodDirectory.get(2), 15f, 0.5f, 0.4f));
        productStore.add(new Waste(new Wood(1, "Дуб", 1.5f), 10.5f));
        System.out.println(woodDirectory);
        System.out.println(productStore);
        System.out.printf("Загальна вага: %1.3f", calcWeight());
    }

    private float calcWeight() {
        float fullWeight = 0;
        for (AbstractForm product : productStore.getArr()) {
            fullWeight += product.weight();
        }
        return fullWeight;
    }

    public static void main(String[] args) {
        TestApp app = new TestApp();
        app.startApp();
    }
}
