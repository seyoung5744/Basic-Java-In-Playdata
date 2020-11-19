package day04.실습예제2;

/*
	121pg 실습예제2
 */
public class Song {
	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;

	public Song() {
		this("", "","",null,0,0);
	}

	public Song(String title, String artist) {
		this(title, artist, "", null, 0, 0);
	}
	
	public Song(String title, String artist, String album, String[] Composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = Composer;
		this.year = year;
		this.track = track;
	}

}
