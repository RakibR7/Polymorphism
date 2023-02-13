package ie.atu.productv4;

public class Music extends Product {

    private String artist;  //version
    private String label;   //code

    public Music() {
        super();
        artist = "";
        label = "";
        count++;
    }
    public void setArtist(String version) {
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }

    public void setLabel(String code) {
        this.label = label;
    }
    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist;
    }
}