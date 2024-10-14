import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

public abstract class Files implements Lecture{
    private String filePath;
    protected ArrayList<String> content;

    public Files(String filePath){
        this.filePath = filePath;
        this.content = new ArrayList<>();
    }

    public String getFile() {
        return filePath;
    }

    public void openFile() {
        File f = new File(filePath); // Utilise l'attribut filePath pour créer le fichier

        if (f.exists()) {
            System.out.println("Le fichier " + f.getName() + " existe !");
            try {
                readFile(); // Appel à readFile() sans paramètre
            } catch (IOException e) {
                System.out.println("Erreur lors de la lecture du fichier : " + f.getName());
                e.printStackTrace();
            }
        } else {
            System.out.println("Le fichier n'existe pas !");
        }
    }

    public void readFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                this.content.add(traitementLigne(line)); // Ajoute chaque ligne après traitement
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : ");
            e.printStackTrace();
        }
    }

    public String traitementLigne(String line){
        return line;
    }

    @Override
    public void getContent() {
        for(String line : this.content){
            System.out.println(line);
        }
    }

    @Override
    public void returnFile() throws IOException{
        for(int i = content.size() -1; i >= 0; i--){
            System.out.println(content.get(i));
        }
    }

    @Override
    public void palindromeFile() throws IOException{
        for(String line : this.content){
            String reversed = new StringBuilder(line).reverse().toString();
            System.out.println(reversed);
        }
    }

    @Override
    public boolean compareFile(Files f){
        f.openFile();
        if (content.size() != f.content.size()) {
            //System.out.println("Ils ne sont pas pareils");
            return false;
        }
        for (int i = 0; i < content.size(); i++) {
            if (!content.get(i).equals(f.content.get(i))) {
                //System.out.println("Ils ne sont pas pareils");
                return false;
            }
        }
        //System.out.println("Ils sont pareils");
        return true;
    }
}
