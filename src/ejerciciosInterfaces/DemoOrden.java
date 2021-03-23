package ejerciciosInterfaces;

public class DemoOrden {
    public static void main(String[] args) {

        System.out.println(" ---- Personas ---- ");
        Persona[] people = new Persona[5];

        people[0] = new Persona("Pedro", "12453");
        people[1] = new Persona("Andrés", "54546");
        people[2] = new Persona("Cristina", "46321");
        people[3] = new Persona("Pablo", "09314");
        people[4] = new Persona("María", "20443");

        for (int i = 0; i < people.length; i++) {
            System.out.println("DNI: " + people[i].getDni() + " Nombre: " + people[i].getNombre());
        }

        System.out.println(" ---- Ordenados por DNI ---- ");

        SortUtil.ordenar(people);

        for (int i = 0; i < people.length; i++) {
            System.out.println("DNI: " + people[i].getDni() + " Nombre: " + people[i].getNombre());
        }

        System.out.println(" ---- Celulares ---- ");

        Celular[] celus = new Celular[6];

        celus[0] = new Celular("3102473146", "José");
        celus[1] = new Celular("3146742934", "Fernando");
        celus[2] = new Celular("3127694509", "Camila");
        celus[3] = new Celular("3000241512", "Diana");
        celus[4] = new Celular("3016732814", "Ana");
        celus[5] = new Celular("3049014125", "David");

        for (int i = 0; i < celus.length; i++) {
            System.out.println("Titular: " + celus[i].getTitular() + " Celular: " + celus[i].getNumero());
        }

        SortUtil.ordenar(celus);

        System.out.println(" ---- Celulares Ordenados por titular ---- ");

        for (int i = 0; i < celus.length; i++) {
            System.out.println("Titular: " + celus[i].getTitular() + " Celular: " + celus[i].getNumero());
        }
    }
}
