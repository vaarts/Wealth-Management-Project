package com.funds;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FundsRepository extends CrudRepository<Funds, Integer> {
	//distinct fund name from the table, fire this query as a native query
	
	@Query(nativeQuery = true, value = "SELECT distinct fund_amc FROM funds;")
	Object[] findDistinctFundAmc();
	
//	@Query(nativeQuery = true, value = "SELECT * FROM funds where fund_amc= ?;")
	
	List<Funds> findByFundAmc(String fundAmc);	
	
	List<Funds> findByFundRisk(String fundRisk);
	
	@Query(nativeQuery = true, value = "SELECT distinct fund_risk FROM funds;")
	Object[] findDistinctFundRisk();
	
	@Query(nativeQuery = true, value = "SELECT fund_name,fh1month,fh1year,fh_total FROM funds f join fund_history h on f.fund_id = h.fund_id;")
	Object[][] joinFundsAndFundHistory();

}
