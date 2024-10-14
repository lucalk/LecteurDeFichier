import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Changer les chemins des fichiers TEST

        FileCSV csvFile = new FileCSV("E:\\Sorbonne\\Java\\LecteurDeFichier\\src\\lecsv.csv");
        // Test compareFile CSV
        FileCSV cFile = new FileCSV("E:\\Sorbonne\\Java\\LecteurDeFichier\\src\\lecsv.csv");

        FileTXT txtFile = new FileTXT("E:\\Sorbonne\\Java\\LecteurDeFichier\\src\\monFichier.txt");
        // Test compareFile TXT
        FileTXT tFile = new FileTXT("E:\\Sorbonne\\Java\\LecteurDeFichier\\src\\monFichier.txt");

        FileJSON jsonFile = new FileJSON("E:\\Sorbonne\\Java\\LecteurDeFichier\\src\\lejson.JSON");
        // Test compareFile JSON
        FileJSON jFile = new FileJSON("E:\\Sorbonne\\Java\\LecteurDeFichier\\src\\lejson.JSON");

        try{

            csvFile.openFile();
            System.out.println("----------");
            System.out.println("[Contenu]");
            csvFile.getContent();
            System.out.println("----------");
            System.out.println("[Palindrome]");
            csvFile.palindromeFile();
            System.out.println("----------");
            System.out.println("[Reverse]");
            csvFile.returnFile();
            System.out.println("----------");
            System.out.println("[Compare]");
            if(csvFile.compareFile(cFile)){
                System.out.println("Ils sont pareils");
            }else {
                System.out.println("Ils ne sont pas pareils");
            }
           System.out.println("-----------------------------------------------------------");


            /*
            //TXT ---------------------------------------------------------------------------
            txtFile.openFile();
            System.out.println("----------");
            System.out.println("[Contenu]");
            txtFile.getContent();
            System.out.println("----------");
            System.out.println("[Palindrome]");
            txtFile.palindromeFile();
            System.out.println("----------");
            System.out.println("[Reverse]");
            txtFile.returnFile();
            System.out.println("----------");
            System.out.println("[Compare]");
            if(txtFile.compareFile(tFile)){
                System.out.println("Ils sont pareils");
            }else {
                System.out.println("Ils ne sont pas pareils");
            }
            System.out.println("-----------------------------------------------------------");
            */

            /*
            //JSON ---------------------------------------------------------------------------
            jsonFile.openFile();
            System.out.println("----------");
            System.out.println("[Contenu]");
            jsonFile.getContent();
            System.out.println("----------");
            System.out.println("[Palindrome]");
            jsonFile.palindromeFile();
            System.out.println("----------");
            System.out.println("[Reverse]");
            jsonFile.returnFile();
            System.out.println("----------");
            System.out.println("[Compare]");
            if(jsonFile.compareFile(jFile)){
                System.out.println("Ils sont pareils");
            }else {
                System.out.println("Ils ne sont pas pareils");
            }
            System.out.println("-----------------------------------------------------------");
            */

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}