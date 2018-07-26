package recyclerview.android.example.com.ryanmtip;

public class ListItem {


    private String head;
    private String desc;
    private String sym;
    private String treat;
    private String imageUrl;

    public ListItem(String head, String desc, String sym, String treat) {
        this.head = head;
        this.desc = desc;
        this.sym = sym;
        this.treat = treat;
        this.imageUrl = imageUrl;
    }

    public String getHead() { return head; }

    public String getDesc() { return desc; }

    public String getSym() {return sym; }

    public String getTreat() {return treat; }

    public String getImageUrl() {
        return imageUrl;
    }
}
