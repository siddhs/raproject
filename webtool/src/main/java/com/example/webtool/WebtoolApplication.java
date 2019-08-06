package com.example.webtool;

import org.apache.solr.client.solrj.SolrClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;
import org.springframework.data.solr.server.SolrClientFactory;


@SpringBootApplication
@EnableSolrRepositories(
		basePackages = "com.example.webtool.repository"
)
public class WebtoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebtoolApplication.class, args);
	}

//	@Bean
//	public SolrClientFactory solrClientFactory(final SolrClient solrClient) {
//		Credentials credentials = new UsernamePasswordCredentials("test", "test");
//		return new HttpSolrClientFactory(solrClient,"collection", credentials,"BASIC");
//	}

}
