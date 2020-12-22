import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyTest1 {

	public static void main(String[] args) throws IOException {
//		文件的创建和输入
//		java.io.File file=new java.io.File("scores.txt");
//		if(file.exists()) {
//			System.out.println("scores.txt already exists");
//			System.exit(0);
//		}
//		try (
//			java.io.PrintWriter output=new java.io.PrintWriter(file);
//		){
//			output.print("John T smith ");
//			output.println("90");
//			output.print("Eric K jones");
//			output.println("85");
//		}
		
		File sourceFile=new File("scores.txt");
		if(!sourceFile.exists()) {
			System.out.println("Source file scores.txt does not exist");
			System.exit(2);
		}
		
		File targetFile=new File("target.txt");
		if(targetFile.exists()) {
			System.out.println("Source file target.txt already exist");
			System.exit(3);
		}
		
		try(
//			BufferedInputStream和BufferedOutputStream 面向字节的缓冲流
			BufferedInputStream input=new BufferedInputStream(new FileInputStream(sourceFile));
			BufferedOutputStream output=new BufferedOutputStream(new FileOutputStream(targetFile));
		){
			int r,numberOfBytesCopied=0;
			while ((r=input.read())!=-1) {
				output.write((byte)r);
				numberOfBytesCopied++;
			}
			System.out.println(numberOfBytesCopied+"Bytes Copied");
		}
		
	}

}