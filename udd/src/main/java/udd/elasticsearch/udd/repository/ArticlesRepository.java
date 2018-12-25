package udd.elasticsearch.udd.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import udd.elasticsearch.udd.model.Article;

public interface ArticlesRepository  extends ElasticsearchRepository<Article,String> {

}
