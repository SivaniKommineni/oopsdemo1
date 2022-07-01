package collectionsdemo;

import java.io.FileReader;
import java.io.Reader;

//java program to read text or character data from a text file
public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
        {
            Reader reader=new FileReader("E:/javatest/data.txt");
            
            int data=reader.read(); // return unicode value of character
            
            while(data!= -1) // -1 when stream ends
            {
                System.out.print((char) data);
                data=reader.read();
            }
            reader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

 

    }

	}


