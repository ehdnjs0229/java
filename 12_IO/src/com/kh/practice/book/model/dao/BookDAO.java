package com.kh.practice.book.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	
	private Book[] bArr = new Book[10];
	
	public void fileSave(Book[] bArr) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"))) {
			if(bArr != null)
				oos.writeObject(bArr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//  객체를  저장하는  스트림인  ObjectOutputStream을  가지고  book.txt에   
		//  매개변수로  받은  bArr을  저장,  단  null이  아닌  것만  저장함
		
	}
	
	public Book[] fileRead() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"))) {
			bArr = (Book[]) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//  저장된  객체를  읽어오는  스트림인  ObjectInputStream을  가지고   
		// book.txt에  저장된  객체를  필드  bArr에  저장하여  반환 
		//  더  이상  파일에  읽을  게  없을  때  뜨는  예외인  EOFException이  발생하면 
		//  예외만  잡아주고  안에는  아무  처리도  하지  않음
		// catch(EOFException ) {}
		return bArr;
	}

}
