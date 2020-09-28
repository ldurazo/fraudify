package fraudify.providers;

import fraudify.ScreeningResult;
import fraudify.models.PaymentInfo;

public interface FraudService {
    ScreeningResult validatePayment(PaymentInfo order);
}
