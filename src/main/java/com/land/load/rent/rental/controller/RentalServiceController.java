package com.land.load.rent.rental.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.land.load.rent.rental.model.Location;
import com.land.load.rent.rental.model.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/rental")
public class RentalServiceController {


   /* @Autowired
    private UserService userService; */


    @GetMapping
    public String getRental() {
        return "Hello Rental Service";
    }

    @GetMapping("/location-details")
    public Location getStatus(@RequestParam String location) {
        Location loc = new Location();
        loc.setLocation(location);
        loc.setAddress("271 Mint street, Park Town");
        loc.setCity("Chennai");
        loc.setState("TamilNadu");
        loc.setZip("600001");
        loc.setCountry("India");
        return loc;
    }
    

   /* @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    

  /*@PostMapping("/register")
    public User register(@RequestBody User user) {
        return userRepository.save(user);
    }*/



  /*   @PostMapping("/login")
    public User login(@RequestBody User user) {
        return authService.login(user.getEmail(), user.getPassword());
    }*/
}
