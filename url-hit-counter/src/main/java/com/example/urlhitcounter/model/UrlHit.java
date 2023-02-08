package com.example.urlhitcounter.model;

public class UrlHit {
    private String username;
    private int hitCount;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public UrlHit(String username, int hitCount) {
        this.username = username;
        this.hitCount = hitCount;
    }

    @Override
    public String toString() {
        return "UrlHit{" +
                "username='" + username + '\'' +
                ", hitCount=" + hitCount +
                '}';
    }
}
