package com.kh.practice.chap02_abstractNInterFace.model.vo;

public interface CellPhone extends Phone , Camera{
	public abstract String charge(); // 충전 방식

}
