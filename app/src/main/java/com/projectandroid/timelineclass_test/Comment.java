package com.projectandroid.timelineclass_test;

public class Comment {
    String name;
    String videoTime;
    String content;

    public Comment(String name, String videoTime, String content) {
        this.name = name;
        this.videoTime = videoTime;
        this.content = content;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
