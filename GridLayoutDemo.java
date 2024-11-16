// Importar las bibliotecas necesarias para GridLayout
import javax.swing.*; 
import java.awt.GridLayout; // Para usar GridLayout

// Clase para demostrar GridLayout 
public class GridLayoutDemo extends JFrame {
    private final JPanel panelBotones; // Panel para contener los botones
    private final JButton[] botones; // Array de botones

    // Constructor de la clase GridLayoutDemo 
    public GridLayoutDemo() {
        super("Mariluna Jeaneth Coyoche - GridLayout"); // Título de la ventana
        botones = new JButton[5]; // Inicializar el array de botones
        panelBotones = new JPanel(); // Crear un nuevo panel
        
        // Configurar el layout del panel como GridLayout con 1 fila y 5 columnas 
        panelBotones.setLayout(new GridLayout(1, 5, 5, 5)); 
        
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
        new GridLayoutDemo(); // Crear una instancia de GridLayoutDemo 
    }
}
