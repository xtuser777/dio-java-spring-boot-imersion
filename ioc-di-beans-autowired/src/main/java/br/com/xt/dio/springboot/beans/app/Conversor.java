package br.com.xt.dio.springboot.beans.app;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Conversor {

    @Autowired
    private Gson gson;

    public String toJson(Response response) {
        return gson.toJson(response, Response.class);
    }
}
