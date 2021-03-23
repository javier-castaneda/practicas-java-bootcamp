package ejerciciosAbstract.pass;

public class PasswordIntermedia extends Password {

    public PasswordIntermedia() {
        super("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])\\S{8,16}$");
    }

    @Override
    public void setContrasena(String contrasena) {
        try {
            super.setContrasena(contrasena);
        }catch (Exception e){
            System.out.println("No se pudo crear la contraseña Media");
        }

    }
}
