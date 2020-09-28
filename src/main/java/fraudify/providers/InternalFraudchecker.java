package fraudify.providers;

import fraudify.ScreeningResult;
import fraudify.location.LocationService;
import fraudify.location.LocationServiceStub;
import fraudify.models.PaymentInfo;

/**
 * A naive implementation of a fraud checker, for testing purposes.
 */
public class InternalFraudchecker implements FraudService {
    LocationService locationService = new LocationServiceStub();

    @Override
    public ScreeningResult validatePayment(PaymentInfo order) {
        if (!order.getShipCountry().equals(order.getBillCountry()) &&
                !locationService.getCountryFromIp(order.getIp()).equals(order.getBillCountry())) {
            return ScreeningResult.HIGH_FRAUD_RISK;
        }
        return ScreeningResult.LOW_FRAUD_RISK;
    }
}
