package ejerciciosAbstract.pass;

public class Main {
    public static void main(String[] args) {
        Password pass = new Password("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@!])\\\\S{6,12}$");
        //pass.setContrasena("@aeoAWD432");
        Password newPass = new Password("");
    }
}
