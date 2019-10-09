package com.codePalace.backend.Fund.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;
import java.util.Date;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Project implements Serializable {

    String id ;
    String title ;
    String category_id;
    String image_url ;
    String video_url ;
    Double pledged_amount ;
    Double funded_amount ;
    String funding_model ;
    String category_name ;
    String user_id ;
    User user;
    String user_name ;
    int total_backers ;
    double percent_funded ;
/*    Date start_date ;
    Date end_date;*/
    int duration ;
    String currency;
    Pictures[] pictures;
    Reward[]  rewards;
    Faq[] faqs;
    Link[] links;
    Story story;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public Double getPledged_amount() {
        return pledged_amount;
    }

    public void setPledged_amount(Double pledged_amount) {
        this.pledged_amount = pledged_amount;
    }

    public Double getFunded_amount() {
        return funded_amount;
    }

    public void setFunded_amount(Double funded_amount) {
        this.funded_amount = funded_amount;
    }

    public String getFunding_model() {
        return funding_model;
    }

    public void setFunding_model(String funding_model) {
        this.funding_model = funding_model;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getTotal_backers() {
        return total_backers;
    }

    public void setTotal_backers(int total_backers) {
        this.total_backers = total_backers;
    }

    public double getPercent_funded() {
        return percent_funded;
    }

    public void setPercent_funded(double percent_funded) {
        this.percent_funded = percent_funded;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Pictures[] getPictures() {
        return pictures;
    }

    public void setPictures(Pictures[] pictures) {
        this.pictures = pictures;
    }

    public Reward[] getRewards() {
        return rewards;
    }

    public void setRewards(Reward[] rewards) {
        this.rewards = rewards;
    }

    public Faq[] getFaqs() {
        return faqs;
    }

    public void setFaqs(Faq[] faqs) {
        this.faqs = faqs;
    }

    public Link[] getLinks() {
        return links;
    }

    public void setLinks(Link[] links) {
        this.links = links;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }
}
