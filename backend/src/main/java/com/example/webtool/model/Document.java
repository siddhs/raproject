package com.example.webtool.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "gettingstarted")
public class Document {

    @Id
    @Indexed(name = "id", type = "string")
    private String id;

    @Field
    private String person;

    @Field
    private String rank;

    @Field
    private String text;

    public Document() { }

    public Document(String person, String rank, String text) {
        this.person = person;
        this.rank = rank;
        this.text = text;

    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
