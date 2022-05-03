package projet_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class finder_class implements import_all {

	 public static List imports(String path) {
			
		 List targets = finder.scan(path);
		 List imports = new ArrayList();
	
		 for (int i = 0; i < targets.size(); i++) {
			 
			
			 Object b = targets.get(i);
			 String c=b.toString(); 
			 List a = import_csv.creat(c);
			 for(int j = 1; j < a.size(); j++) {
			 imports.add(a.get(j));
			 
			 }
			 
		    }
		 
		 
		 return imports;
	 }
	
	 public static String[] split(Object entry){
		 
		 
		 String b =entry.toString();
		 
			String[] c = b.split(",");
			
			
			return c;
			
	 }
	 
	 
}
