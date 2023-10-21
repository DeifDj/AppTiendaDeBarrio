package model;



import java.util.List;

public class ControlDeInventario {

    private List<Producto>inventario;

    public ControlDeInventario(List<Producto> inventario) {
        this.inventario = inventario;
    }

    public List<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(List<Producto> inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "ControlDeInventario{" +
                "inventario=" + inventario +
                '}';
    }
}
