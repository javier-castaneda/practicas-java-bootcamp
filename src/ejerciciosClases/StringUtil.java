package ejerciciosClases;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n) {
        String rep = "";
        for (int i = 0; i < n; i++) {
            rep += c;
        }
        return rep;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c) {
        return replicate(c, n - s.length()) + s;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y procedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo rpad("5",3,'0') ==> "500"
    public static String rpad(String s, int n, char c) {
        return s + replicate(c, n);
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) {
        String sArr[] = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sArr[i] = Integer.toString(arr[i]);
        }
        return sArr;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[]) {
        int iArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            iArr[i] = Integer.parseInt(arr[i]);
        }
        return iArr;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[]) {
        int max = 0;
        for (String x : arr) {
            if (x.length() > max) {
                max = x.length();
            }
        }
        return max;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c) {


        for (int i = 0; i < arr.length; i++) {
            arr[i] = lpad(arr[i], maxLength(arr), c);
        }
    }

    //Retorna la cadena ingresada sin espacios al lado izquierdo
    public static String ltrim(String s) {
        if (s.length() > 0) {
            while (s.charAt(0) == ' ') {
                String newStr = "";
                for (int i = 1; i < s.length(); i++) {
                    newStr += s.charAt(i);
                }
                s = newStr;
                if (s.length() == 0) {
                    break;
                }
            }
        }
        return s;
    }

    //Retorna la cadena ingresada sin espacios al lado derecho
    public static String rtrim(String s) {
        if (s.length() > 0) {
            while (s.charAt(s.length() - 1) == ' ') {
                String newStr = "";
                for (int i = 0; i < s.length() - 1; i++) {
                    newStr += s.charAt(i);
                }
                s = newStr;
                if (s.length() == 0) {
                    break;
                }
            }
        }
        return s;
    }

    //retorna la cadena ingresada sin espacios a ambos lados
    public static String trim(String s) {
        return rtrim(ltrim(s));
    }


    //Retorna el índice donde se encuentra el caractér c
    //por n-esima vez en la cadena s, en caso de no haber, retorna -1
    public static int indexOfN(String s, char c, int n) {
        int cont = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cont++;
            }
            if (cont == n) {
                return i;
            }
        }
        return -1;
    }
}
