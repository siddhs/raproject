package com.example.webtool.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "docidcore")
public class DocIdModel {

    @Id
    @Indexed(name = "id", type = "string")
    private String id;

    @Field
    private String docId;

    @Field
    private String text;

    private String personName;

    public DocIdModel() {}

    public DocIdModel(String docId, String text) {
        this.docId = docId;
        this.text = text;
    }

    // Standard getters and setters
    public String getDocId() { return docId;}

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getText() {return text;}

    public void setText(String text) {
        this.text = text;
    }

    public String getPersonName() { return personName;}

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
