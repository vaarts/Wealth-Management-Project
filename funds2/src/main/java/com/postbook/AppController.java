package com.postbook;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AppController {
	
	@Autowired
	FundsRepository fundsRepository;

	// Get All Funds
	@GetMapping("/funds/all")
	public List<Funds> getFunds() {
		return (List<Funds>) fundsRepository.findAll();
	}

	// Add a Fund

	@PostMapping("/funds/add")
	public Funds addFund(@RequestBody Funds fund) {
		return fundsRepository.save(fund);
	}

	// Update a Fund	

	@PutMapping("/funds/update")
	public Funds updateFund(@RequestBody Funds fund) {
		Optional<Funds> option = fundsRepository.findById(fund.getFundId());
		return (option.isPresent()) ? fundsRepository.save(fund) : null;
	}
	
	// Delete a Fund
	@DeleteMapping("/funds/delete/{id}")
	public boolean deleteFund(@PathVariable int id) {
		try {
			fundsRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
















