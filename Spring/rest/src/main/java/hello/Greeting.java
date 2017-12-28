package hello;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
    	//String pirulo = null;
    	//this.content = pirulo;
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}