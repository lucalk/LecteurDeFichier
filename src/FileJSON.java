import java.io.File;
import java.io.IOException;


public class FileJSON extends Files {

    public FileJSON(String filePath) {
        super(filePath);
    }

    @Override
    public void returnFile() throws IOException{
        for(int i = content.size()-1; i >= 0; i--){
            System.out.println(content.get(i).replace(","," "));
        }
    }

    public String traitementLigne(String line){
        return line.trim();
    }
}
