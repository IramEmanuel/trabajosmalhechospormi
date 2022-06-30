package com.upchiapas.cola.modelos;

public class ItemCompra {
    private byte id;
    private final byte cantidad=2;
    private final String producto;
    private final float subtotal;

    public ItemCompra(byte id, String producto, float subtotal) {
        this.id = id;
        this.producto = producto;
        this.subtotal = (subtotal+80)*cantidad;
    }

    @Override
    public String toString() {
        return "OrdenCompra{" +"id=" + id +", cantidad=" + cantidad +", producto=" + producto + '\'' +", subtotal=" + subtotal +
                ')';
    }
}
