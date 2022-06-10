package com.techaxis.CoreJava.Main.java.practiceQ.p5;

import java.util.Date;

public class Rating {
    int userId;
    int movieId;
    int rating;
    Date timestamp;

    @Override
    public String toString() {
        return "Rating{" +
                "userId=" + userId +
                ", movieId=" + movieId +
                ", rating=" + rating +
                ", timestamp=" + timestamp +
                '}';
    }
}
