package com.example.movies.pojo;

public class Movie {
    private String name ;
    private int id ;
    private String img;
    private String voteAverage ;

   public Movie (String name , int id , String img , String voteAverage){
        this.name = name;
        this.id = id;
        this.img = img;
        this.voteAverage = voteAverage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }
}
