public class SchleifenEinfuehrung {

    public static void main(String[] args) {

        /**
         * KOPFGESTEUERTEN SCHLEIFEN
         * Teste ob die Bedingung wahr ist, falls ja führe den Schleifenrumpf aus
         * --> und wieder von vorne
         */

//        while(BEDINGUNG) {
//             wiederhole, solange die Bedingung wahr ist
//        }


        // Endlosschleife
//        while (true) {
//            System.out.println("ich höre nicht auf");
//        }


        // Gibt die Zahlen von 0 bis inkl. 9 aus.
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // Gebe jeden Buchstaben eines Worts Zeile für Zeile aus
        String wort = "Hallo";
        int j = 0;
        while (j < wort.length()) {
            System.out.println(wort.charAt(j));
            j++;
        }


        /**
         * FUSSGESTEUERTEN SCHLEIFEN
         * Führe erstmal den Schleifenrumpf aus, und prüfe dann die Bedingung, wenn wahr
         * --> wieder von vorne
         */
        System.out.println("\n\nFußgesteuerte Schleifen\n");

//        do {
//            schleifenrumpf
//        } while(BEDINGUNG)

        // Zahlen von 0 bis
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 10);


        /**
         * Zählergesteuerten Schleifen
         */
        System.out.println("\n\nZählergesteuerte Schleifen\n");

//        for(VARIABLENDEKLARATION_UND_INITIALISIERUNG;BEDINGUNG;VARIABLENVERAENDERUNG) {
//            SCHLEIFENRUMPF
//        }

        for (int u = 0; u < 10; u++) {
            System.out.println(u);
        }

        String wort2 = "Gallo";
        for (int g = 0; g < wort2.length(); g = g + 1) {
            System.out.println(wort2.charAt(g));
        }

        for (int g = 0; g < wort2.length(); g += 1) {
            System.out.println(wort2.charAt(g));
        }

        for (int g = 0; g < wort2.length(); g++) {
            System.out.println(wort2.charAt(g));
        }


    }
}
