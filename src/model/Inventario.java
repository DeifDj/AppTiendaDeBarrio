package model;

public class Inventario {

    private String name;
    private String descrption;
    private String tag;

    private String suppier;

    public Inventario(String name, String descrption, String tag, String suppier) {
        this.name = name;
        this.descrption = descrption;
        this.tag = tag;
        this.suppier = suppier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getSuppier() {
        return suppier;
    }

    public void setSuppier(String suppier) {
        this.suppier = suppier;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "name='" + name + '\'' +
                ", descrption='" + descrption + '\'' +
                ", tag='" + tag + '\'' +
                ", suppier='" + suppier + '\'' +
                '}';
    }
}
