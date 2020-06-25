package com.imooc.exception;

/**
 * Created by Jingchao Zhang
 * Date: 2020-06-24
 * Time: 10:31 PM
 */
public class UserNotExistException extends RuntimeException {

    private String id;

    public UserNotExistException(String id) {
        super("user not exist");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
