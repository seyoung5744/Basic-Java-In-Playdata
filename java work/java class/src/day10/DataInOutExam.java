package day10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInOutExam {

	public static void main(String[] args) {
		try(
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
			){
			dos.writeBoolean(true);
			dos.writeInt(10);
			dos.writeChar('c');
			dos.writeDouble(10.0);		
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try(
				DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
		){
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
