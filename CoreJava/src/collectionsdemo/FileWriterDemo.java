package collectionsdemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//Program to create a text based file
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

        Writer w=new FileWriter("E:/javatest/data.txt");

		try
        {
            //w=new FileWriter("E:/javatest/data.txt");
            String content="She Sells Sea Shells In the Sea.";
           
            w.write(content); // write contents into file
           
            System.out.println("Character Data Written to File");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
		finally {
            w.close();

		}
	}

}
