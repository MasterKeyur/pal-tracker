package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.*;
import java.util.*;



@RestController
public class EnvController {


    private String port ;


    private String memmory ;


    private String index ;


    private String address ;



    public EnvController ( @Value("${PORT:NOT SET}") String port,
                           @Value("${MEMORY_LIMIT:NOT SET}") String memmory,
                           @Value("${CF_INSTANCE_INDEX:NOT SET}") String index,
                           @Value("${CF_INSTANCE_ADDR:NOT SET}") String address) {

        this.port = port;
        this.memmory = memmory;
        this.index = index;
        this. address = address;
    }


    @GetMapping("/env")
    public Map<String, String> getEnv(){

        Map<String, String> map = new HashMap<String,String>();
        map.put("PORT", port);
        map.put("MEMORY_LIMIT", memmory);
        map.put("CF_INSTANCE_INDEX", index);
        map.put("CF_INSTANCE_ADDR", address);
        return map;

    }


}