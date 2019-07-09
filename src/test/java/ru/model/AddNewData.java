package ru.model;

public class AddNewData {
    private final String firstname;
    private final String lastname;
    private final String nickname;
    //private final String photo;

    public AddNewData(String firstname, String lastname, String nickname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = nickname;
       // this.photo = photo;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

//    public String getPhoto() {
//        return photo;
//    }



}
