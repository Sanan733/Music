public class MusicImplemets implements MusicInterface{

    Music [] musics=new Music[10];
    private int currentcount=0;

    @Override
    public void addMusic(Music music) {
        if (currentcount< musics.length){
            musics[currentcount++] = music;
            System.out.println("Musiqi elave olundu: ");
        }
        else {
            System.out.println("Boş yer yoxdur: ");
        }
    }

    @Override
    public void uptade(int id, String name, String author) {
        for (int i=0 ; i<currentcount ; i++){
            if (musics[i].getId()==id){
                musics[i].setName();
                musics[i].setSingername();
                return;
            }
            else {
                System.out.println("Id doesn't found: ");
            }
        }
    }

    @Override
    public Music getMusic(int id) {
        return null;
    }

    @Override
    public void deleteMusic(int id) {
        for (int i=0 ; i<currentcount ; i++){
            if (musics[i].getId()==id){
                currentcount--;
                System.out.println("Musiqi silindi: "+" "+"Music was deleted: ");
            }
            else {
                System.out.println("Musiqi silinmədi: "+" "+"Music wasn't deleted: ");
            }
        }

    }
}
