package com.example.webtool.controller;

import java.util.List;

/**
 * Created by Siddharth Sinha
 */


public class SearchResponseDTO {
//    private String docId;
    private String personName;
    private List<String> text;

    public SearchResponseDTO() {}

    public SearchResponseDTO(String docId, List<String> text, String personName) {
//        this.docId = docId;
        this.text = text;
        this.personName = personName;
    }

//    public void setDocId(String docId) {
//        this.docId = docId;
//    }
//
//    public String getDocId() {return docId;}

    public void setText(List<String> text) {
        this.text = text;
    }

    public List<String> getText() {return text;}

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {return personName;}

}
