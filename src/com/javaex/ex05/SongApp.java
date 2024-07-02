package com.javaex.ex05;

public class SongApp {
	
	public static void main(String[] args) {
		
		Song info1= new Song();
		Song info2= new Song();
		Song info3= new Song();
		
		info1.setArtist("아이유");
		info1.setTitle("좋은날");
		info1.setAlbum("Real");
		info1.setYear(2010);
		info1.setTrack(3);
		info1.setComposer("이민수");
	
		info2.setArtist("BIGBANG");
		info2.setTitle("거짓말");
		info2.setAlbum("Always");
		info2.setYear(2007);
		info2.setTrack(2);
		info2.setComposer("G-DRAGON");
	
		info3.setArtist("버스커버스커");
		info3.setTitle("벚꽃엔딩");
		info3.setAlbum("버스커버스커1집");
		info3.setYear(2012);
		info3.setTrack(4);
		info3.setComposer("장범준");
	
		info1.showInfo();
		info2.showInfo();
		info3.showInfo();
	}
	
}
