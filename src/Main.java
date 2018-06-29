import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GameBoard.Instance().ProcessCommands("C:/Users/HENRY/workspace/Assignment3/src/commands.txt");
		//List<String> commandLines = Files.readAllLines(Paths.get(commandFileName));
	/*	

	    Charset charset = Charset.forName("ISO-8859-1");
	    try {
	      //List<String> lines = Files.readAllLines(wiki_path, charset);
	    List<String> commandLines = Files.readAllLines(Paths.get("C:/Users/HENRY/workspace/Assignment3/src/commands.txt"), charset);
	      for (String line : commandLines) {
	        System.out.println(line);
	      }
	    } catch (IOException e) {
	      System.out.println(e);
	    }
*/
	}

}
