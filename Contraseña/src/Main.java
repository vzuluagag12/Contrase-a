import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog(null, "Ingrese su contraseña:");
        String confirmPassword = JOptionPane.showInputDialog(null, "Confirme su contraseña:");
        
        try {
            PasswordValidator.validatePassword(password, confirmPassword);
            JOptionPane.showMessageDialog(null, "La contraseña es válida.");
        } catch (PasswordException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error de Contraseña", JOptionPane.ERROR_MESSAGE);
        }
    }
}