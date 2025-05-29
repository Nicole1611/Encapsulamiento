/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.Automovil;

import com.mycompany.main.Enumeraciones.TipoCombustible;
import com.mycompany.main.Enumeraciones.TipoAutomovil;
import com.mycompany.main.Enumeraciones.Colores;

public class Automovil {
private String marca;
private int añodeModelo;
private int litrosCilindajeMotor;
private TipoCombustible tipocombustible;
private TipoAutomovil tipoautomovil;
private int numeropuertas;
private int cantidadAsientos; 
private int velocidadmaxima; 
private Colores color;
private int velocidadActual;

    public Automovil(String marca, int añodeModelo, int litrosCilindajeMotor, TipoCombustible tipocombustible, TipoAutomovil tipoautomovil, int numeropuertas, int cantidadAsientos, int velocidadmaxima, Colores color, int velocidadActual) {
        this.marca = marca;
        this.añodeModelo = añodeModelo;
        this.litrosCilindajeMotor = litrosCilindajeMotor;
        this.tipocombustible = tipocombustible;
        this.tipoautomovil = tipoautomovil;
        this.numeropuertas = numeropuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadmaxima = velocidadmaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAñodeModelo() {
        return añodeModelo;
    }

    public void setAñodeModelo(int añodeModelo) {
        this.añodeModelo = añodeModelo;
    }

    public int getLitrosCilindajeMotor() {
        return litrosCilindajeMotor;
    }

    public void setLitrosCilindajeMotor(int litrosCilindajeMotor) {
        this.litrosCilindajeMotor = litrosCilindajeMotor;
    }

    public TipoCombustible getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(TipoCombustible tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    public TipoAutomovil getTipoautomovil() {
        return tipoautomovil;
    }

    public void setTipoautomovil(TipoAutomovil tipoautomovil) {
        this.tipoautomovil = tipoautomovil;
    }

    public int getNumeropuertas() {
        return numeropuertas;
    }

    public void setNumeropuertas(int numeropuertas) {
        this.numeropuertas = numeropuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public double getVelocidadmaxima() {
        return velocidadmaxima;
    }

    public void setVelocidadmaxima(int velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }


public int acelerear(int valor){
    if (valor>0) {
        velocidadActual = velocidadActual + valor;
    } else {
        System.out.println("No puede hacelerar un valor cero");
    }
    
    return velocidadActual;
}

public int desacelerar (int valor){
    if (valor <= velocidadActual) {
        if (valor > 0) {
            velocidadActual=velocidadActual-valor;
        } else {
            System.out.println("La velocidad a disminuir debe ser positiva");
        }       
    } else {
        System.out.println("No puede hacelerar un valor cero");
    }   
    return velocidadActual;
    
}
public void frenar (){
    System.out.println("El automovil a frenado.");
    System.out.println("Velocidad actual: 0");
}

public void calculartiempollegada(double distanciaRecorrer){
    double tiempo = distanciaRecorrer/velocidadActual;
    System.out.println("A una distancia de:" + distanciaRecorrer + "Km con una velicidad de "+ velocidadActual+"Km/h");
    System.out.println("El tiempo de llegada sera de "+tiempo + "segundos");
}
public void imprimirdatos(){
    System.out.println("La marca del automovil es: " + marca);
    System.out.println("El año de fabricacion es: " + añodeModelo);
    System.out.println("Volumen el litros del cilindraje del motor: " + litrosCilindajeMotor);
    System.out.println("El tipo de combutible es: " + tipocombustible);
    System.out.println("El tipo de automovil es: " + tipoautomovil);
    System.out.println("El numero de puertas: " + numeropuertas);
    System.out.println("Cantidad de asientos: " + cantidadAsientos);
    System.out.println("Velocidad maxima: " + velocidadmaxima);
    System.out.println("Color" + color);
    System.out.println("Velocidad actual: " + velocidadActual);
}
}
