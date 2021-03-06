package com.example.ryosuke.tech_learning;

import android.util.Log;

/**
 * Created by ryosuke on 2017/01/16.
 */
public class Human extends Animal implements Thinkable{

    String hobby;

    //コンストラクタ
    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby= hobby;
    }

    //メンバっ関数
    public void say(){
        Log.d("javatest","私の名前は"+this.name+"です。年は"+this.age+"歳です。");
    }

    @Override
    public void think(){
        Log.d("javatest","私は"+this.hobby+"について考える");
    }
}
