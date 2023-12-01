package utils;
/*
 * @(#) SeleccionAleatoria.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import models.Empleado;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

/**
 * @autor Rafael Chica
 */
public class SeleccionAleatoria {

    public static WebElement seleccionRamdom(List<WebElement> elements){
        Random random= new Random();
        int indice= random.nextInt(elements.size());
        return elements.get(indice);
    }

}
