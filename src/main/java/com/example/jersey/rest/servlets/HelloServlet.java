package com.example.jersey.rest.servlets;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("hello")
@Tag(name = "Example")
@Produces(MediaType.APPLICATION_JSON)
public class HelloServlet {

    @GET
    @ApiResponse(
        responseCode = "200",
        content = @Content(
            mediaType = "application/json",
            array = @ArraySchema(
                schema = @Schema(implementation = String.class)
            )
        ),
        description = "List of \"Hello, world!\"-messages."
    )
    public List<String> getHello() {
        List<String> resultList = new ArrayList<>();
        resultList.add("Hello, Jersey!");
        resultList.add("Hello, Swagger!");
        resultList.add("Hello, Swagger UI!");

        return resultList;
    }
}