package org.corpotic.core.controllers;

import org.corpotic.core.models.User;
import org.corpotic.core.services.UserService;
import org.corpotic.core.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Niño Ronald
 */
@Controller    // This means that this class is a Controller
@RequestMapping(path = "/api/users")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * add
     *
     * @param user
     * @return
     */
    @PostMapping
    @CrossOrigin
    public ResponseEntity<Void> add(@RequestBody User user) {
        userService.save(user);
        return new ResponseEntity(new Message("Add sucefull"), HttpStatus.CREATED);
    }

    /**
     * all
     *
     * @return
     */
    @GetMapping
    @CrossOrigin
    public @ResponseBody
    Iterable<User> all() {
        return userService.all();
    }

}
