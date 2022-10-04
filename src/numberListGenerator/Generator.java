package numberListGenerator;

public class Generator {


    //    10         15
    public String generateNumbers(int start, int end) {
        // Antwort der Methode
        String response = "";

        // wir brauchen eine Schleife, die von 10 bis inkl. 15 zählt
        for (int i = start; i <= end; i++) {   // i wird auf den Wert von start gesetzt
            // solange i kleiner gleich end
            // erhöhe i um eins

            // wenn noch eine weitere Zahl kommt:
            // response die aktuelle Zahl i hinzufügen, ergänzt um ein Kommata
            if (i < end) {
                response += i + ",";
            } else {
                // sonst response die aktuelle Zahl i hinzufügen
                response += i;
            }

        }


        // alternative
//        for ( int i=start;i<end;i++) {
//            response+=i+",";
//        }
//        response+=end;

        // Rückgabe der Antwort
        return response;
    }
    // 10,11,12,13,14,15


    //                                  10        15       2            #
    public String generateNumbers(int start, int end, int steps, char delimiter) {
        if (end <= start) {
            return "";
        }
        String response = "";
        for (int i = start; i <= end; i += steps) {       // i wird auf start gesetzt
            // solange i kleiner als end ist, löuft die loop
            // erhöhe i in jedem Schritt um steps
            response += i + Character.toString(delimiter);          // oben war das response+=i+",", hier eben delimiter
        }
        response = response.substring(0, response.length() - 1); // entferne das letzte Zeichen
        return response;
    }
    //10#12#14


    // alternativ:
//    public String generateNumbers(int start, int end, int steps, char delimiter) {
//        if (end <= start) {
//            return "";
//        }
//        String response = "";
//        int i = start;
//        for (; i <= end - steps; i += steps) {       // i wird auf start gesetzt
//            // solange i kleiner als end ist, löuft die loop
//            // erhöhe i in jedem Schritt um steps
//            response += i + Character.toString(delimiter);          // oben war das response+=i+",", hier eben delimiter
//        }
//        response += i;
//        //response = response.substring(0, response.length() - 1); // entferne das letzte Zeichen
//        return response;
//    }

}
