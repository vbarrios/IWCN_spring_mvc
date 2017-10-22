package com.iwcn.master.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iwcn.master.services.UserService;

@Controller
public class AppController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView Inicio() {
        return new ModelAndView("Inicio");
    }
    
    @RequestMapping("/ListaDeProductos")
    public ModelAndView listaDeProductos() {
        return new ModelAndView("ListadoDeProductos_template").addObject("ListaProductos", this.userService.getAll());
    }
    
    @RequestMapping("/AñadirProducto")
    public ModelAndView añadirProducto(@RequestParam String pname,@RequestParam int ref,@RequestParam int price,@RequestParam int stock) {
    	this.userService.addProduct(pname,ref,price,stock);
        return new ModelAndView("ListadoDeProductos_template").addObject("ListaProductos", this.userService.getAll());
    }

    @RequestMapping("/Formulario")
    public ModelAndView formulario() {
        return new ModelAndView("Formulario_template");
    }
    
    @RequestMapping("/BorrarProducto/{pname}")
    public ModelAndView borrarProducto(@PathVariable String pname) {
    	this.userService.removeProduct(pname);
        return new ModelAndView("ListadoDeProductos_template").addObject("ListaProductos", this.userService.getAll());
    }
    
}
