package org.sadkowski.github.errors;

public class FollowersCountZeroException extends ArithmeticException{

    public FollowersCountZeroException() {
        super("Followers count is zero");
    }
}
