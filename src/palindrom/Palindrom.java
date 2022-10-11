package palindrom;

import java.util.Locale;

public class Palindrom {
    public boolean isPalindrom(String text) {
        // liefert das Zeichen an der Position 1 (startet bei 0)
        char c = text.charAt(1);
        // liefert die Anzahl an Zeichen
        int len = text.length();

        // baue einen Text, nur mit Kleinbuchstaben und ohne Leerzeichen
        String newText = text.replaceAll(" ", "");

        // Das hier ist eine (umständliche) Alternative zum replaceAll
        String newText2 = "";
        // deklariere die Variable i und initialisiere sie mit 0   --> int i=0
        // solange i kleiner als Anzahl Zeichen im Text            --> i<text.length()
        // erhöhe i um 1                                           --> i++
        for (int i = 0; i < text.length(); i++) {
            // wenn an der Stelle i im Text KEIN Leerzeichen ist
            if (text.charAt(i) != ' ') {
                // füge dieses Zeichen dem String newText2 hinzu
                newText2 += text.charAt(i);
            }
        }

        // Großbuchstaben in Kleinbuchstaben ändern
        newText = newText.toLowerCase();

        // warum nur i<newText.length() / 2  -->
        // wir prüfen ob die vorderen zeichen mit dm hintere übereinstimmen, daher
        // genügt es, bis zur Hälfte zu vegleichen
        for (int i = 0; i < newText.length() / 2; i++) {
            // bei einem Text mit 10 Zeichen wäre beim ersten Durchlauf:
            // 10-1-0 --> hinteres Zeichen hat index 9
            // danach:
            // 10-1-1 --> hinteres Zeichen hat index 8
            // danach:
            // 10-1-2 --> hinteres Zeichen hat index 7
            int index2 = newText.length() - 1 - i;
            // ist an irgendeiner Stelle keine Übereinstimmung:
            if (newText.charAt(i) != newText.charAt(index2)) {
                // kein Palindrom
                return false;
            }
        }
        // kommen wir hier hin, waren alle Zeichen gleich, d.h. Palindrim
        return true;
    }
}
