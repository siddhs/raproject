package com.example.webtool.model;


import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "annotations")
public class AnnotationModel {

    @Id
    @Indexed(name = "id", type = "string")
    private String id;
    @Field
    private String subjectOfBiography;
    @Field
    private String dateAndBirthPlace;
    @Field
    private String earlyLifeAndEducation;
    @Field
    private String Career;
    @Field
    private String familyAndChildren;
    @Field
    private String majorAccomplishments;
    @Field
    private String worldChange;
    @Field
    private String userName;

    public AnnotationModel() {}

    public AnnotationModel(String subjectOfBiography, String dateAndBirthPlace, String earlyLifeAndEducation,
                           String Career, String familyAndChildren, String majorAccomplishments, String worldChange, String userName) {
        this.subjectOfBiography = subjectOfBiography;
        this.dateAndBirthPlace = dateAndBirthPlace;
        this.earlyLifeAndEducation = earlyLifeAndEducation;
        this.Career = Career;
        this.familyAndChildren = familyAndChildren;
        this.majorAccomplishments = majorAccomplishments;
        this.worldChange = worldChange;
        this.userName = userName;
    }


    // Standard getters and setters

    public String getSubjectOfBiography() {return subjectOfBiography;}

    public void setSubjectOfBiography(String subjectOfBiography) {
        this.subjectOfBiography = subjectOfBiography;
    }

    public String getDateAndBirthPlace() {return dateAndBirthPlace;}

    public void setDateAndBirthPlace(String dateAndBirthPlace) {
        this.dateAndBirthPlace = dateAndBirthPlace;
    }

    public String getEarlyLifeAndEducation() {return earlyLifeAndEducation;}

    public void setEarlyLifeAndEducation(String earlyLifeAndEducation) {
        this.earlyLifeAndEducation = earlyLifeAndEducation;
    }

    public String getCareer() {return Career;}

    public void setCareer(String Career) {
        this.Career = Career;
    }

    public String getFamilyAndChildren() {return familyAndChildren;}

    public void setFamilyAndChildren(String familyAndChildren) {
        this.familyAndChildren = familyAndChildren;
    }

    public String getMajorAccomplishments() {return majorAccomplishments;}

    public void setMajorAccomplishments(String majorAccomplishments) {
        this.majorAccomplishments = majorAccomplishments;
    }

    public String getWorldChange() {return worldChange;}

    public void setWorldChange(String worldChange) {
        this.worldChange = worldChange;
    }

    public String getUserName() {return userName;}

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
