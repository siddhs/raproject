package com.example.webtool.repository;

import com.example.webtool.model.AnnotationModel;
import org.springframework.data.solr.repository.SolrCrudRepository;

public interface AnnotationRepository extends SolrCrudRepository<AnnotationModel, String>{}

