package sg.edu.rp.c346.problem_statement_10;

import java.util.Calendar;

/**
 * Created by 16020089 on 23/7/2018.
 */

public class MovieItems {
    private String title;
    private String year;
    private String rated;
    private String genre;
    private Calendar Watched_on;
    private String in_theatre;
    private String description;
    private Integer rating;

    public MovieItems(String title, String year, String rated, String genre, Calendar watched_on, String in_theatre, String description, Integer rating) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        Watched_on = watched_on;
        this.in_theatre = in_theatre;
        this.description = description;
        this.rating = rating;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatched_on() {
        return Watched_on;
    }

    public void setWatched_on(Calendar watched_on) {
        Watched_on = watched_on;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }
    public String getDateString() {
        String str = Watched_on.get(Calendar.DAY_OF_MONTH)+"/"+Watched_on.get(Calendar.MONTH)+"/"+Watched_on.get(Calendar.YEAR);
        return str;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MovieItems{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rated='" + rated + '\'' +
                ", genre='" + genre + '\'' +
                ", Watched_on=" + Watched_on +
                ", in_theatre='" + in_theatre + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }
}
