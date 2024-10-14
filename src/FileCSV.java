import java.io.IOException;

public class FileCSV extends Files{

    public FileCSV(String filePath){
        super(filePath);
    }

    @Override
    public String traitementLigne(String line){
        return line.replace(","," ");
    }

    @Override
    public void palindromeFile() throws IOException {
        for(String line : this.content){
            String reversed = new StringBuilder(line).reverse().toString();
            System.out.println(reversed);
        }
    }

    @Override
    public void returnFile() throws IOException{
        for(int i = content.size()-1; i >= 0; i--){
            System.out.println(content.get(i).replace(","," "));
        }
    }
}
