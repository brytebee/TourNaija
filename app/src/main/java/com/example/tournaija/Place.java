package com.example.tournaija;

/**
 *
 * {@Link Place} is a class the defines the locations
 * that are described to the user in the app
 * */
public class Place {
    /* the name of place */
    private String name;

    // the description of a place
    private String description;

    // the contact of a place
    private String contact;

    // the image of a place
    private int imageId;

    // the business hours of a place
    private String businessHours;

    /**
     * Place class constructor with five parameters
     * @param name is the location name
     * @param description is the location description
     * @param contact is the location contact information
     * @param imageId is the location image(s)
     * @param businessHours is the location business hours*/
    public Place(String name, String description, String contact, int imageId, String businessHours) {
        this.name = name;
        this.description = description;
        this.contact = contact;
        this.imageId = imageId;
        this.businessHours = businessHours;
    }

    /**
     * Place class constructor with five parameters
     * @param name is the location name
     * @param description is the location description
     * @param imageId is the location image(s)
     */
    public Place(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }

    /**
     * Place class constructor with five parameters
     * @param name is the location name
     * @param description is the location description*/
    public Place(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // get name of place
    public String getName() {
        return name;
    }

    // get the description of place
    public String getDescription() {
        return description;
    }

    // get contact info of place
    public String getContact() {
        return contact;
    }

    // get image(s) of place
    public int getImageId() {
        return imageId;
    }

    // get business hours of place
    public String getBusinessHours() {
        return businessHours;
    }
}
