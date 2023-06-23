package com.example.tut05.dto;

public class UserDto {

    //  필드생성
    private String title;
    private String heading;


    //    g,s생성
    public String getHeading() {
        return heading;
    }
    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
