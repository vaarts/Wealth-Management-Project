package com.funds;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserFundRepository extends CrudRepository<UserFund, Integer> {
	
	@Query(nativeQuery = true, value = "SELECT fund_name, fund_amc, uf_type, uf_amount, uf_date FROM funds f join user_fund u on f.fund_id = u.fund_id WHERE user_id=?;")
	Object[][] findFundByUserId(Integer userId);
	
	@Query(nativeQuery = true, value = "SELECT SUM(uf_amount) from user_fund where user_id=?;")
    Integer findtotal(Integer num);
	
	
	@Query(nativeQuery = true, value = "DELETE FROM `user_fund` WHERE user_id = ? AND fund_id = ?;")
	boolean deleteByUserId(Integer userId, Integer fund_id);
	
}
