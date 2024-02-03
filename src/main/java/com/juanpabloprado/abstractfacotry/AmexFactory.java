package com.juanpabloprado.abstractfacotry;

public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {

        return switch (cardType) {
            case GOLD -> new AmexGoldCreditCard();
            case PLATINUM -> new AmexPlatinumCreditCard();
            default -> throw new IllegalStateException("Invalid cardType: " + cardType);
        };
    }

    @Override
    public Validator getValidator(CardType cardType) {

        return switch (cardType) {
            case GOLD -> new AmexGoldValidator();
            case PLATINUM -> new AmexPlatinumValidator();
            default -> throw new IllegalStateException("Invalid cardType: " + cardType);
        };
    }
}
