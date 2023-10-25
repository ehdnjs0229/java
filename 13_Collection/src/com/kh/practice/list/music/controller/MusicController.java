package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	
	private List<Music> list = new ArrayList();
	
	public int addList(Music music) {
		
		try {
			list.add(music);
		} catch(Exception e) {
			return 0;
		}
		
		return 1;
	}
	
	public int addAtZero(Music music) {
		
		try {
			list.add(music);
		} catch(Exception e) {
			return 0;
		}
	}
	
	public List printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		Music m = null;
		for (Music mus : list) {
			if ( mus.getTitle().equals(title)) {
				m = mus;
				break;
			}
		}
		
		return m;
	}
	
	public Music removeMusic(String title) {
		Music m = null;
		for(int i = 0; <list.r>)
	}

}
