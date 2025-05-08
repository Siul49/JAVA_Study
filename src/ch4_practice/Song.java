package ch4_practice;

public class Song {
    private final String title;
    private final String singer;
    private final int year;
    private final String lang;

    public Song(String title, String singer, int year, String lang) {
        this.title = title;
        this.singer = singer;
        this.year = year;
        this.lang = lang;
    }

    public void show(){
        System.out.println(year + "년 " + lang + "의 " + singer + "가 부른 " + title);
    }

    public static void main(String[] args) {
        Song song = new Song("가로수 그늘 아래 서면", "이문세", 1988, "한국");

        song.show();
    }

}
