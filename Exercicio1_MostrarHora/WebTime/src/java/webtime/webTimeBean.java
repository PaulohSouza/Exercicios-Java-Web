package webtime;

import java.text.DateFormat;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "webTimeBean")
@RequestScoped
public class webTimeBean {
    
    public webTimeBean(){
}

public String getTime(){

    return DateFormat.getTimeInstance(DateFormat.LONG).format((new Date()));
}

}