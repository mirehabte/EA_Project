package library.library.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="library")
public class ApplicationProperties {

    private double penalityFee;

    private String bookURL;

    public double getPenalityFee() {
        return penalityFee;
    }

    public String getBookURL() {
        return bookURL;
    }

    public void setPenalityFee(double penalityFee) {
        this.penalityFee = penalityFee;
    }

    public void setBookURL(String bookURL) {
        this.bookURL = bookURL;
    }
}
