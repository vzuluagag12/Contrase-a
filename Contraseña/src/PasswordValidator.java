class PasswordValidator {
    public static void validatePassword(String password, String confirmPassword) throws PasswordException {

        if (!password.equals(confirmPassword)) {
            throw new PasswordException("Las contraseñas no coinciden.");
        }
        
        if (password.length() < 8) {
            throw new PasswordException("La contraseña debe tener al menos 8 caracteres.");
        }
        
        if (password.contains(" ")) {
            throw new PasswordException("La contraseña no debe contener espacios en blanco.");
        }
        
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }
        
        if (!hasUpperCase || !hasDigit || !hasSpecialChar) {
            throw new PasswordException("La contraseña debe contener al menos un carácter en mayúscula, un número y un carácter especial.");
        }
    }
}
