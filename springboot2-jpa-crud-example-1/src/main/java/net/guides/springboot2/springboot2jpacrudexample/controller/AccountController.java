package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.exception.ResourceNotFoundException;
import net.guides.springboot2.springboot2jpacrudexample.model.Account;
import net.guides.springboot2.springboot2jpacrudexample.repository.AccountRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")

public class AccountController { 
@Autowired
private AccountRepository accountRepository;

@GetMapping("/accounts")
public List<Account> getAllAccounts() { return accountRepository.findAll();
}
 

@GetMapping("/accounts/{id}")
public ResponseEntity<Account> getAccountById(@PathVariable(value = "id") Long accountId)throws ResourceNotFoundException{
	Account account = accountRepository.findById(accountId).orElseThrow(() -> new ResourceNotFoundException("Account not found for this id :: "+ accountId));
	return ResponseEntity.ok().body(account);
}

@PostMapping("/accounts")
public Account createAccount(@Valid @RequestBody Account account) { 
	return accountRepository.save(account);
}

@PutMapping("/accounts/{id}")
public ResponseEntity<Account> updateAccount(@PathVariable(value = "id") Long accountId,@Valid @RequestBody Account accountDetails) throws ResourceNotFoundException { 
	Account account = accountRepository.findById(accountId).orElseThrow(() -> new ResourceNotFoundException("Account not found for this id :: " + accountId));
	account.setCin(accountDetails.getCin()); account.setAccountNumber(accountDetails.getAccountNumber()); account.setAgency(accountDetails.getAgency()); account.setAmount(accountDetails.getAmount()); account.setLastName(accountDetails.getLastName()); account.setFirstName(accountDetails.getFirstName());
	final Account updatedAccount = accountRepository.save(account); return ResponseEntity.ok(updatedAccount);
}


@DeleteMapping("/accounts/{id}")
public Map<String, Boolean> deleteAccount(@PathVariable(value = "id") Long accountId) throws ResourceNotFoundException {
	Account accounts = accountRepository.findById(accountId).orElseThrow(() -> new ResourceNotFoundException("Account not found for this id :: " + accountId));
	accountRepository.delete(accounts);
	Map<String, Boolean> response = new HashMap<>(); response.put("deleted", Boolean.TRUE);
	return response;
}
}

