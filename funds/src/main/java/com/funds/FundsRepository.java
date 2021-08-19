package com.funds;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FundsRepository extends CrudRepository<Funds, Integer> {
	//distinct fund name from the table, fire this query as a native query
	
	@Query(nativeQuery = true, value = "SELECT distinct fund_amc FROM funds;")
	Object[] findDistinctFundAmc();
	
	@Query(nativeQuery = true, value = "SELECT * FROM funds where fund_amc= ?;")
	List<Funds> findAllByFundAmc(String fundAmc);	

}
