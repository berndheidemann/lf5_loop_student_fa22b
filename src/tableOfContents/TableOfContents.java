package tableOfContents;

public class TableOfContents {
    public String createEntry(String heading, String page) {
        if (heading.length() + page.length() > 50) {
            return "";
        }

        // Wir brauchen einen Punkte-string mit der korrekten Anzahl an Punkten

        // was ist die korrekte Anzahl an Punkten?
        // maximale Anzahl - Anzahl Heading Zeichen - Anzahl page Zeichen
        int pointsCount = 50 - heading.length() - page.length();

        // einen String bauen mit so vielen Punkten wie nötig(pointsCount)
        String points = "";
        while (pointsCount > 0) {
            points += ".";
            pointsCount--;
        }

        // alternative mit einer zählergesteuerten Schleife
//        for(int i=0;i<pointsCount;i++) {
//            points+=".";
//        }

        return heading + points + page;
    }
}
