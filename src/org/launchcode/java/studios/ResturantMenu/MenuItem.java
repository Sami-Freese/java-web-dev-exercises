package org.launchcode.java.studios.ResturantMenu;

import java.util.Date;

public class MenuItem {

    private String name;
    private String description;
    private String category;
    private Date dateAdded = new Date();
    private boolean newItem;

    public MenuItem(String name, String description, String category, Date dateAdded, boolean newItem) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
        this.newItem = newItem;
    }
}
