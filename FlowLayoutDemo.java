// Importar las bibliotecas necesarias
import javax.swing.*; // Para crear la interfaz gráfica
import java.awt.FlowLayout; // Para usar FlowLayout

// Clase para demostrar FlowLayout
public class FlowLayoutDemo extends JFrame {
    private final JPanel panelBotones; // Panel para contener los botones
    private final JButton[] botones; // Array de botones

    // Constructor de la clase FlowLayoutDemo
    public FlowLayoutDemo() {
        super("Mariluna Jeaneth Coyoche - FlowLayout"); // Título de la ventana
        botones = new JButton[5]; // Inicializar el array de botones
        panelBotones = new JPanel(); // Crear un nuevo panel
        
        // Configurar el layout del panel como FlowLayout
        panelBotones.setLayout(new FlowLayout());
        
        // Crear y agregar botones al panel
        for (int cuenta = 0; cuenta < botones.length; cuenta++) {
            botones[cuenta] = new JButton("Boton " + (cuenta + 1)); // Crear un nuevo botón
            panelBotones.add(botones[cuenta]); // Agregar el botón al panel
        }
        
        add(panelBotones); // Agregar el panel a la ventana principal
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        setSize(450, 200); // Establecer el tamaño de la ventana
        setVisible(true); // Hacer visible la ventana
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        new FlowLayoutDemo(); // Crear una instancia de FlowLayoutDemo
    }
}
