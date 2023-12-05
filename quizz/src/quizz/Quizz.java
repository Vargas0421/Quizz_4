package quizz;

public class Quizz {

    public static void main(String[] args) {
       
        Spotify arrSpotify[] = new Spotify[10];
        
        // Se agregan las canciones 
        arrSpotify[0] = new Spotify(1, "Tuyo", "Bad Bunny", 350, 2022);
        arrSpotify[1] = new Spotify(2, "Mio", "Mora", 200, 2022);
        arrSpotify[2] = new Spotify(3, "Eres", "Joy", 450, 2021);
        arrSpotify[3] = new Spotify(4, "Bad Guy", "Billy", 600, 2019);
        arrSpotify[4] = new Spotify(5, "Salud", "Yoel", 200, 2019);
        arrSpotify[5] = new Spotify(6, "Hombre y Mujeres", "Feid", 228, 2023);
        arrSpotify[6] = new Spotify(7, "A", "S", 450, 2021);
        arrSpotify[7] = new Spotify(8, "B", "A", 600, 2019);
        arrSpotify[8] = new Spotify(9, "C", "C", 200, 2019);
        arrSpotify[9] = new Spotify(10, "K", "UJ", 300, 2022);

        // Llamadas a los métodos
        System.out.println("Canciones anteriores al año actual:");
        for (Spotify cancion : arrSpotify) {
            if (cancion != null && cancion.esAnteriorAlAnioActual()) {
                System.out.println(cancion.getTitulo());
            }
        }

        System.out.println("\nCanciones del año actual:");
        for (Spotify cancion : arrSpotify) {
            if (cancion != null && cancion.esDelAnioActual()) {
                System.out.println(cancion.getTitulo());
            }
        }

        System.out.println("\nCanciones posteriores al año actual:");
        for (Spotify cancion : arrSpotify) {
            if (cancion != null && cancion.esPosteriorAlAnioActual()) {
                System.out.println(cancion.getTitulo());
            }
        }

        System.out.println("\nCanción de mayor duración:");
        Spotify cancionMayorDuracion = Spotify.obtenerCancionDeMayorDuracion(arrSpotify);
        System.out.println(cancionMayorDuracion.getTitulo());

        System.out.println("\nAutor de la canción en la primera posición:");
        String autorPrimeraPosicion = Spotify.obtenerAutorPrimeraPosicion(arrSpotify);
        System.out.println(autorPrimeraPosicion);

        System.out.println("\nMostrar todas las canciones:");
        Spotify.mostrarTodasLasCanciones(arrSpotify);
    }
}
