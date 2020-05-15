package com.example.uncledrew.wechatui.pojo;

public class Message {
    private String name;
    private String time;
    private String lastMessage;
    private int img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", lastMessage='" + lastMessage + '\'' +
                ", img=" + img +
                '}';
    }
}
