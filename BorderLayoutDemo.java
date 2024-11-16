// Importar las bibliotecas necesarias para BorderLayout
import javax.swing.*; 
import java.awt.BorderLayout; // Para usar BorderLayout

// Clase para demostrar BorderLayout
public class BorderLayoutDemo extends JFrame {
    private final JButton[] botones; // Array de botones

    // Constructor de la clase BorderLayoutDemo
    public BorderLayoutDemo() {
        super("Mariluna Jeaneth Coyoche - BorderLayout"); // Título de la ventana
        botones = new JButton[5]; // Inicializar el array de botones
        
        // Crear botones y asignarles texto
        botones[0] = new JButton("Boton 1");
        botones[1] = new JButton("Boton 2");
        botones[2] = new JButton("Boton 3");
        botones[3] = new JButton("Boton 4");
        botones[4] = new JButton("Boton 5");
        
        // Agregar los botones a diferentes regiones del BorderLayout
        add(botones[0], BorderLayout.NORTH); // Botón en la parte superior
        add(botones[1], BorderLayout.SOUTH); // Botón en la parte inferior
        add(botones[2], BorderLayout.EAST);  // Botón en el lado derecho
        add(botones[3], BorderLayout.WEST);  // Botón en el lado izquierdo
        add(botones[4], BorderLayout.CENTER); // Botón en el centro
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        setSize(450, 200); // Establecer el tamaño de la ventana
        setVisible(true); // Hacer visible la ventana
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        new BorderLayoutDemo(); // Crear una instancia de BorderLayoutDemo
    }
}
