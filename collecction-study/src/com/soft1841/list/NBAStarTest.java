package com.soft1841.list;

public class NBAStarTest {
    private String name;
    private String nickname;
    private String score;
    private String backboard;
    private String assists;

    public NBAStarTest(String name, String nickname, String score, String backboard, String assists) {
        this.name = name;
        this.nickname = nickname;
        this.score = score;
        this.backboard = backboard;
        this.assists = assists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getBackboard() {
        return backboard;
    }

    public void setBackboard(String backboard) {
        this.backboard = backboard;
    }

    public String getAssists() {
        return assists;
    }

    public void setAssists(String assists) {
        this.assists = assists;
    }
}
