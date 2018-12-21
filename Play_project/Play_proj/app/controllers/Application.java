package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;
import models.Signup;
import play.mvc.Results;
import play.mvc.Result;
import play.mvc.Http.Flash;
import views.html.*;

public class Application extends Controller {

    final static Form<Signup> signup = Form.form(Signup.class);

    public static Result index() {

        return ok(index.render(signup));
    }

    public static Result submit() {
        Form<Signup> filledform = signup.bindFromRequest();
        Signup created = filledform.get();
        return ok(Display.render(created));
    }

}
