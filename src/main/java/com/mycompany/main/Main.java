

package com.mycompany.main;

import com.mycompany.main.Automovil.Automovil;
import com.mycompany.main.Enumeraciones.Colores;
import com.mycompany.main.Enumeraciones.TipoAutomovil;
import com.mycompany.main.Enumeraciones.TipoCombustible;

public class Main {

    public static void main(String[] args) {
    Automovil Carro1 = new Automovil("KIA", 2024, 200, TipoCombustible.BIODIESEL, TipoAutomovil.COMPACTO, 4, 4, 200, Colores.ROJO, 100);
    
    Carro1.imprimirdatos();
    System.out.println("El vehiculo a acelerado "+ Carro1.acelerear(20));
    System.out.println("El vehiculo a desacelerado "+ Carro1.desacelerar(50));
    Carro1.frenar();
    Carro1.calculartiempollegada(10);
    }
}
