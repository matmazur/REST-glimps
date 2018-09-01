package api;


import model.Person;
import model.PersonDb;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Path("/persons")
public class PersonResource {

    @GET
    @Produces({MediaType.APPLICATION_JSON,})
    public List<Person> getPersons() {
        return new ArrayList<>(PersonDb.getPersons().values());

    }
}