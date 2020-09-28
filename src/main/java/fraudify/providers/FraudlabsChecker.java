package fraudify.providers;

import fraudify.ScreeningResult;
import fraudify.lib.Order;
import fraudify.models.PaymentInfo;

import java.util.Arrays;
import java.util.Hashtable;

/**
 * Fraud implementation from Fraudlabspro, just to show an example of external api's being used here.
 * Unfortunately fraudlabspro does not publish their sdk in gradle/maven, so had to insert it just to show
 * the usage of the interface.
 * */
public class FraudlabsChecker implements FraudService{
    Order fraudlabsApi;

    public FraudlabsChecker(Order fraudlabsApi) {
        this.fraudlabsApi = fraudlabsApi;
    }

    public FraudlabsChecker() {
        this.fraudlabsApi = new Order();
    }

    @Override
    public ScreeningResult validatePayment(PaymentInfo order) {
        // Fraudlabspro had named this class poorly.
        // Sets order details
        Hashtable<String, String> data = new Hashtable<>();

        data.put("ip", order.getIp());  // IP parameter is mandatory
        data.put("first_name", order.getFirstName());
        data.put("last_name", order.getLastName());
        data.put("email", order.getEmail());
        data.put("user_phone", order.getPhone());

        // Billing information
        data.put("bill_addr", order.getBillAddr());
        data.put("bill_city", order.getBillCity());
        data.put("bill_state", order.getBillState());
        data.put("bill_country", order.getBillCountry());
        data.put("bill_zip_code", order.getBillCity());

        // Order information
        data.put("user_order_id", order.getOrderId());
        data.put("user_order_memo", "Online shop");
        data.put("amount", order.getAmount());
        data.put("quantity", "1");
        data.put("currency", order.getCurrency());
        data.put("number", Arrays.toString(order.getNumber()));
        data.put("payment_mode", fraudlabsApi.CREDIT_CARD);

        // Shipping information
        data.put("ship_addr", order.getShipAddr());
        data.put("ship_city", order.getShipCity());
        data.put("ship_state", order.getShipState());
        data.put("ship_zip_code", order.getShipZipCode());
        data.put("ship_country", order.getShipCountry());

        // TODO fraudlabs API returns the feedback in JSON format.
        String result = fraudlabsApi.feedback(data);
        return switch (result) {
            case "APPROVE" -> ScreeningResult.LOW_FRAUD_RISK;
            case "REJECT" -> ScreeningResult.HIGH_FRAUD_RISK;
            default -> ScreeningResult.INVALID;
        };
    }
}
