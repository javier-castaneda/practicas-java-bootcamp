package ejerciciosClases;

public class Main {
    public static void main(String[] args) {

        System.out.println("---- Pruebas CuentaCorriente ----");

        CuentaCorriente miCuenta = new CuentaCorriente(100);
        CuentaCorriente otraCuenta = new CuentaCorriente(50);
        miCuenta.ingreso(10);
        System.out.println(miCuenta.getSaldo());
        miCuenta.egreso(20);
        System.out.println(miCuenta.getSaldo());
        miCuenta.transferencia(30, otraCuenta);
        System.out.println(miCuenta.getSaldo());
        System.out.println(otraCuenta.getSaldo());

        System.out.println("---- Pruebas Contador ----");

        Contador miCont = new Contador(2);
        System.out.println(miCont.getNum());
        miCont.incrementar();
        System.out.println(miCont.getNum());
        miCont.decrementar();
        System.out.println(miCont.getNum());

        System.out.println("---- Pruebas Libro ----");

        Libro voragine = new Libro("La Voragine","9837219847981", "José Eustasio Silva");
        System.out.println(voragine.prestamo());
        System.out.println(voragine.toString());
        System.out.println(voragine.prestamo());
        System.out.println(voragine.devolucion());
        System.out.println(voragine.toString());
        Libro unknown = new Libro();
        System.out.println(unknown.prestamo());
        System.out.println(unknown.toString());
        System.out.println(unknown.prestamo());
        System.out.println(unknown.devolucion());
        System.out.println(unknown.toString());

        System.out.println("---- Pruebas Fracción ----");

        System.out.println("-- Suma: ");
        System.out.println(Fraccion.suma(new Fraccion(3,2), new Fraccion(5, 2)).toString());
        System.out.println(Fraccion.suma(new Fraccion(3,2), new Fraccion(5, 4)).toString());
        System.out.println(Fraccion.suma(new Fraccion(3,2), 3).toString());
        System.out.println(Fraccion.suma(3, new Fraccion(5, 2)).toString());

        System.out.println("-- Resta: ");
        System.out.println(Fraccion.resta(new Fraccion(3,2), new Fraccion(5, 2)).toString());
        System.out.println(Fraccion.resta(new Fraccion(3,2), new Fraccion(5, 4)).toString());
        System.out.println(Fraccion.resta(new Fraccion(3,2), 3).toString());
        System.out.println(Fraccion.resta(3, new Fraccion(5, 2)).toString());

        System.out.println("-- Multiplicación: ");
        System.out.println(Fraccion.multip(new Fraccion(3,2), new Fraccion(5, 2)).toString());
        System.out.println(Fraccion.multip(new Fraccion(3,2), new Fraccion(5, 4)).toString());
        System.out.println(Fraccion.multip(new Fraccion(3,2), 3).toString());
        System.out.println(Fraccion.multip(3, new Fraccion(5, 2)).toString());

        System.out.println("-- División: ");
        System.out.println(Fraccion.div(new Fraccion(3,2), new Fraccion(5, 2)).toString());
        System.out.println(Fraccion.div(new Fraccion(3,2), new Fraccion(5, 4)).toString());
        System.out.println(Fraccion.div(new Fraccion(3,2), 3).toString());
        System.out.println(Fraccion.div(3, new Fraccion(5, 2)).toString());

        //Throw error cuando el denominador es 0
        //Fraccion miFrac = new Fraccion(3, 0);

        System.out.println("---- Pruebas Fecha ----");

        Fecha date = new Fecha(31, 01, 1997);
        date.sumaDia();
        System.out.println(date.toString());

        System.out.println("---- Pruebas nuevo StringUtil ----");

        String pruebarpad = "prueba";
        System.out.println(pruebarpad);
        pruebarpad = StringUtil.rpad(pruebarpad,3,'T');
        System.out.println(pruebarpad);

        String hola1 = "    Hola";
        System.out.println(hola1);
        hola1 = StringUtil.ltrim(hola1);
        System.out.println(hola1);

        String hola2 = "Hola    ";
        System.out.println(hola2);
        hola2 = StringUtil.rtrim(hola2);
        System.out.println(hola2);

        String s = "   X   ";
        System.out.println(s);
        s = StringUtil.trim(s);
        System.out.println(s);

        String str = "Esternocleidomastoideo";
        System.out.println(StringUtil.indexOfN(str,'o',3));
    }
}
