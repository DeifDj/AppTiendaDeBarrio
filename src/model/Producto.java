package model;

public class Producto {
    private String name;
    private String price;
    private String amount;
    private String description;
    private String tag;

    public Producto(String name, String price, String amount, String description, String tag) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.description = description;
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", amount='" + amount + '\'' +
                ", description='" + description + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
