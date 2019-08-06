package com.example.webtool.repository;

import com.example.webtool.model.DocIdModel;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocIdRepository extends SolrCrudRepository<DocIdModel, String> {
    List<DocIdModel> findDocIdModelByDocId(String docIds);
    DocIdModel findByDocIdContains(String docId);
}
