package udd.elasticsearch.udd.service;

import java.util.List;

import org.elasticsearch.index.query.GeoDistanceQueryBuilder;

import udd.elasticsearch.udd.model.Reviewer;

public interface ReviewerService {

	Iterable<Reviewer> findAll();
	Iterable<Reviewer> search(GeoDistanceQueryBuilder query);
	List<Reviewer> findByFirstName(String name);
	List<Reviewer> saveAll(List<Reviewer> reviewers);
}
