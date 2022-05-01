package projet_java;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public interface finder {

	
	 public static List scan(String path){
			
			
		   List files = new ArrayList();
		   Path dir = Paths.get(path);
	        try {
	            DirectoryStream<Path> ds = Files.newDirectoryStream(dir, "*.csv");
	            for (Path entry: ds) {
	                files.add(entry);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		   return files;
		 }
}
