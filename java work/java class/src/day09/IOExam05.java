package day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class IOExam05 {
	public static void main(String[] args) {
		URL url = null;
		try {
			// url 추상화
			url = new URL("https://www.naver.com/"); 
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 해당 페이지에서 한줄씩
		//url.openStream(); 
		BufferedReader br;
		try {
			String s;
			byte[] b = new byte[1024];
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
