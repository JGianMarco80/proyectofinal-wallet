package com.nttdata.bank.wallet.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.bank.wallet.model.Wallet;

@Repository
public interface WalletRepository extends ReactiveMongoRepository<Wallet, String>{

}
