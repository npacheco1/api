package com.api.basica;

import com.api.basica.model.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class TestController {
    @GetMapping("/hello")
    public String hello(){
    return "Hello Spring";
    }

    @GetMapping("/bye")
    public String bye(){
        return "bye Spring";
    }

    @GetMapping("/producto")
    public Producto get(){
        return new Producto(1 , "Televisor","Televisor de 21 pulgadas",5600.00);
    }

    @GetMapping("/productos")
    public List<Producto> getProducts(){
        return getProductos();
    }
    public List<Producto> getProductos(){
        List<Producto>  listaProductos= new ArrayList<>();

        listaProductos.add(new Producto(1 , "Televisor","Televisor de 21 pulgadas",5600.00));
        listaProductos.add(new Producto(2 , "Monitor","Monitor de 21 pulgadas",6600.00));
        listaProductos.add(new Producto(3 , "Computador","Computador de 21 pulgadas",7600.00));
        listaProductos.add(new Producto(4 , "Refrigerador","Refrigerador de 21 pulgadas",8600.00));
        listaProductos.add(new Producto(5 , "Escritorio","Escritorio de 21 pulgadas",9600.00));
        listaProductos.add(new Producto(6 , "Mesa","Mesa de 21 pulgadas",3600.00));

        return listaProductos;
    }
}
