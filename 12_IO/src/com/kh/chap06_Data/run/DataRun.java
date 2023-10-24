package com.kh.chap06_Data.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataRun {

	public static void main(String[] args) {
		DataRun dr = new DataRun();
		//dr.test1();
		test2();
	}
	
	public void test1() {
		//DataOutputStream : 기본자료형 + 문자열값을 출력할 수 있도록 도와주는 보조스트림
		//FileOutputStream : 
		
		File f = new File("sampel.dat");
		
		try( DataOutputStream dos = new DataOutputStream( new FileOutputStream("sample.dat") ) ){
			
			//자바의 기본자료형별로 작성기능 지원
			dos.writeBoolean(true);
			dos.writeInt(300);
			dos.writeDouble(3.14);
			dos.writeChar('안');
			dos.writeChar('녕');
			dos.writeUTF("자바자바자바");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("작업종료");
	}
	
	public static void test2() {
		File f = new File("sample.dat");
		
		try(DataInputStream dis = new DataInputStream( new FileInputStream(f))) {
			
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
