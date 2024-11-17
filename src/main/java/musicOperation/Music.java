package musicOperation;

public class Music {
    private int id;
    private String name;
    private String singername;
    private boolean isPremium;

    public  Music(int id, String name , String singername, boolean isPremium){
        this.id=id;
        this.name=name;
        this.singername=singername;
        this.isPremium=isPremium;
    }

    public String getSingername() {
        return singername;
    }

    public void setSingername() {
        this.singername = singername;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPremium() {
        return isPremium;
    }


    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singername='" + singername + '\'' +
                ", isPremium=" + isPremium +
                '}';
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

}
