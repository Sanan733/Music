package musicOperation;

public class MusicImplemets implements MusicInterface {

    Music[] musics = new Music[5];
    private int currentcount = 0;

    @Override
    public void addMusic(Music music) {
        if (currentcount < musics.length) {
            musics[currentcount++] = music;
            System.out.println("Music added: ");
        } else {
            System.out.println("empty is not found: ");
        }
    }

    @Override
    public void uptade(int id, String name, String singername) {
        for (int i = 0; i < currentcount; i++) {
            if (musics[i].getId() == id) {
                musics[i].setSingername(singername);
                musics[i].setName(name);
                System.out.println("Music added");
                return;
            }
        }
        System.out.println("Music is not found: " + id + " ");
    }


    @Override
    public Music getMusic(int id) {

        return null;
    }

    @Override
    public void deleteMusic(int id) {
        for (int i = 0; i < currentcount; i++) {
            if (musics[i].getId() == id) {
                currentcount--;
                System.out.println("Musiqi silindi: " + " " + "Music was deleted: ");
            } else {
                System.out.println("Musiqi silinmədi: " + " " + "Music wasn't deleted: ");
            }
        }
    }
}
