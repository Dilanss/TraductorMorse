package traductor_morse;

public class traductor {
    //ponemos arrays para guardar tanto las palabras en codigo morse asi como normal
        String [ ] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[ ] palabras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        
    // Ponemos una cadena universal
        String traduccion = " ";

        public String traducirMorse(String dato) {
                traduccion = "";
                String mayuscula = "";
                String letra = "";
                
                mayuscula = dato.toUpperCase();

                    for (int i = 0; i < dato.length(); i++) {
                        letra = mayuscula.substring(i, i + 1);

                        for (int j = 0; j < palabras.length; j++) {
                            if (letra.equals(palabras[j])) {
                                traduccion = traduccion + morse[j] + "|";
                            }
                        }
                    }
               // Retornamos a traduccion
            return traduccion;
        }


        public String traducirEspañol(String dato) {
            String[] palabrasMorse = dato.split("\\|");
                traduccion = "";
                    for (String palabraMorse : palabrasMorse) {
                        for (int j = 0; j < morse.length; j++) {
                            if (palabraMorse.equals(morse[j])) {
                                traduccion += palabras[j] + " ";                
                            }
                        }
                    }
    // Retornamos la traducción
                return traduccion;
        }      
}



   
 