package quizz;

public class Spotify {
    private int id;
    private String titulo;
    private String autor;
    private double duracion;
    private int anioCreacion;

    // Constructor
    public Spotify(int id, String titulo, String autor, double duracion, int anioCreacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anioCreacion = anioCreacion;
    }

    // Getter y Setter para todos los atributos

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

// se cren metodos para llamarlos nada mas en el main     
    public boolean esAnteriorAlAnioActual() {  //metodo para saber si es anterior 
        int anioActual = 2023;
        return anioCreacion < anioActual;
    }

    public boolean esDelAnioActual() { // metodo para saber si es igual al ano actual
        int anioActual = 2023;
        return anioCreacion == anioActual;
    }

    public boolean esPosteriorAlAnioActual() {  // para saber si es posteriorr al ano actual
        int anioActual = 2023;
        return anioCreacion > anioActual;
    }

    public static Spotify obtenerCancionDeMayorDuracion(Spotify[] canciones) {    // se recoerrre para saber la cnacion con mayt duracion 
        Spotify cancionMayorDuracion = canciones[0];
        for (Spotify cancion : canciones) {
            if (cancion.getDuracion() > cancionMayorDuracion.getDuracion()) {
                cancionMayorDuracion = cancion;
            }
        }
        return cancionMayorDuracion;
    }

    public static String obtenerAutorPrimeraPosicion(Spotify[] canciones) {
        return canciones[0].getAutor();
    }

    public static void mostrarTodasLasCanciones(Spotify[] canciones) {
        for (Spotify cancion : canciones) {
            System.out.println("ID: " + cancion.getId() +
                    ", Título: " + cancion.getTitulo() +
                    ", Autor: " + cancion.getAutor() +
                    ", Duración: " + cancion.getDuracion() +
                    ", Año de Creación: " + cancion.getAnioCreacion());
        }
    }
}