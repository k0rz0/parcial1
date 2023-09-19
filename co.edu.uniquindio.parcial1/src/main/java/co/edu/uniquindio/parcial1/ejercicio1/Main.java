package co.edu.uniquindio.parcial1.ejercicio1;

import co.edu.uniquindio.parcial1.model.Curso;
import co.edu.uniquindio.parcial1.model.Docente;
import co.edu.uniquindio.parcial1.model.Estudiante;

public class Main {
    public static void main(String[] args) {
        Curso curso;

        curso = inicializarDatosPrueba();

        notaDefinitivaEstudiantes(curso);

        infromacionEstudianteMasAlto(curso.obtenerMayorEstatura());

        System.out.println("El estudiante con la nota 5 mayor es: " + curso.nota5Mayor());

        mostraInfoProfes(curso.getDocente(), curso.getDocenteAuxiliar());
    }

    private static void mostraInfoProfes(Docente docente, Docente docenteAuxiliar) {

        System.out.println("Docente");
        System.out.println(docente.getNombre());
        System.out.println(docente.getApellido());
        System.out.println(docente.getEdad());
        System.out.println(docente.getCorreo());

        System.out.println("Docente Auxiliar");
        System.out.println(docenteAuxiliar.getNombre());
        System.out.println(docenteAuxiliar.getApellido());
        System.out.println(docenteAuxiliar.getEdad());
        System.out.println(docenteAuxiliar.getCorreo());

    }

    private static Curso inicializarDatosPrueba() {

        Estudiante estudiante1 = new Estudiante("Leo", "Gallego", "31/05/1997",26,"leo@email.com", 2,1.75, 3.0,4.0,5.0,1.0,2.0 );
        Estudiante estudiante2 = new Estudiante("Oscar", "Rincon", "05/05/2000",23,"oscar@email.com", 4,1.80, 1.0,3.0,4.5,1.9,4.0 );
        Estudiante estudiante3 = new Estudiante("Carlos", "Garcia", "01/01/2003",20,"carlos@email.com", 1,1.60, 4.3,5.0,3.2,4.5,5.0 );

        Docente docente = new Docente("Jaime", 45, "jaimito@email.com", "Franco");
        Docente docenteAuxiliar = new Docente("Cesar", 29, "cesar@email.com", "Cataño");

        Curso curso = new Curso("programación1",2,"02N",3,"Nocturna", "Ingeniería de sistemas y computación", "Ingeniería");

        curso.setEstudiante1(estudiante1);
        curso.setEstudiante2(estudiante2);
        curso.setEstudiante3(estudiante3);

        curso.setDocente(docente);
        curso.setDocenteAuxiliar(docenteAuxiliar);

        return  curso;
    }

    private static void notaDefinitivaEstudiantes(Curso curso) {

        System.out.println("Nota estudiante 1: " + curso.getEstudiante1().promedioNotas());
        System.out.println("Nota estudiante 2: " + curso.getEstudiante2().promedioNotas());
        System.out.println("Nota estudiante 3: " + curso.getEstudiante3().promedioNotas());

    }
    private static void infromacionEstudianteMasAlto(Estudiante estudiante) {

        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getApellido());
        System.out.println(estudiante.getFechaNacimiento());
        System.out.println(estudiante.getEdad());
        System.out.println(estudiante.getCorreo());
        System.out.println(estudiante.getSemestre());
        System.out.println(estudiante.getEstatura());
        System.out.println(estudiante.getNota1());
        System.out.println(estudiante.getNota2());
        System.out.println(estudiante.getNota3());
        System.out.println(estudiante.getNota4());
        System.out.println(estudiante.getNota5());

    }

}
