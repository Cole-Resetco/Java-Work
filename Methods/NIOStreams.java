import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;

import java.net.URI;

public class NIOStreams {
    public static void zipeFiles() {

        String[] data = { "Line 1", "Line 2 2", "Line 3 3 3", "Line 4 4 4 4", "Line 5 5 5 5 5", "Line 6 6 6 6 6 6" };

        try (FileSystem zipFs = openZip(Paths.get("Data/data.zip"))) { // Creates a filesystem and passes in the path to
                                                                       // where the zip will be put
            copyToZip(zipFs);
            writeToFileInZip1(zipFs, data);
            writeToFileInZip2(zipFs, data);
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }

    }

    private static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException {
        HashMap<String, String> providerProps = new HashMap<String, String>(); // creates hashmap for raw data
        providerProps.put("create", "true");

        URI zipURI = new URI("jar:file", zipPath.toUri().getPath(), null); // converts the filepath to URI for ease of
                                                                           // zipping

        FileSystem zipFs = FileSystems.newFileSystem(zipURI, providerProps); // creates the zip file using the file
                                                                             // path(zipURI) and the data
                                                                             // (providerProps)

        return zipFs;

    }

    private static void copyToZip(FileSystem zipFs) throws IOException {
        Path sourceFile = Paths.get("Data/data.txt");
        Path destFile = zipFs.getPath("/CopiedData.txt");

        Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING);
    }

    private static void writeToFileInZip1(FileSystem zipFs, String[] data) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(zipFs.getPath("/newFile1.txt"))) {
            // creates a standard buffered writer, gets the file path, and then creates a
            // for loop to write the specified lines

            for (String d : data) {
                writer.write(d);
                writer.newLine();
            }
        }
    }

    private static void writeToFileInZip2(FileSystem zipFs, String[] data) throws IOException {
        Files.write(zipFs.getPath("/newFile2.txt"), Arrays.asList(data), Charset.defaultCharset(),
                StandardOpenOption.CREATE);
        // uses the built in Files.write method, specifies path, changes the array to a
        // list, specifies the charset and specifies the create option

    }

}