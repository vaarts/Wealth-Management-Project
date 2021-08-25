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

	//List<Funds> findByFundName(String fundName);

	@Query(nativeQuery = true, value = "SELECT * FROM funds where fund_name like concat('%',concat(?,'%'));;")
	List<Funds> findByFundName(String fundName);

	//List<Funds> findByFundId(Integer fundId);
	
	@Query(nativeQuery = true, value = "SELECT fund_name, fund_amc, fund_risk, fund_aum, fund_type, fund_nav, fund_mgr, fund_desc, img_src,fh1month, fh1year, fh_total, f.fund_id FROM funds f join fund_history h on f.fund_id = h.fund_id where f.fund_id=?;")
	Object[][] findByFundId(Integer fundId);
	
	@Query(nativeQuery = true, value = "SELECT f.fund_id, fund_name, fund_amc, fund_risk, fund_aum, fund_type, fund_nav, fund_mgr, fund_desc, img_src FROM funds f join fund_history h on f.fund_id = h.fund_id where h.fh_total<?;")
	List<Funds> findByFhTotal(Integer fhTotal);
	
	@Query(nativeQuery = true, value = "SELECT * FROM funds where fund_aum<?;")
	List<Funds> findByFundAum(Integer fundAum);
	
	@Query(nativeQuery = true, value = "SELECT distinct fund_risk FROM funds;")
	Object[] findDistinctFundRisk();
	
	
	@Query(nativeQuery = true, value = "SELECT * FROM funds ORDER BY fund_name")
	List<Funds> sortByFundName();	
	
	@Query(nativeQuery = true, value = "SELECT * FROM funds ORDER BY fund_aum")
	List<Funds> sortByFundAum();	
	
	
	@Query(nativeQuery = true, value = "SELECT fund_name, fund_amc, fund_risk, fund_aum, fund_type, fund_nav, fund_mgr, fund_desc, img_src,fh1month, fh1year, fh_total FROM funds f join fund_history h on f.fund_id = h.fund_id;")
	Object[][] joinFundsAndFundHistory();
	
//	@Query(nativeQuery = true, value = "SELECT fund_name, fund_amc, fund_risk, fund_aum, fund_type, fund_nav, fund_mgr, fund_desc, img_src,fh1month, fh1year, fh_total FROM funds f join fund_history h on f.fund_id = h.fund_id where fund_amc=?;")
//	Object[][] findByFundAmc(String fundAmc);

}
