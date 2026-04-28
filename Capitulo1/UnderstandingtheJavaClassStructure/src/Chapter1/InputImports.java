package Chapter1;
import java.nio.file.*;
/*import java.nio.file.Files;
import java.nio.file.Paths;
*Una manda a llamar todos los import mientras el segundo los llama especificamente
*	a cada uno
*
java.nio.*; // NO GOOD – a wildcard only matches
 //class names, not "file.*Files"
import java.nio.*.*; // NO GOOD – you can only have one wildcard
 //and it must be at the end
import java.nio.files.Paths.*; // NO GOOD – you cannot import methods
 //only class names
*/

public class InputImports {
	public void read(Files files) {
		Paths.get("name");
	}

}
