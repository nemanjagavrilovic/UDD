package udd.elasticsearch.udd.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import udd.elasticsearch.udd.model.Customer;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String>{

	List<Customer> findByFirstname(String firstName);

}