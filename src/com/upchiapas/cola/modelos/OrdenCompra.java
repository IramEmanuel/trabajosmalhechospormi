package com.upchiapas.cola.modelos;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public abstract class OrdenCompra {
        public abstract void orden();{
            String [] orden = {" Mexicana "," Hawaiana "," Chorizo ", " Peperonis "};
            Random random = new Random(System.nanoTime());
            Queue<ItemCompra> compra = new LinkedList<>();

            for (int i=0; i<5;i++)
                compra.add(new ItemCompra((byte)(i+1),
                        orden[random.nextInt(orden.length)],
                        random.nextFloat()
                ));
            while (!compra.isEmpty())
                System.out.println(compra.poll());
        }
    }