package ge.btu.nino.potskhishvili;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;



@Path("/currency")
public class CurrencyController {

    @GET
    @Path("/hi")
    public String sayHallo(){
        return "Hello !";
    }



    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CurrencyMain> getCurrency() {
        List<CurrencyMain> studentList = new ArrayList<>();
        studentList.add(new CurrencyMain("USD", 3.1600, 3.1900));
        studentList.add(new CurrencyMain("EUR", 3.4200, 3.4700));
        studentList.add(new CurrencyMain("GBP", 3.8500, 3.9500));
        studentList.add(new CurrencyMain("RUB", 4.1000, 4.3000));
        studentList.add(new CurrencyMain("TRY", 0.4000, 0.4700));
        studentList.add(new CurrencyMain("AZN	", 1.6000, 1.8400));
        return studentList;
    }

    @POST
    @Path("sell")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void calculate(CurrencyMain currency) {

        //double ans = currency.getBuy()*currency.
        //System.out.println(currency.toString());
        if (currency.getCurrencyType().equals(getCurrency().get(0))) {
            //double ans = Double.valueOf (currency.getSell() * (getCurrency().get(2)));
        }
    }

}
