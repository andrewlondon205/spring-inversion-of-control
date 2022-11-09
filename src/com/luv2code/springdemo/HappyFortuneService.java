package com.luv2code.springdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HappyFortuneService implements FortuneService{

    public List<String> randomFortunes = Arrays.asList("Guru","Shukra","Budha","Chandra");
    @Override
    public String getFortune() {
        Random rand_index = new Random();
        int random = rand_index.nextInt(randomFortunes.size())+0;
        return randomFortunes.get(random);
    }

}
