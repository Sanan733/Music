package musicOperation;

public interface MusicInterface {
     void addMusic(Music music);
     void uptade (int id, String name , String author);
     Music getMusic(int id);
     void deleteMusic(int id);
}
