package ua.cn.stu.cs.oop.lab.lab3.store;

import ua.cn.stu.cs.oop.lab.lab3.model.AbstractForm;

import java.util.Arrays;

public class ProductStore {
    private AbstractForm[] arr = new AbstractForm[3];
    private int count = 0;

    public AbstractForm[] getArr() {
        return Arrays.copyOf(arr, count);
    }

    public void add(AbstractForm newProduct) {
        if (arr.length == count)
            arr = Arrays.copyOf(arr, count + count / 2);
        arr[count++] = newProduct;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Перелік брусів:\n");
        for (int i = 0; i < count; i++) {
            sb.append(arr[i]).append("\n");
        }
        return sb.toString();
    }
}
