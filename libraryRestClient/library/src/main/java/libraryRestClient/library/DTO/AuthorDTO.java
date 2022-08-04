package libraryRestClient.library.DTO;

public class AuthorDTO {
    private long authorNumber;
    private String name;

    public AuthorDTO(){}

    public AuthorDTO(long authorNumber, String name) {
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

}
