package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {
		Vehicle v = new Vehicle("탈것", 0.5, null );
		Car c = new Car("테슬라",12.5,"전기차",4);
		Airplane ap = new Airplane("콜럼비아호",0.02,"여객기", 16,5);
		
		System.out.println(v.information());
		System.out.println(c.information());
		System.out.println(ap.information());
		
		v.howToMove();
		c.howToMove();
		ap.howToMove();

	}

}
