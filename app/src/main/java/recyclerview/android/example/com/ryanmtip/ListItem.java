package recyclerview.android.example.com.ryanmtip;

public class ListItem {


    private String head;
    private String desc;
    private String imageUrl;

    public ListItem(String head, String desc) {
        this.head = head;
        this.desc = desc;
        this.imageUrl = imageUrl;
    }

    public String getHead() { return head; }

    public String getDesc() { return desc; }

    public String getImageUrl() {
        return imageUrl;
    }
}
