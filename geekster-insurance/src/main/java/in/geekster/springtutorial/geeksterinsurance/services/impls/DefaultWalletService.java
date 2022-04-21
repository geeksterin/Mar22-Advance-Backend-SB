package in.geekster.springtutorial.geeksterinsurance.services.impls;

import in.geekster.springtutorial.geeksterinsurance.models.Wallet;
import in.geekster.springtutorial.geeksterinsurance.services.WalletService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
@Slf4j
public class DefaultWalletService implements WalletService {
    @Override
    public Optional<Wallet> createWallet(final Long customerId) {
        final Wallet wallet = new Wallet();
        wallet.setCustomerId(customerId);
        wallet.setWalletId(555L);
        wallet.setBalance(BigDecimal.ZERO);
        return Optional.of(wallet);
    }

    @Override
    public Wallet addToWallet(final Long walletId, final BigDecimal amount) {
        final Wallet wallet = new Wallet();
        wallet.setCustomerId(123L);
        wallet.setWalletId(555L);
        wallet.setBalance(BigDecimal.ZERO);
        return null;
    }
}
