package com.codePalace.backend.Fund.model;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "user")
public class User implements Serializable {
    String id;
    String name ;
    String image_url;
    String email ;
    String secondary_email ;
    String phone_no;
    String role_name;
    String facebook_url ;
    String twitter_url ;
    String instagram_url;
    String google_plus_url;
    Long total_backed_amount;
    Boolean is_stripe_connected;
/*    Address address;
    LiteProject[] projects ;
    int project_backers;
    LiteProject[] backed_projects ;
    Notification[] notifications ;
    LiteProject project_in_funding_state ;
    Kyc kyc ;*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecondary_email() {
        return secondary_email;
    }

    public void setSecondary_email(String secondary_email) {
        this.secondary_email = secondary_email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getFacebook_url() {
        return facebook_url;
    }

    public void setFacebook_url(String facebook_url) {
        this.facebook_url = facebook_url;
    }

    public String getTwitter_url() {
        return twitter_url;
    }

    public void setTwitter_url(String twitter_url) {
        this.twitter_url = twitter_url;
    }

    public String getInstagram_url() {
        return instagram_url;
    }

    public void setInstagram_url(String instagram_url) {
        this.instagram_url = instagram_url;
    }

    public String getGoogle_plus_url() {
        return google_plus_url;
    }

    public void setGoogle_plus_url(String google_plus_url) {
        this.google_plus_url = google_plus_url;
    }

    public Long getTotal_backed_amount() {
        return total_backed_amount;
    }

    public void setTotal_backed_amount(Long total_backed_amount) {
        this.total_backed_amount = total_backed_amount;
    }

    public Boolean getIs_stripe_connected() {
        return is_stripe_connected;
    }

    public void setIs_stripe_connected(Boolean is_stripe_connected) {
        this.is_stripe_connected = is_stripe_connected;
    }

/*    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LiteProject[] getProjects() {
        return projects;
    }

    public void setProjects(LiteProject[] projects) {
        this.projects = projects;
    }

    public int getProject_backers() {
        return project_backers;
    }

    public void setProject_backers(int project_backers) {
        this.project_backers = project_backers;
    }

    public LiteProject[] getBacked_projects() {
        return backed_projects;
    }

    public void setBacked_projects(LiteProject[] backed_projects) {
        this.backed_projects = backed_projects;
    }

    public Notification[] getNotifications() {
        return notifications;
    }

    public void setNotifications(Notification[] notifications) {
        this.notifications = notifications;
    }

    public LiteProject getProject_in_funding_state() {
        return project_in_funding_state;
    }

    public void setProject_in_funding_state(LiteProject project_in_funding_state) {
        this.project_in_funding_state = project_in_funding_state;
    }

    public Kyc getKyc() {
        return kyc;
    }

    public void setKyc(Kyc kyc) {
        this.kyc = kyc;
    }*/
}
