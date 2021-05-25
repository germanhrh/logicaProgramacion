package com.sophos.logicaprogramacion;

import com.sophos.logicaprogramacion.GenerosMusicales.GenerosMusicales;
import com.sophos.logicaprogramacion.GenerosMusicales.Regueton;
import com.sophos.logicaprogramacion.GenerosMusicales.Rock;
import com.sophos.logicaprogramacion.GenerosMusicales.Salsa;
import com.sophos.logicaprogramacion.figuras.Cuadrilatero;
import com.sophos.logicaprogramacion.figuras.Figura;
import com.sophos.logicaprogramacion.figuras.Triangulo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static final String SEPARADOR = ",";

    public static void main(String [] args) {


        /*
        Triangulo triangulo = new Triangulo(2.0,4.0, 4.0 );
        System.out.println("El área del triangulo es: " + triangulo.getArea());
        System.out.println("El perimetro del triangulo es: " + triangulo.getPerimetro());
        System.out.println(triangulo.soyUnaFigura());


        Vehiculo carro = new Vehiculo();
        carro.setColor("Azul");
        System.out.println("Numero llantas:" + carro.getNumeroLlantas());
        System.out.println("Color Carro:" + carro.getColor());
        System.out.println("Marca Carro:" + carro.getMarca());


        Papa papa = new Papa();
        System.out.println("Peso en Gramos:" + papa.getPesoEnGramos());
        System.out.println("Tipo papa:" + papa.getTipo());

        papa.setPesoEnGramos(20);
        papa.setTipo("Nevada");

        System.out.println("Peso en Gramos:" + papa.getPesoEnGramos());
        System.out.println("Tipo papa:" + papa.getTipo());



        Zapato zapato = new Zapato();
        zapato.setTalla("X");
        System.out.println("Talla:" + zapato.getTalla());


        Cuadrilatero cuadrilatero = new Cuadrilatero(5.0,4.0);
        //cuadrilatero.setArea(25);
        //System.out.println("Area cuadrilatero:" + cuadrilatero.getArea());

        System.out.println("El área del cuadrado es: " + cuadrilatero.getArea());
        System.out.println("El perimetro del cuadrado es: " + cuadrilatero.getPerimetro());

        //ciclos();



        int triangulos = 0;
        int cuadrados = 0;
        Figura[] misFiguras = genera(20);
        //System.out.println(misFiguras.length);
        for (Figura figura : misFiguras) {
            if (figura instanceof Triangulo) {
                triangulos++;
            } else if (figura instanceof Cuadrilatero) {
                cuadrados++;
            }
        }

        System.out.println("Tengo " + triangulos + " triangulos");
        System.out.println("Tengo " + cuadrados + " cuadrados");

         */

        //validaParImpar();
        //validarPalindromo();
        //validaNroRomano();
        //ValidarVocales();
        //ordenarLista();
        //mostrarSeriefibonacci(150);
        //imprimaPorcentajeGeneros();
        //cargarArchivo();
        cifradoCesar();



    }

    public static void cifradoCesar()
    {
        final String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
        System.out.println("Por favor digite la palabra a cifrar"); //capturar texto a cifrar
        Scanner leer = new Scanner(System.in);
        String  texto = leer.nextLine();
        int numero = randomNum(); //generar clave de cifrado
        String cifrado = "";
        for (int i = 0; i < texto.length(); i++) {  //recorrer texto a cifrar
            int posicion = alfabeto.indexOf(texto.charAt(i));
            if (posicion >= 0) {
                cifrado += alfabeto.charAt((posicion + numero) % alfabeto.length()); //remplaza con posicion del alfabero mas clave de cifrado
                // SE UTILIZA LA OPERACION MODULO PARA VOLVER AL INICIO DEL
                // ALFABETO CUANDO SE SALE POR EL FINAL
            } else {
                cifrado += texto.charAt(i);
            }
        }
        System.out.println("El Texto " + texto + " con el cifrado cesar queda: " + cifrado + ", clave de cifrado: " + numero);
    }

    public static void cargarArchivo()
    {
        BufferedReader bufferLectura = null;
        try {
            // Abrir el .csv en buffer de lectura
            bufferLectura = new BufferedReader(new FileReader("C:\\Users\\german.rivera\\Downloads\\DatosEmpleado.csv"));

            // Leer encabezado del archivo
            String linea = bufferLectura.readLine();
            // Leer primera linea de datos del archivo
            linea = bufferLectura.readLine();

            while (linea != null) {
                // Sepapar la linea leída con el separador definido previamente
                String[] campos = linea.split(SEPARADOR);

                int salario = Integer.parseInt(campos[2])*Integer.parseInt(campos[3]);
                System.out.println("El empleado " + campos[0] + " con cargo "+ campos[1] + " tiene un salario de: " + salario);
                System.out.println(Arrays.toString(campos));

                // Volver a leer otra línea del fichero
                linea = bufferLectura.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            // Cierro el buffer de lectura
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void mostrarSeriefibonacci(int tamaño){
        System.out.println("Fibonacci de tamaño "+tamaño+":");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();
    }

    public static int  fibonacci(int n)
    {
        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
        }
        else if (n==1) {  // caso base
            return 1;
        }
        else if (n==0){  // caso base
            return 0;
        }
        else{ //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

    public static void ordenarLista() {
        List lista = new ArrayList();       //instanciar la lista
        lista.add("Raul");                  //adicionar nombres a la lista
        lista.add("Liliana");
        lista.add("Eder");
        lista.add("German");

        System.out.println("Lista antes de ordenar");
        imprimirLista(lista);
        Collections.sort(lista);                        //ordenar la lista
        System.out.println("Lista ordenada");           //imprimir la lista
        imprimirLista(lista);

    }

    public static void imprimirLista(List lista) {
        for(int i=0;i<lista.size();i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void validaParImpar()
    {
        System.out.println("Por favor digite el numero a validar");
        Scanner leer = new Scanner(System.in);
        int numeroAValidar = Integer.parseInt(leer.nextLine());             //tomar valor por pantalla
        if (numeroAValidar % 2 == 1) {                                      //calcular y validar modulo
            System.out.println("El numero " + numeroAValidar + " es impar");
        }else{
            System.out.println("El numero " + numeroAValidar + " es par");
        }
    }

    public static void validarPalindromo()
    {

        System.out.println("Por favor digite la palabra a validar");
        Scanner leer = new Scanner(System.in);
        String  sPalabra = leer.nextLine();                         //tomar palabra por pantalla
        int inc = 0;
        int des = sPalabra.length()-1;
        boolean bError = false;
        while ((inc<des) && (!bError)){                             //mientras la posicion inicial sea menor a la posicion final y error en false ejecute

            if (sPalabra.charAt(inc)==sPalabra.charAt(des)){        //Valida si posision inicial y posicion final tiene la misma letra
                inc++;                                              //si son iguales incremento la posicion incial
                des--;                                              //decremento posicion final
            } else {
                bError = true;                                      //si las letras son diferente error en true
            }
        }
        if (!bError)                                                //valida si error diferente de true es palindromo
            System.out.println(sPalabra + " es un PALINDROMO");
        else                                                        //valida si error es de true no era palindromo
            System.out.println(sPalabra + " NO es un PALINDROMO");
    }

    public static void validaNroRomano()
    {
        System.out.println("Por favor digite el numero a validar del 1 al 10");
        Scanner leer = new Scanner(System.in);
        try {
            int numeroAValidar = Integer.parseInt(leer.nextLine());             //tomar valor por pantalla

        switch (numeroAValidar) {
            case 0:
                System.out.println("El nuemero 0 no existe en numeros Romanos ");
                break;
            case 1:
                System.out.println("El nuemero "+numeroAValidar+" equivale a I en numeros Romanos ");
                break;
            case 2:
                System.out.println("El nuemero "+numeroAValidar+" equivale a II en numeros Romanos ");
                break;
            case 3:
                System.out.println("El nuemero "+numeroAValidar+" equivale a III en numeros Romanos ");
                break;
            case 4:
                System.out.println("El nuemero "+numeroAValidar+" equivale a IV en numeros Romanos ");
                break;
            case 5:
                System.out.println("El nuemero "+numeroAValidar+" equivale a V en numeros Romanos ");
                break;
            case 6:
                System.out.println("El nuemero "+numeroAValidar+" equivale a VI en numeros Romanos ");
                break;
            case 7:
                System.out.println("El nuemero "+numeroAValidar+" equivale a VII en numeros Romanos ");
                break;
            case 8:
                System.out.println("El nuemero "+numeroAValidar+" equivale a VIII en numeros Romanos ");
                break;
            case 9:
                System.out.println("El nuemero "+numeroAValidar+" equivale a IX en numeros Romanos ");
                break;
            case 10:
                System.out.println("El nuemero "+numeroAValidar+" equivale a X en numeros Romanos ");
                break;
            default:
                System.out.println("ingresaste un valor mayor a 10");
                break;

        }
        }catch (Exception e)
        {
            System.out.println("ingresaste un valor no numerico, mensaje del error:"+e.getMessage());
        }
    }

    public static void ValidarVocales() {
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        System.out.println("Por favor digite el numero a validar del 1 al 10");
        Scanner leer = new Scanner(System.in);

            String textoAValidar = leer.nextLine();             //tomar valor por pantalla
            for (int x = 0; x < textoAValidar.length(); x++) {
                switch (textoAValidar.charAt(x)) {
                    case 'a':
                    case 'A':
                        contadorA = contadorA + 1;
                        break;
                    case 'e':
                    case 'E':
                        contadorE = contadorE + 1;
                        break;
                    case 'i':
                    case 'I':
                        contadorI = contadorI + 1;
                        break;
                    case 'o':
                    case 'O':
                        contadorO = contadorO + 1;
                        break;
                    case 'u':
                    case 'U':
                        contadorU = contadorU + 1;
                        break;
                }
            }
            System.out.println("En el String " + textoAValidar + " Existen " + contadorA + " A");
        System.out.println("En el String " + textoAValidar + " Existen " + contadorE + " E");
        System.out.println("En el String " + textoAValidar + " Existen " + contadorI + " I");
        System.out.println("En el String " + textoAValidar + " Existen " + contadorO + " O");
        System.out.println("En el String " + textoAValidar + " Existen " + contadorU + " U");
        }


    public void listas()
    {
        boolean bandera = false;
        int posicion = 0;

        System.out.println("Por favor digite la ciudad a buscar");
        Scanner leer = new Scanner(System.in);
        String nombreABuscar = leer.nextLine();
        System.out.println("La palabra a buscar es: " + nombreABuscar);
        String[] listaNombre = { "Cali", "Bogotá", "Medellin", "Villavicencio", "Cartagena" };
        List<String> listaFigura = new ArrayList(Arrays.asList(listaNombre));
        for (int x = 0; x < listaFigura.size(); x++) {

            if (nombreABuscar.equals(listaFigura.get(x)))
            {
                bandera = true;
                posicion = x;
            }
        }

        if (bandera)
        {
            System.out.println("En la lista Si se encuentra la palabra: " +nombreABuscar+" en la posicion "+ posicion);
        }else {
            System.out.println("En la lista No se encuentra la palabra: " +nombreABuscar);
        }

        if(listaFigura.contains(nombreABuscar))
        {
            System.out.println("En la lista Si se encuentra la palabra: " +nombreABuscar);
        }else {
            System.out.println("En la lista No se encuentra la palabra: " +nombreABuscar);
        }
    }

    public static Figura[] genera(int tamanho) {
        Figura[] listaFiguras = new Figura[tamanho];
        for (int i = 0; i < listaFiguras.length; i++) {
            if (randomNum() > 5) {
                listaFiguras[i] = new Cuadrilatero((double) randomNum(), (double) randomNum());
            } else {
                listaFiguras[i] = new Triangulo((double) randomNum(), (double) randomNum(), (double) randomNum());
            }
        }

        return listaFiguras;
    }

    public static int randomNum() {
        return (int) Math.floor(Math.random() * (1 - 9 + 1) + 9);
    }

    public static GenerosMusicales[] generaGenerosMusicales(int tamanho) {
        GenerosMusicales[] listaGeneros = new GenerosMusicales[tamanho];

        for (int i = 0; i < listaGeneros.length; i++) {
            int numeroramdom = randomNum();
            if (numeroramdom > 6)
                listaGeneros[i] = new Regueton();
            else if (numeroramdom < 4)
                listaGeneros[i] = new Salsa();
            else
                listaGeneros[i] = new Rock();
        }

        return listaGeneros;
    }

    public static void imprimaPorcentajeGeneros()
    {
        int salsa = 0;
        int rock = 0;
        int regueton = 0;
        GenerosMusicales[] misGeneros = generaGenerosMusicales(20);
        //System.out.println(misFiguras.length);
        for (GenerosMusicales genero : misGeneros) {
            if (genero instanceof Regueton) {
                regueton++;
            } else if (genero instanceof Salsa) {
                salsa++;
            }else if (genero instanceof Rock) {
                    rock++;

            }
        }

        float porcentajeRegueton = (regueton*100)/20;
        float porcentajeRock = (rock*100)/20;
        float porcentajeSalsa = (salsa*100)/20;

        System.out.println("Tengo " + regueton + " Regueton, para un porcentaje de "+ porcentajeRegueton +"%.");
        System.out.println("Tengo " + rock + " rock, para un porcentaje de " +porcentajeRock+"%.");
        System.out.println("Tengo " + salsa + " salsa, para un porcentaje de "+porcentajeSalsa+"%.");
        //double porcentageRegueton = (regueton/20)*100;
    }

    public void arreglos() {

    double notas[] = {5.0,4.0,3.0,0.0,4.5,};
    double resultado=0;
        for(double nota:notas)
    {
        resultado+=nota;
    }
        System.out.println("El perimetro del cuadrado es: " + resultado/5);
    }

    public void herencias()
    {
        Cuadrilatero cuadrilatero = new Cuadrilatero(5.0,4.0);
        System.out.println("El área del cuadrado es: " + cuadrilatero.getArea());
        System.out.println("El perimetro del cuadrado es: " + cuadrilatero.getPerimetro());
    }

    public static void ciclos()
    {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Numero for:" + i);
        }
        Main main = new Main();
        main.suma(1);

        int i = 1;
        while(i <=20)
        {
            System.out.println("Numero while:" + i);
            i += 2;
        }
    }

    public Integer suma(int x)
    {
        System.out.println("Metodo Recursivo:"+x);
        if (x<19)
        {
            return suma(x+2);
        }
        else
        {
            return x;
        }
    }
}
