public class TestMovie {
    public static void main(String[] args) {
        Movie m = new Movie("Inception", "Ilon Mask", 148);
        System.out.println(m.getMovieDetails());
    }
}

class Movie {
    private String title;
    private String director;
    private int duration;

    public Movie(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public int getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getMovieDetails() {
        return "Title: " + title + "\nDirector: " + director + "\nDuration: " + duration + " minutes";
    }
}
