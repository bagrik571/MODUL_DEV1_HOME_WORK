package org.example;


import com.google.gson.Gson;

public class App {

    public static void main(String[] args) {
        User user = new User("Vitalii","Bahrynovskyi");
        String json = new Gson().toJson(user);
        System.out.println(json);
    }
}
