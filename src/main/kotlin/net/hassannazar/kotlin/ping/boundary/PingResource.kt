package net.hassannazar.kotlin.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.inject.Inject;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import net.hassannazar.kotlin.ping.model.Greeting;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 *
 * @author hassannazar.net
 */
@Timed
@Path("ping")
class PingResource {

    @Inject
    @ConfigProperty(name = "message")
    private lateinit var message : String

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun ping() : Greeting = Greeting(message)

}
