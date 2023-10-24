package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		File f = new File(file);
		return f.isFile();
	}
	
	public void filSave(String file, String s) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			fw.write(s);
			
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public StringBuilder fileOpen(String file) {
		FileReader fr = null;
		StringBuilder sb = new StringBuilder();
		try {
			fr = new FileReader(file);
			
			int value = 0;
			while( (value = fr.read()) != -1 ) {
				sb.append((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb;
		
	}
	
	public void fileEdit(String file, String s) {
		try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
