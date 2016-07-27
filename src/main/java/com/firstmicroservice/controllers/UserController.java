package com.firstmicroservice.controllers;

import com.firstmicroservice.models.User;
import com.firstmicroservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by RaMzEsS on 25.07.2016.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired(required = true)
    private UserRepository userRepository;

    public UserController()
    {
        System.out.println("Ctor -> UserController");
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> userList() {

        List<User> users = userRepository.findAll();
        for (User user : users)
        {
            System.out.println(user + "::" + "userList()----");
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    /*@RequestMapping(value = "",  method = RequestMethod.GET)
    public String users(Model model) {

        List<User> users = userRepository.findAll();
        model.addAttribute("userlist", users);

        for (User user : users)
        {
            System.out.println(user + "::" + "users()----");
        }

        return "users";
    }*/

    @RequestMapping(value = "/add/{userName}/{firstName}/{lastName}/{password}", method = RequestMethod.GET)
    public ModelAndView add(@PathVariable String userName, @PathVariable String firstName,
                            @PathVariable String lastName, @PathVariable String password)
    {
        User newUser = new User();
        newUser.setUsername(userName);
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setUsername(password);
        System.out.println("Add new user " + newUser);
        userRepository.save(newUser);
        return new ModelAndView("redirect:users");
    }

    @RequestMapping(value = "/edit/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public void edit()
    {

    }

    @RequestMapping(value = "/user/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id)
    {
        userRepository.delete(id);
        return new ModelAndView("redirect:users");
    }
}
