package ejerciciosAbstract.pass;

public class PasswordSimple extends Password {
    public PasswordSimple() {
        super("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])\\S{6,10}$");
    }

    @Override
    public void setContrasena(String contrasena) {
        try {
            super.setContrasena(contrasena);
        }catch (Exception e){
            System.out.println("No se pudo crear la contraseña Simple");
        }

    }
}
