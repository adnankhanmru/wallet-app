package com.example.wallet.walletapp.controller;

import com.example.wallet.walletapp.model.Wallet;
import com.example.wallet.walletapp.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wallets")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @GetMapping
    public List<Wallet> getAllWallets() {return walletService.getAllWallets();}

    @GetMapping("/{id}")
    public Wallet getWalletById(@PathVariable Long id) {
        return walletService.getWalletById(id);
    }

    @PostMapping
    public Wallet createWallet(@RequestBody Wallet wallet) {
        return walletService.createWallet(wallet);
    }

    @PutMapping("/{id}")
    public Wallet updateWallet(@PathVariable Long id, @RequestBody Wallet wallet) {
        return walletService.updateWallet(id, wallet);
    }

    @DeleteMapping("/{id}")
    public void deleteWallet(@PathVariable Long id) {
        walletService.deleteWallet(id);
    }
}

