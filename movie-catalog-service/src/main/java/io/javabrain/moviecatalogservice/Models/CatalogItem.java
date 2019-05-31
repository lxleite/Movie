package io.javabrain.moviecatalogservice.Models;

public class CatalogItem{
    private String name;
    private String desc;
    private int rating;

    public CatalogItem(String name, String desc, int rating ) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}