package org.sadkowski.github.service;

import org.sadkowski.github.errors.FollowersCountZeroException;
import org.springframework.stereotype.Service;

@Service
public class UserCalculation {

    public double doCalculate(long followersCount, long publicReposCount ) {
        try {
            return 6.0 / followersCount * (2 + publicReposCount);
        } catch (ArithmeticException e) {
            throw new FollowersCountZeroException();
        }
    }
}
