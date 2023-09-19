package co.edu.uniquindio.parcial1.ejercicio2;

import co.edu.uniquindio.parcial1.model.Automovil;
import co.edu.uniquindio.parcial1.model.Empleado;

public class Main {

    public static void main(String[] args) {

        Automovil automovil1 = new Automovil("Port","4c","ASD", 5, 17000000, "Aire");
        Automovil automovil2 = new Automovil("Adventur","8A", "Euro", 2, 23000000,  "Cabina");
        Automovil automovil3 = new Automovil("Racing","1R", "Biturbo", 1, 35000000,  "Turbo");
        Automovil automovil4 = new Automovil("Ban","8B", "Ecom", 8, 20000000,  "Cojineria");

        Empleado empleado1 = new Empleado("Leonardo", "Gallego", 10966,"Quindio", "Pesidente",5000000);
        Empleado empleado2 = new Empleado("Jose", "Rios", 10971,"Cauca", "biceprecidente",4000000);
        Empleado empleado3 = new Empleado("Carlitos", "Garcia", 185300,"Risaralda", "Supervisor",3000000);
        Empleado empleado4 = new Empleado("Pepe", "Caicedo", 84123,"Quindio", "Ensamblador",1500000);

    }

}
