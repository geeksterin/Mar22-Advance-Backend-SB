package in.geekster.springtutorial.geeksterinsurance.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Wallet {
    private Long walletId;
    private Long customerId;
    private BigDecimal balance;
}
