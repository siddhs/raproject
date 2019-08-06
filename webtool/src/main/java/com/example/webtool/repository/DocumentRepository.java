package com.example.webtool.repository;

import java.util.List;
import org.springframework.data.solr.repository.SolrCrudRepository;
import com.example.webtool.model.Document;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface DocumentRepository extends SolrCrudRepository<Document, String> {
    List<Document> findAllByPerson(String person); // find documents whose person name matches the name of the person in the query
    List<Document> findAllByRank(String rank); // find documents whose rank matches the rank of the person in the query

}
