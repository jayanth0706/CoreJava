package p1;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class UserData implements Serializable {
    // Fields to store user data
    public String uName, mId, city;
    public Date d;

    // Constructor to initialize the user data
    public UserData(String uName, String mId, String city, Date d) {
        this.uName = uName;
        this.mId = mId;
        this.city = city;
        this.d = d;
    }

    // Override toString() method to provide meaningful output
    @Override
    public String toString() {
        return "UserName: " + uName +
               "\nMailId: " + mId +
               "\nCity: " + city +
               "\nDateTime: " + d;
    }
}
