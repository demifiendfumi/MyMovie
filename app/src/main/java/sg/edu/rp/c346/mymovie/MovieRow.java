package sg.edu.rp.c346.mymovie;

/**
 * Created by 16022603 on 24/7/2017.
 */

public class MovieRow {
    private String title;
    private String year;
    private String genre;
    private String rating;

    public MovieRow(String title, String year, String genre, String rating) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "MovieRow{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", genre="+ genre +
                ", rating="+ rating +
                '}';
    }
}