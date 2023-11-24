package utils;
/*
 * @(#) SeleccionAleatoria.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

/**
 * @autor Rafael Chica
 */
public class SeleccionAleatoria {

    public static WebElement seleccionProducto(List<WebElement> productos){
        Random random= new Random();
        int indice= random.nextInt(productos.size());
        return productos.get(indice);
    }
}