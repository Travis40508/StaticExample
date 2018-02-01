package com.company;

public class Game {

    private String title;
    private String genre;
    private int hoursPlayed;

    public Game(String title, String genre, int hoursPlayed) {
        this.title = title;
        this.genre = genre;
        this.hoursPlayed = hoursPlayed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getHoursPlayed() {
        return hoursPlayed;
    }

    public void setHoursPlayed(int hoursPlayed) {
        this.hoursPlayed = hoursPlayed;
    }

    public static String bestGameByYear(int year) {
        switch(year) {
            case 2011:
                return "Portal 2";
            case 2012:
                return "The Walking Dead";
            case 2013:
                return "The Last of Us";
            case 2014:
                return "Bayonetta 2";
            case 2015:
                return "Bloodborne";
            case 2016:
                return "Overwatch";
            case 2017:
                return "Zelda : Breath of the Wild";
            default:
                return "No game available for this year";
        }
    }
}
