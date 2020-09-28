package fraudify.models;

public class PaymentInfo {
    /**
     * The IP Address this payment is coming from (IP or IPv4)
     */
    private String ip;

    /**
     * The order id for this purchase
     */
    private String orderId;

    /**
     * Cardholder first name
     */
    private String firstName;

    /**
     * Cardholder last name
     */
    private String lastName;

    /**
     * Purchaser email
     */
    private String email;

    /**
     * Puchaser phone
     */
    private String phone;

    /**
     * Billing Address
     */
    private String billAddr;

    /**
     * Billing City
     */
    private String billCity;

    /**
     * Billing State
     */
    private String billState;

    /**
     * Billing Zipcode
     */
    private String billZipCode;

    /**
     * Billing Country
     */
    private String billCountry;

    /**
     * Billing amount
     */
    private String amount;

    /**
     * Billing currency
     */
    private String currency;

    /**
     * Credit card number
     * intentionally a number array instead of something that can be found in the string pool
     */
    private int[] number;

    /**
     * Credit card CVV
     * intentionally a number array instead of something that can be found in the string pool
     */
    private int[] cvv;

    /**
     * Shipping Address
     */
    private String shipAddr;

    /**
     * Shipping City
     */
    private String shipCity;

    /**
     * Shipping State
     */
    private String shipState;

    /**
     * Shipping ZipCode
     */
    private String shipZipCode;

    /**
     * Shipping Country
     */
    private String shipCountry;

    public PaymentInfo(String ip, String orderId, String firstName, String lastName, String email, String phone,
                       String billAddr, String billCity, String billState, String billZipCode, String billCountry,
                       String amount, String currency, int[] number, int[] cvv, String shipAddr, String shipCity,
                       String shipState, String shipZipCode, String shipCountry) {
        this.ip = ip;
        this.orderId = orderId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.billAddr = billAddr;
        this.billCity = billCity;
        this.billState = billState;
        this.billZipCode = billZipCode;
        this.billCountry = billCountry;
        this.amount = amount;
        this.currency = currency;
        this.number = number;
        this.cvv = cvv;
        this.shipAddr = shipAddr;
        this.shipCity = shipCity;
        this.shipState = shipState;
        this.shipZipCode = shipZipCode;
        this.shipCountry = shipCountry;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBillAddr() {
        return billAddr;
    }

    public void setBillAddr(String billAddr) {
        this.billAddr = billAddr;
    }

    public String getBillCity() {
        return billCity;
    }

    public void setBillCity(String billCity) {
        this.billCity = billCity;
    }

    public String getBillState() {
        return billState;
    }

    public void setBillState(String billState) {
        this.billState = billState;
    }

    public String getBillZipCode() {
        return billZipCode;
    }

    public void setBillZipCode(String billZipCode) {
        this.billZipCode = billZipCode;
    }

    public String getBillCountry() {
        return billCountry;
    }

    public void setBillCountry(String billCountry) {
        this.billCountry = billCountry;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int[] getNumber() {
        return number;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }

    public int[] getCvv() {
        return cvv;
    }

    public void setCvv(int[] cvv) {
        this.cvv = cvv;
    }

    public String getShipAddr() {
        return shipAddr;
    }

    public void setShipAddr(String shipAddr) {
        this.shipAddr = shipAddr;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipState() {
        return shipState;
    }

    public void setShipState(String shipState) {
        this.shipState = shipState;
    }

    public String getShipZipCode() {
        return shipZipCode;
    }

    public void setShipZipCode(String shipZipCode) {
        this.shipZipCode = shipZipCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public static class PaymentInfoBuilder {
        private String ip;
        private String orderId;
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private String billAddr;
        private String billCity;
        private String billState;
        private String billZipCode;
        private String billCountry;
        private String amount;
        private String currency;
        private int[] number;
        private int[] cvv;
        private String shipAddr;
        private String shipCity;
        private String shipState;
        private String shipZipCode;
        private String shipCountry;

        public PaymentInfoBuilder(String ip) {
            this.ip = ip;
        }

        public PaymentInfo build() {
            return new PaymentInfo(
                    this.ip,
                    this.orderId,
                    this.firstName,
                    this.lastName,
                    this.email,
                    this.phone,
                    this.billAddr,
                    this.billCity,
                    this.billState,
                    this.billZipCode,
                    this.billCountry,
                    this.amount,
                    this.currency,
                    this.number,
                    this.cvv,
                    this.shipAddr,
                    this.shipCity,
                    this.shipState,
                    this.shipZipCode,
                    this.shipCountry
            );
        }

        public PaymentInfoBuilder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public PaymentInfoBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PaymentInfoBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PaymentInfoBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PaymentInfoBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public PaymentInfoBuilder setBillAddr(String billAddr) {
            this.billAddr = billAddr;
            return this;
        }

        public PaymentInfoBuilder setBillCity(String billCity) {
            this.billCity = billCity;
            return this;
        }

        public PaymentInfoBuilder setBillState(String billState) {
            this.billState = billState;
            return this;
        }

        public PaymentInfoBuilder setBillZipCode(String billZipCode) {
            this.billZipCode = billZipCode;
            return this;
        }

        public PaymentInfoBuilder setBillCountry(String billCountry) {
            this.billCountry = billCountry;
            return this;
        }

        public PaymentInfoBuilder setAmount(String amount) {
            this.amount = amount;
            return this;
        }

        public PaymentInfoBuilder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public PaymentInfoBuilder setNumber(int[] number) {
            this.number = number;
            return this;
        }

        public PaymentInfoBuilder setCvv(int[] cvv) {
            this.cvv = cvv;
            return this;
        }

        public PaymentInfoBuilder setShipAddr(String shipAddr) {
            this.shipAddr = shipAddr;
            return this;
        }

        public PaymentInfoBuilder setShipCity(String shipCity) {
            this.shipCity = shipCity;
            return this;
        }

        public PaymentInfoBuilder setShipState(String shipState) {
            this.shipState = shipState;
            return this;
        }

        public PaymentInfoBuilder setShipZipCode(String shipZipCode) {
            this.shipZipCode = shipZipCode;
            return this;
        }

        public PaymentInfoBuilder setShipCountry(String shipCountry) {
            this.shipCountry = shipCountry;
            return this;
        }
    }
}
