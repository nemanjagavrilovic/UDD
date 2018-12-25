package udd.elasticsearch.udd.serviceImpl;

import java.util.List;

import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import udd.elasticsearch.udd.model.Article;
import udd.elasticsearch.udd.repository.ArticlesRepository;
import udd.elasticsearch.udd.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticlesRepository articleRepository;
	
	@Override
	public Article save(Article article) {
		// TODO Auto-generated method stub
		return articleRepository.save(article);
	}

	@Override
	public Iterable<Article> search(QueryBuilder query) {
		// TODO Auto-generated method stub
		return articleRepository.search(query,1);
	}

	@Override
	public Iterable<Article> findAll() {
		// TODO Auto-generated method stub
		return articleRepository.findAll();
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		articleRepository.deleteAll();
		
	}

	@Override
	public Iterable<Article> saveAll(List<Article> articles) {
		// TODO Auto-generated method stub
		return articleRepository.saveAll(articles);
	}

}
