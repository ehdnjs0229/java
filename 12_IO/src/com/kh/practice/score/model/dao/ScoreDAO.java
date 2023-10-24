package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {
	
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		
		try( DataOutputStream dos = new DataOutputStream( new FileOutputStream("score.txt", true) ) ){
			
			//자바의 기본자료형별로 작성기능 지원
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public DataInputStream readScore() throws FileNotFoundException{
		
		File file = new File("score.txt");

	    if (!file.exists()) {
	        throw new FileNotFoundException("성적 데이터 파일이 존재하지 않습니다.");
	    }

	    try {
	        DataInputStream dataIn = new DataInputStream(new FileInputStream(file));
	        return dataIn;
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	        throw e;
	    }
		
		
	}

}
