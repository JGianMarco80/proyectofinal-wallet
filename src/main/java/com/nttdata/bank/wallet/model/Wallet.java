package com.nttdata.bank.wallet.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "wallets")
public class Wallet {
	
	@Id
	private String _id;
	
	private String name;
	
	private String surnames;
	
	private int mobile;
	
	private String email;
	
	private int document;
	
	private Double amount;
	
	/* tipo de personas */
	// 1 -> Yanki
	// 2 -> BootCoin
	private Byte type;

}