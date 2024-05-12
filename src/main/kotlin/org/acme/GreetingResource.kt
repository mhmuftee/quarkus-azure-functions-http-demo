package org.acme

import jakarta.validation.constraints.NotNull
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.QueryParam
import jakarta.ws.rs.core.MediaType

@Path("/hello")
class GreetingResource(
    private val greetingService: GreetingService
) {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(
        @NotNull @QueryParam(value = "name") name: String
    ): ResponseDto {
        val message = greetingService.greeting(name)
        return ResponseDto(message)
    }
}
