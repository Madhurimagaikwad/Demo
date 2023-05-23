package com.velocity.controller;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Transaction;
import com.velocity.model.UserT;
//import com.velocity.service.TransactionService;
import com.velocity.service.UserTService;

@RestController
public class UserTransactionController {
	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(UserTransactionController.class);
	static int num = 1;
	@Autowired
	private UserTService userTService;

	/* Author-Madhurima Gaikwad */

	@DeleteMapping("/deleteuser/{id}")
	public void deleteUserTransaction(@PathVariable("id") int id) {
		try {
			Transaction tran = new Transaction();
			if (tran.getTrasaction() == num) {
				userTService.deleteById(id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("In RestController >>deleteUser");

	}

	/* Author-Anushka */

	@PostMapping("/saveUserTransactionDetails")
	public UserT saveUserTransactionDetails(@RequestBody UserT userT) {
		UserT userT2 = userTService.saveUserTransactionDetails(userT);
		return userT2;
	}

}
