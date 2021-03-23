package ejerciciosAbstract.pass;

public class PasswordFuerte extends Password {
    public PasswordFuerte() {
        super("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@!])\\S{8,20}$");
    }

    @Override
    public void setContrasena(String contrasena) {
        try {
            super.setContrasena(contrasena);
        } catch (Exception e) {
            System.out.println("No se puede crear la contraseña fuerte");
        }
    }
}
