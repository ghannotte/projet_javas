package projet_java;

import java.util.ArrayList;
import java.util.List;

public class finder_class implements import_all {

	 public static List imports(String path) {
			
		 List targets = finder.scan(path);
		 List imports = new ArrayList();
	
		 for (int i = 0; i < targets.size(); i++) {
			 
			 
			 Object b = targets.get(1);
			 String c=b.toString(); 
			 List a = import_csv.creat(c);
			 imports.addAll(a);
		    }
		 
		 
		 
		 return imports;
	 }
	
}
