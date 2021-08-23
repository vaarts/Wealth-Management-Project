package com.funds;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserFundRepository extends CrudRepository<UserFund, Integer> {
	
	@Query(nativeQuery = true, value = "SELECT fund_name, fund_amc, uf_type, uf_amount, uf_date FROM funds f join user_fund u on f.fund_id = u.fund_id WHERE user_id=?;")
	Object[][] findFundByUserId(Integer userId);
}
