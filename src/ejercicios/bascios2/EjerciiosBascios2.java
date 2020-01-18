/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.bascios2;

/**
 *
 * @author igorr
 */
public class EjerciiosBascios2 {

    public String quita(String str) {
        int numero = str.length();
        String auxiliar = "";
        for (int i = 0; i < numero; i++) {
            if (str.charAt(i) != ' ') {
                auxiliar = auxiliar + str.charAt(i);
            }
        }
        return auxiliar;
    }

    public boolean palindromo(String str) {

        String auxiliar2 = "";
        String sinEspacios = quita(str);
        String sinEspaciosYMinusculas = sinEspacios.toLowerCase();
        int numeroCadenaSinEspacios = sinEspaciosYMinusculas.length();

        for (int i = numeroCadenaSinEspacios - 1; i >= 0; i--) {
            auxiliar2 = auxiliar2 + sinEspaciosYMinusculas.charAt(i);
        }
        if (auxiliar2.equals(sinEspaciosYMinusculas)) {
            System.out.println("has tenido suerte " + str + " es un palindromo!");

            return true;
        } else {
            System.out.print("El parametro " + str + " no es un palindromo, sigue buscando! ");
            return false;

        }
    }

    public boolean isograma(String str) {

        String sinEspacios = quita(str);
        String sinEspaciosYMinusculas = sinEspacios.toLowerCase();
        int numero = sinEspaciosYMinusculas.length();

        int auxiliar = 0;
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (sinEspaciosYMinusculas.charAt(i) == sinEspaciosYMinusculas.charAt(j)) {
                    auxiliar++;

                }
            }
        }
        if (auxiliar == numero) {
            System.out.print("el parametro " + str + " es un isograma ");
            return true;
        }
        System.out.print("Aaay Señol,Señol " + str + " no es un isograma,sigue buscandooo ");
        return false;
    }

    public String acronimo(String str) {
        int numero = str.length();
        String y = "y";
        String e = "e";
        String de = "de";
        String la = "la";
        String las = "las";
        String minusculas = str.toLowerCase();
        String auxiliar = str.substring(0, 1);
        //aqui hace falta espicificar que despues de y,de,las,la, tiene que ir espacio no seas huevon y acabalo!!!
        for (int i = 0; i < numero; i++) {
            if (minusculas.charAt(i) == ' ') {
                String extracto1 = str.substring(i + 1, i + 2);
                if (extracto1.equals(y) || extracto1.equals(e)) {
                    i = i + 1;
                }
                String extracto3 = str.substring(i + 1, i + 4);
                if (extracto3.equals(las)) {
                    i = i + 4;
                }

                String extracto2 = str.substring(i + 1, i + 3);
                if (extracto2.equals(de) || extracto2.equals(la)) {
                    i = i + 2;
                }

                String letra = str.substring(i + 1, i + 2);
                auxiliar = auxiliar + letra;
            }
        }
        auxiliar = quita(auxiliar);
        auxiliar = auxiliar.toUpperCase();

        return auxiliar;
    }

    public boolean anagrama(String a, String b) {

        String sinEspacioA = quita(a);
        String sinEspacioB = quita(b);

        String auxiliar = "";

        String sinEspaciosAYMinusculas = sinEspacioA.toLowerCase();
        String sinEspaciosBYMinusculas = sinEspacioB.toLowerCase();

        System.out.print(sinEspaciosAYMinusculas);
        System.out.print(" " + sinEspaciosBYMinusculas);

        int numeroA = sinEspaciosAYMinusculas.length();
        int numeroB = sinEspaciosBYMinusculas.length();

        System.out.println(numeroA + " " + numeroB);
        System.out.print(sinEspaciosBYMinusculas);

        auxiliar = sinEspaciosBYMinusculas;
        if (numeroA == numeroB) {
            for (int i = 0; i < numeroA; i++) {
                for (int j = 0; j < auxiliar.length(); j++) {
                    if (sinEspaciosAYMinusculas.charAt(i) == auxiliar.charAt(j)) {

                        auxiliar = auxiliar.substring(0, j) + auxiliar.substring(j + 1);

                    }
                }

            }
            if (auxiliar.length() == 0) {
                System.out.print("enhorabuena, parametros: " + a + " y " + b + " son anagramas ");
                return true;
            }

        }
        System.out.print("Nein!!! Nein!!! " + a + " y " + b + " no son anagramas!!!");
        return false;
    }

    public void calendario(int numero) {
        String auxiliar = "";
        int salto = 0;
        //variable salto cuenta de 7 en 7 y hace salto de linea
        for (int i = 1; i < numero; i++) {
            System.out.print("XX ");
            salto++;
        }
        for (int i = 1; i <= (numero); i++) {
            System.out.print("0" + i + " ");
            salto++;
            if (salto % 7 == 0) {
                System.out.println();
            }
        }
        for (int i = numero + 2; i <= 31; i++) {

            salto++;
            if (i < 10) {
                System.out.print("0" + i + " ");
            } else {
                System.out.print(i + " ");
            }
            if (salto % 7 == 0) {
                System.out.println();
            }
        }
        while (salto % 7 != 0) {
            salto++;
            System.out.print("XX ");
        }
    }

    public boolean escaleraDePalabras(char[][] listaPalabras) {

        int numero = listaPalabras.length;
        int auxiliar = 0;

        for (int i = 1; i < listaPalabras.length; i++) {
            for (int j = 0; j < listaPalabras[i].length; j++) {
                if (listaPalabras[i - 1][j] != listaPalabras[i][j]) {
                    auxiliar++;

                }
            }
        }
        System.out.println("");
        if (auxiliar == numero - 1) {

            return true;
        }

        return false;
    }

    public int costeErroresADN(String uno, String dos) {
        //suponiendo qe las hebras que me pasan ya estan en mayusculas 
        //y de la misma longitud!!!
        int auxiliarMutacion = 0;
        int auxiliarSinCasar = 0;
        int repeticiones = 0;
        int resultado = auxiliarMutacion + (auxiliarSinCasar - repeticiones);

        char adenina = 'A';
        char timina = 'T';
        char guanina = 'G';
        char citosina = 'C';
        char salto = '-';

        int numeroUno = uno.length();
        int numeroDos = dos.length();

        if (numeroDos == numeroUno) {
            //al ser dos cadenas de la misma longitud nos da igual que longitud de la cadena escoger!!!    
            for (int i = 0; i < numeroUno; i++) {
                //si sucede todo esto estamos en el caso de que un nucleotido esta sin casar entonces sumamos +2;
                //aqui buscamos saltos de nucleotidos en la cadena uno
                if (uno.charAt(i) == salto && (dos.charAt(i) == adenina
                        || dos.charAt(i) == timina || dos.charAt(i) == citosina
                        || dos.charAt(i) == guanina)) {
                    repeticiones++;
                    auxiliarSinCasar = auxiliarSinCasar + 2;
                }
                //aqui buscamos saltos de nucleotidos en la caden dos
                if ((uno.charAt(i) == adenina || uno.charAt(i) == timina
                        || uno.charAt(i) == guanina || uno.charAt(i) == citosina)
                        && dos.charAt(i) == salto) {
                    repeticiones++;
                    auxiliarSinCasar = auxiliarSinCasar + 2;
                }
                //sisucede todo esto estamos en el caso de la mutacion puntual en la hebra dos!!!       
                if ((dos.charAt(i) == adenina && uno.charAt(i) != timina
                        || dos.charAt(i) == guanina && uno.charAt(i) != citosina
                        || dos.charAt(i) == timina && uno.charAt(i) != adenina
                        || dos.charAt(i) == citosina && uno.charAt(i) != guanina)
                        && (uno.charAt(i) != salto)) {

                    auxiliarMutacion = auxiliarMutacion + 1;

                }
                //aqui buscmaos mutaciones en la cadena dos
                if ((uno.charAt(i) == adenina && dos.charAt(i) != timina
                        || uno.charAt(i) == guanina && dos.charAt(i) != citosina
                        || uno.charAt(i) == timina && dos.charAt(i) != adenina
                        || uno.charAt(i) == citosina && dos.charAt(i) != guanina)
                        && (dos.charAt(i) != salto)) {

                    auxiliarMutacion = auxiliarMutacion + 1;
                }
            }
        }
        if (auxiliarMutacion + auxiliarSinCasar - repeticiones == 0) {
            System.out.print("Materia prima de la buena!!! " + " Fallos ");
        }
        if (auxiliarMutacion + auxiliarSinCasar - repeticiones != 0) {

            if (auxiliarMutacion == 0) {
                System.out.print("Ese material genetico esta un poco pasado de moda, numero de "
                        + "hebras sin aparejar ");
                return auxiliarSinCasar - repeticiones;
            }
            if (auxiliarSinCasar == 0) {
                System.out.print("estamos ante caso de X-men, mutant detected, numero de mutaciones ");
                return auxiliarMutacion / 2;

            }
            if (auxiliarMutacion != 0 && auxiliarSinCasar != 0) {
                System.out.print("estamos ante un caso perdido de la evaluacion, el bicho esta "
                        + "mas pa alla, que pa aca!!! se ha detectado: " + (auxiliarSinCasar - repeticiones)
                        + " saltos de ADN y " + auxiliarMutacion / 2 + " mutaciones, en total ");
                return auxiliarMutacion + auxiliarSinCasar - repeticiones;

            }
        }
        return auxiliarMutacion + auxiliarSinCasar - repeticiones;
    }

    public int contenidoContenible(String str1, String str2) {
        //suponemos que la longitud de str1 es mayor que la longitud de str2
        int numeroStr1 = str1.length();
        int numeroStr2 = str2.length();
        
        int posicion=0;
        int auxiliar = 0;

        for (int i = 0; i < numeroStr1-1; i++) {
            //si se cumple eso se activa el "marcador" de la posicion , literalmente dice
            // si el digito en la cadena str1 en la posicion i y en la posicion auxiliar
            //de la cadena str2 coinciden y ademas los siguientes digitos tmb coinciden 
            // auxiliar empieza sumar , si esta toda la cadena seguida contenida en str1
            // entonces auxiliar valdra lo mismo que la longitud de  la cadena str2
            if(str1.charAt(i)==str2.charAt(auxiliar) && auxiliar<=numeroStr2 
               && str1.charAt(i+1)==str2.charAt(auxiliar+1)){
                        auxiliar++; 
            }
            if(auxiliar==1){
                posicion=i;
            }
            if (auxiliar+1== numeroStr2) {
                System.out.print("El contenido esta contenible en la posicion :");
               return posicion;
            }
        }
      
        System.out.print("ya tu sabe !!!! sigue dando a la ruleta esta vaina no funciona!");
        return -1;
    }

    public static void main(String[] args) {
        EjerciiosBascios2 ejercicios = new EjerciiosBascios2();

        System.out.println(ejercicios.palindromo("an ana ana Anaana"));
        System.out.println(ejercicios.isograma("murcielago"));
        System.out.println(ejercicios.acronimo("Tecnologia de la infrmacion y de las Comunicaciones"));
        System.out.println(ejercicios.anagrama("roma paso", "amo rsapo"));
        ejercicios.calendario(3);

        char[][] listaPalabras = {
            {'P', 'A', 'T', 'A', 'S'},
            {'P', 'A', 'T', 'O', 'S'},
            {'R', 'A', 'T', 'O', 'S'},
            {'R', 'A', 'M', 'O', 'S'},
            {'G', 'A', 'M', 'O', 'S'},
            {'G', 'A', 'T', 'O', 'S'},
            {'M', 'A', 'T', 'O', 'S'},
            {'T', 'A', 'T', 'O', 'S'},
            {'T', 'A', 'T', 'U', 'S'},
            {'T', 'A', 'B', 'U', 'S'},
            {'Y', 'A', 'B', 'U', 'S'},
            {'Y', 'A', 'B', 'U', 'Y'},};
        System.out.println(ejercicios.escaleraDePalabras(listaPalabras));
        System.out.println(ejercicios.costeErroresADN("GGGA-GAATATCTGGACT", "CCCTACTTA-AGACCGGT"));
        System.out.println(ejercicios.contenidoContenible("repala mpago", "la mp"));
    }

}
