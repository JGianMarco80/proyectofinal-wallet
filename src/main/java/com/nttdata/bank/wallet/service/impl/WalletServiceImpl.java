package com.nttdata.bank.wallet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bank.wallet.model.Wallet;
import com.nttdata.bank.wallet.repository.WalletRepository;
import com.nttdata.bank.wallet.service.WalletService;

import reactor.core.publisher.Mono;

@Service
public class WalletServiceImpl implements WalletService{
	
	@Autowired
	private WalletRepository walletRepository;

	@Override
	public Mono<Wallet> save(Wallet wallet) {
		return walletRepository.save(wallet);
	}

}
