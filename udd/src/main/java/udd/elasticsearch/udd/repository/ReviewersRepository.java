package udd.elasticsearch.udd.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import udd.elasticsearch.udd.model.Customer;
import udd.elasticsearch.udd.model.Reviewer;

public interface ReviewersRepository extends ElasticsearchRepository<Reviewer,String> {

	List<Reviewer> findByFirstname(String firstName);

}
