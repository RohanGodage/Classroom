package FileHandling;
import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/rohangodage/Desktop/FileHandling/abc.txt");
        boolean fileCreated = file.createNewFile();
        System.out.println("File created "+ fileCreated);
        boolean Foldercreated = file.mkdir();

        File folder = new File("Dummy");
        System.out.println("Folder created"+Foldercreated);
    }
}
