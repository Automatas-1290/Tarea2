import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
    public static void main(String[] args) throws Exception {

        // Conjunto de Números del 1 al 5
        String patronA = "[0-5]";

        // Conjunto de Letras de "a" a "c"
        String patronB = "[a-c]";

        // Conjunto de Todas las Letras Minusculas
        String patronC = "[a-z]";

        // Conjunto de Números
        String patronD = "[0-9]";

        // Ejemplo con Tipo de Dato String
        System.out.println("________________________________________\n");
        System.out.println("              EJEMPLO #1");
        System.out.println("________________________________________\n");
        
        String textoAlfanumerico = "0123aaaa";
        System.out.println("Texto Alfanumerico: " + textoAlfanumerico);

        String replace1 = textoAlfanumerico.replaceAll(patronA, "X");
        System.out.println("Reemplazo de Numeros con X: " + replace1);

        String replace2 = textoAlfanumerico.replaceAll(patronB, "X");
        System.out.println("Reemplazo de Letras con X: " + replace2);


        System.out.println("________________________________________\n");
        System.out.println("              EJEMPLO #2");
        System.out.println("________________________________________\n");
        
        // [0-5][a-c];
        // String patronComplejo = patronA + patronB;

        // [a-c]*[0-5]*
        //String patronComplejo = patronA + "*" + patronB + "*";

        // "[a-z]+"

        // + = una coincidencia
        // * = ninguna o muchas

        //String patronComplejo = "(" + patronA + patronC + ")+";        
        
        String patronComplejo = "(" + patronC + ")+";

        String texto = "hola, aacc este bbcc es mi 55222aaa texto 2663aaaa   blah blah";
        System.out.println("Patron Complejo: " + patronComplejo);
        System.out.println(texto);

        Pattern pattern = Pattern.compile(patronComplejo);
        Matcher matcher = pattern.matcher(texto);

        // Buscar Ocurrencias
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }
        
        System.out.println("________________________________________\n");
        System.out.println("             EXPRESION #1");
        System.out.println("________________________________________\n");
        
        String patronComplejo1 = "[a-z]*(ba)[a-z]+";

        String cadena1 = "350 wenas hola acabar barco basurero sobas balareria esta hola es mi 1010 00145";
        
        System.out.println("Patron Complejo: " + patronComplejo1);
        System.out.println(cadena1);

        Pattern pattern1 = Pattern.compile(patronComplejo1);
        Matcher matcher1 = pattern1.matcher(cadena1);
     
        // Buscar Ocurrencias
        while(matcher1.find()) {
            System.out.println("Encontrado: " + matcher1.group());
        }
    }
}