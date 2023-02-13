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

    public String getArtist() {
        return artist;
    }
    public void setArtist(String version) {
        this.artist = artist;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String code) {
        this.label = label;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist;
    }
}