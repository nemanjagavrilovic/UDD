package udd.elasticsearch.udd.service;

import java.util.List;

import org.elasticsearch.index.query.QueryBuilder;

import udd.elasticsearch.udd.model.Article;
import udd.elasticsearch.udd.model.Reviewer;

public interface ArticleService {

	Article save(Article article);
	Iterable<Article> search(QueryBuilder query);
	Iterable<Article> findAll();
	Iterable<Article> saveAll(List<Article> articles);
	void delete(String id);
}
