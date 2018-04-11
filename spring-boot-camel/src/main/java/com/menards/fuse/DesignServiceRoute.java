package com.menards.fuse;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class DesignServiceRoute extends RouteBuilder {

    @Override
    public void configure() {
       // restConfiguration().component("servlet").bindingMode(RestBindingMode.json);

        //rest("/designservice").get();
        //from("direct:talk")
   //             .process(exchange -> {
     //           });
    }
}
