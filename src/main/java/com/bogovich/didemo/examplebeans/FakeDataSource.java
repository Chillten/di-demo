package com.bogovich.didemo.examplebeans;

public class FakeDataSource {
    private String user;
    private String password;
    private String url;

    public FakeDataSource(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    @Override
    public String toString() {
        return "FakeDataSource{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
