package libraryRestClient.library.client;



public class Author {

    private long authorNumber;
    private String name;

    public Author(){}

    public Author(long authorNumber, String name) {
        this.authorNumber = authorNumber;
        this.name = name;
    }

    public long getAuthorNumber() {
        return authorNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorNumber=" + authorNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
