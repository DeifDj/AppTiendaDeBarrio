package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 class Order {
    private int orderNumber;
    private Date date;
    private List<Producto> products;

    public Order(int orderNumber, Date date) {
        this.orderNumber = orderNumber;
        this.date = date;
        this.products = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Date getDate() {
        return date;
    }

    public List<Producto> getProducts() {
        return new ArrayList<>(products);
    }

    public void addProduct(Producto product) {
        products.add(product);
    }

    public void removeProduct(Producto product) {
        products.remove(product);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", date=" + date +
                ", products=" + products +
                '}';
    }
}