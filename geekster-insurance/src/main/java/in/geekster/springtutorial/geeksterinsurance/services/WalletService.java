package in.geekster.springtutorial.geeksterinsurance.services;

import in.geekster.springtutorial.geeksterinsurance.models.Wallet;

import java.math.BigDecimal;
import java.util.Optional;

public interface WalletService {

    Optional<Wallet> createWallet(final Long customerId);

    Wallet addToWallet(final Long walletId, final BigDecimal amount);
}
