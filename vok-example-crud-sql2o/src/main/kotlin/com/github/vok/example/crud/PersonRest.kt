package com.github.vok.example.crud

import com.github.vok.example.crud.personeditor.Person
import com.github.vok.framework.sql2o.findAll
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

/**
 * Provides access to person list. To test, just run `curl http://localhost:8080/rest/person`
 */
@Path("/person")
class PersonRest {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     * @return String that will be returned as a text/plain response.
     */
    @GET()
    @Path("/helloworld")
    @Produces(MediaType.TEXT_PLAIN)
    fun helloWorld() = "Hello World"

    /**
     * Uses Jackson to encode result objects as JSON.
     * @return a list of JPAs, automatically encoded to JSON.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun findAll(): List<Person> = Person.findAll()
}
