package models;

import play.data.validation.Constraints;

public class Signup {

    @Constraints.Required
    public String User;
    // @Constraints.Required()
   // public String mobile_no;
    // @Constraints.Required()
   // public String dob;
    // @Constraints.Required()
    //public String Email;
    @Constraints.Required()
    public String pass;

}