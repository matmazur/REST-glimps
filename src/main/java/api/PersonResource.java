package api;


import model.Person;
import model.PersonDb;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RequestScoped
@Path("/persons")
public class PersonResource {

    @GET
    public String getPersons(){

        StringBuilder sb = new StringBuilder();

        sb.append("<html>");
        for (Person p:PersonDb.getPersons().values()){

            sb.append("<p>");
            sb.append(p.getId());
            sb.append(" ");
            sb.append(p.getName());
            sb.append(" ");
            sb.append(p.getSurname());
            sb.append(" ");
            sb.append("</p>");


        }
        sb.append("</html>");


        return sb.toString();
    }

}
