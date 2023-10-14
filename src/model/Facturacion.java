package model;

public class Facturacion {

    private int NoFactura;
    private int NoOrden;

    public Facturacion(int noFactura, int noOrden) {
        NoFactura = noFactura;
        NoOrden = noOrden;
    }

    public int getNoFactura() {
        return NoFactura;
    }

    public void setNoFactura(int noFactura) {
        NoFactura = noFactura;
    }

    public int getNoOrden() {
        return NoOrden;
    }

    public void setNoOrden(int noOrden) {
        NoOrden = noOrden;
    }

    @Override
    public String toString() {
        return "Facturacion{" +
                "NoFactura=" + NoFactura +
                ", NoOrden=" + NoOrden +
                '}';
    }
}
