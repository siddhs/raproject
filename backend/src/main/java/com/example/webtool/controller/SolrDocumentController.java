package com.example.webtool.controller;

import com.example.webtool.model.DocIdModel;
import com.example.webtool.model.Document;
import com.example.webtool.model.PersonToDocIdModel;
import com.example.webtool.repository.AnnotationRepository;
import com.example.webtool.repository.DocIdRepository;
import com.example.webtool.repository.DocumentRepository;
import com.example.webtool.repository.PersonToDocIdRepository;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.response.SolrPingResponse;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.solr.core.SolrCallback;
import org.springframework.data.solr.core.SolrOperations;
import org.springframework.data.solr.core.convert.SolrConverter;
import org.springframework.data.solr.core.query.*;
import org.springframework.data.solr.core.query.result.*;
import org.springframework.data.solr.core.schema.SchemaOperations;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.example.webtool.model.AnnotationModel;

import javax.validation.Valid;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Created by Siddharth Sinha
 */

@RestController
public class SolrDocumentController {

    @Autowired
    private DocumentRepository documentRepository;

    @Autowired
    private PersonToDocIdRepository personToDocIdRepository;

    @Autowired
    private DocIdRepository docIdRepository;

    @Autowired
    private AnnotationRepository annotationRepository;

    DocIdModel docIdModel = new DocIdModel();


    @RequestMapping("/")
    public String SampleController() {
        return "THis is a sample page!!!!";
    }

    @RequestMapping(value = "/a", method = RequestMethod.POST)
    public String sampleMethod(@RequestBody String name) {
        return "Name received is:"+name;
    }

    @CrossOrigin
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public List<SearchResponseDTO> getDocs(@RequestParam String name) {
        List<PersonToDocIdModel> persons = this.personToDocIdRepository.findAllByPersonName(name);
        System.out.println(persons.size());
        List<SearchResponseDTO> responseDTOS = new ArrayList<>();

        for (PersonToDocIdModel person: persons) {
            SearchResponseDTO searchResponseDTO = new SearchResponseDTO();
            List<String> textList = new ArrayList<>();
            System.out.println(person.getPersonName());
            searchResponseDTO.setPersonName(person.getPersonName());
            for (String docId: person.getDocIds()) {
//                searchResponseDTO.setDocId(docId);
                docId = docId.replace(".txt","");
                System.out.println(docId);
                textList.add(this.docIdRepository.findByDocIdContains(docId).getText());
            }
            searchResponseDTO.setText(textList);
            responseDTOS.add(searchResponseDTO);
        }
        return responseDTOS;
    }

    @CrossOrigin
    @RequestMapping(value = "/saveannotations", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("annotationModel")AnnotationModel annotationModel,
                         BindingResult bindingResult, ModelMap modelMap) {
        if (bindingResult.hasErrors()) {
            return "error";
        }

        System.out.println("the received params are");
        System.out.println(annotationModel.getUserName());
        System.out.println(annotationModel.getCareer());
        System.out.println(annotationModel.getDateAndBirthPlace());
        System.out.println(annotationModel.getEarlyLifeAndEducation());
        System.out.println(annotationModel.getFamilyAndChildren());
        System.out.println(annotationModel.getMajorAccomplishments());
        System.out.println(annotationModel.getSubjectOfBiography());
        System.out.println(annotationModel.getWorldChange());

        return "200";
    }
}
