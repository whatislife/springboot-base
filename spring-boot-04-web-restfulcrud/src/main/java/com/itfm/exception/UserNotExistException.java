package com.itfm.exception;

/**
 * 定义用户异常，类
 */
public class UserNotExistException extends RuntimeException {
    //alt + insert 构造器加载出来
    public UserNotExistException() {
        super("用户不存在");
    }
}
