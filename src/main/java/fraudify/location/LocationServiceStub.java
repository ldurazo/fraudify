package fraudify.location;

public class LocationServiceStub implements LocationService{
    @Override
    public String getCountryFromIp(String ip) {
        return "US";
    }
}
