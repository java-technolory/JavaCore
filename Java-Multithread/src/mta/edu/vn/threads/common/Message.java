package mta.edu.vn.threads.common;

public class Message {

    private String msg;

    public Message(String name) {
        this.msg = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
}
