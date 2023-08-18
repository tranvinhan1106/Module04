package codegym.vn.entity;

public class Medical {
    private String  id ;
    private String name ;
    private String birth ;
    private String gender ;
    private String nationality ;
    private String passport ;
    private String travelInformation ;
    private String vehicleNumber ;
    private String seats ;
    private String departureDay ;
    private String endDay ;
    private String city ;
    private String moreInfo ;
    private String address ;
    private String numberPhone ;
    private String email ;
    private String symptom ;
    private String exposureHistory;

    public Medical() {
    }

    public Medical(String id, String name, String birth, String gender, String nationality, String passport, String travelInformation, String vehicleNumber, String seats, String departureDay, String endDay, String city, String moreInfo, String address, String numberPhone, String email, String symptom, String exposureHistory) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.nationality = nationality;
        this.passport = passport;
        this.travelInformation = travelInformation;
        this.vehicleNumber = vehicleNumber;
        this.seats = seats;
        this.departureDay = departureDay;
        this.endDay = endDay;
        this.city = city;
        this.moreInfo = moreInfo;
        this.address = address;
        this.numberPhone = numberPhone;
        this.email = email;
        this.symptom = symptom;
        this.exposureHistory = exposureHistory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(String travelInformation) {
        this.travelInformation = travelInformation;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(String departureDay) {
        this.departureDay = departureDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getExposureHistory() {
        return exposureHistory;
    }

    public void setExposureHistory(String exposureHistory) {
        this.exposureHistory = exposureHistory;
    }
}