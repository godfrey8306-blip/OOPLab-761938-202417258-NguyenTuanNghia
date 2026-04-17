package hust.soict.dsai.aims.media;

public abstract class Media {
    protected String title;
    protected String category;
    protected float cost;

    public Media() {}

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }
}