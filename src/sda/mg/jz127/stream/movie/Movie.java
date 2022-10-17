package sda.mg.jz127.stream.movie;

class Movie {
    private final String name;
    private final Category category;
    private final long duration;
    private final Director director;

    Movie(String name, Category category, long duration, Director director) {
        this.name = name;
        this.category = category;
        this.duration = duration;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public Director getDirector() {
        return director;
    }

    public long getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", duration=" + duration +
                ", director=" + director +
                '}';
    }
}
