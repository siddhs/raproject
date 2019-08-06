package com.example.webtool.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.List;

@SolrDocument(solrCoreName = "persontodocid")
public class PersonToDocIdModel {

    @Id
    @Indexed(name = "id", type = "string")
    private String id;

    @Field
    private String personName;

    @Field
    private List<String> docIds;

    public PersonToDocIdModel() {}

    public PersonToDocIdModel(String personName, List<String> docIds) {
        this.personName = personName;
        this.docIds = docIds;
    }

    // Standard getters and setters
    public String getPersonName() { return personName; }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public List<String> getDocIds() { return docIds; }

    public void setDocIds(List<String> docIds) {
        this.docIds = docIds;
    }
}
