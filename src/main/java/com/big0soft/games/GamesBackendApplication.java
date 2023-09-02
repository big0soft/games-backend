package com.big0soft.games;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GamesBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamesBackendApplication.class, args);
    }



//npx lt --port 8000 -s http://localhost:8000/test
//npx lt --port 8000 -s https://games123.loca.lt/
//    http://games123:8000/
//    https://games123.loca.lt/
//    176.29.232.102
//    npx lt --port 8000 --subdomain games-big0soft

//    https://games-big0soft.loca.lt/test
//

//    Email address:  ahmadiyad830@gmail.com
//    Password:   *********
//
//            1  userc577d98308c06e2.app.vtxhub.com
//    Enter site number (default: userc577d98308c06e2.app.vtxhub.com)  1
//    Enter a host to forward to (default: 127.0.0.1)  176.29.232.102
//    Enter a port to forward to (default: 8080)  9191
//            1  http
//2  https
//    Select forwarding host provider (default: http)  https
//    error:   Must 1 for HTTP or 2 for HTTPS
//    Select forwarding host provider (default: http)  2
//    Connection          Active
//    Account             ahmadiyad830@gmail.com
//    Forwarding          http://userc577d98308c06e2.app.vtxhub.com -> https://176.29.232.102:9191
//    Forwarding          https://userc577d98308c06e2.app.vtxhub.com -> https://176.29.232.102:9191

}
