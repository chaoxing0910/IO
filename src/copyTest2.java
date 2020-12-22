import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class copyTest2 {

	public static void main(String[] args) {

		FileChannel input =null;
		FileChannel output =null;
		try {
//			FileInputStream和FileOutputStream 操作byte类型
			input=new FileInputStream(new File("scores.txt")).getChannel();
	        output = new FileOutputStream(new File("target.txt")).getChannel();
	        output.transferFrom(input, 0, input.size());
	    } catch (Exception e) {
	    	System.out.println("error occur while copy");
	    }
	}
}