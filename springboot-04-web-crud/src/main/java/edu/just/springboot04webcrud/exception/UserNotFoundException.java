package edu.just.springboot04webcrud.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
        super("用户不存在");
    }

}
