import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

class TryWithResource{
	public static void main(String[] args){
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		
		try(BufferedWriter writer = Files.newBufferedWriter(file)){
			writer.write('A');
			writer.write('B');
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}