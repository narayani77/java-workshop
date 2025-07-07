package temperaturedata.beans;

public class Location {
    private String name;
    private double lattitude;
    private double longitude;
    private String description;
    private String address;
    String country;
    String city;
    String postcode;
    private String postalcode;
 
    public void setName (String aName){
        name = aName;
}
    public String getname() {

    return name;

}
public void setLattitude  (double aLattitude){
        lattitude = aLattitude;
}
    public double getlattitude() {

    return lattitude;

}

    public Double getLattitude() {

    return lattitude;

}
 public void setLongitude (Double aLongitude){
        longitude = aLongitude;
}
    public Double getlongitude() {

    return longitude;
    }
     public void setdescription (String adescription){
        description = adescription;
}
    public String getdescription() {

    return description;
    }
     public void setAddress (String aAddress){
        address = aAddress;

     }
     public String getaddress() {
          return  address;

     }
     public void setCountury (String country){
        country = country;
}
    public String getCountury() {

    return country;
        
}
    public void setcity (String aCity){
        city = aCity;
}
    public String getcity() {

    return city;
}
   public void setpostcode (String aPostcode){
       postcode = aPostcode;
}
    public String getpostcode() {

    return postcode;
 }
    public void postalcode (String aPostalcode){
        postalcode = aPostalcode;
}
    public String getpostalcode() {

    return postalcode;
 }  
 public String toString(){
    return "Location(name: " + name +
    ",latitude: " +lattitude +
    ",longitude :" + longitude +
    ",description :" + description +
    ",address :" + address +
    ",country :" + country +
    ",city :"  + city +
    ",postalcode :" + postalcode + "}";
 }   
}
