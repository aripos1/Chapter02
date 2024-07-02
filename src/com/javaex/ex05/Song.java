package com.javaex.ex05;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public void setTitle(String a) {
		title = a;
	}

	public String getTitle() {
		return title;
	}

	public void setArtist(String b) {
		artist = b;
	}

	public String getArtist() {
		return artist;
	}

	public void setAlbum(String c) {
		album = c;
	}

	public String getAlbum() {
		return album;
	}

	public void setComposer(String d) {
		composer = d;
	}

	public String getComposer() {
		return composer;
	}

	public void setYear(int e) {
		year = e;
	}
	public int getYear() {
		return year;
	}
	public void setTrack(int f) {
		track = f;
	}
	public int getTrack() {
		return track;
	}
	
	public void showInfo() {
		
		System.out.println(artist+", "+title+" ( "+album+", "+year+", "+track+"번 track, "+composer+" 작곡 )");

	}
}
