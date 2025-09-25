import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Crear el "router"
        HashMap<String, Runnable> router = new HashMap<>();

        // Definir rutas y acciones
        router.put("/home", () -> System.out.println("Bienvenido a la página principal"));
        router.put("/about", () -> System.out.println("Acerca de nosotros: somos estudiantes de Java"));
        router.put("/contact", () -> System.out.println("Contacto: escribe a soporte@ejemplo.com"));

        // Simular solicitudes
        String[] solicitudes = {"/home", "/about", "/contact", "/login"};

        for (String ruta : solicitudes) {
            System.out.println("\nSolicitud: " + ruta);

            // Buscar la ruta en el router
            Runnable accion = router.get(ruta);

            if (accion != null) {
                accion.run(); // ejecuta la acción asociada
            } else {
                System.out.println("404 - Página no encontrada");
            }
        }
    }
}
