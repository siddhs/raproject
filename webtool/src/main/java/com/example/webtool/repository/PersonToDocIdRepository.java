package com.example.webtool.repository;

import com.example.webtool.model.PersonToDocIdModel;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonToDocIdRepository extends SolrCrudRepository<PersonToDocIdModel, String> {
    List<PersonToDocIdModel> findAllByPersonName(String personName); // Retrieves list of document matching the person name
    List<PersonToDocIdModel> findAllByDocIds(String docId);
}
