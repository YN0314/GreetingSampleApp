package com.sample;

/**
 * 社員クラス
 */
public class Employee {

    /** 挨拶の定型文の定義 */
    private final String MESSAGE_TEMPLATE = "こんにちは、%sです。%d歳です。";
    /** 自己紹介文(趣味)の定義 */
    private final String HOBBY_TEMPLATE = "先日趣味が変わりまして%sに興味があります。";
    /** 自己紹介文(最初の趣味)の定義 */
    private final String INITIAL_HOBBY_TEMPLATE = "趣味は%sです。";
    
    /** 社員名 */
    private String name;
    /** 年齢 */
    private int age;
    /** 趣味 */
    private String hobby;
    /** 趣味を変更したかどうか */
    private boolean hobbyChanged;

    /**
     * コンストラクタ
     * @param name 社員名
     * @param age 年齢
     * @param hobby 趣味
     */
    public Employee(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby= hobby;
    }

    /**
     * 名前を取得します
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 年齢を取得します
     * @return age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * 趣味を取得します
     * @return hobby
     */
    public String getHobby() {
    	    return hobby;
    }
    
    /**
     * 趣味を変更します
     * @param hobby 趣味
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
        this.hobbyChanged = true;
    }
    
    /**
     * 挨拶の文章を返します
     * @return 挨拶文
     */
    public String greet() {
        String hobbyMessage;
        if (hobbyChanged) {
            hobbyMessage = HOBBY_TEMPLATE.formatted(this.hobby);
        } else {
            hobbyMessage = INITIAL_HOBBY_TEMPLATE.formatted(this.hobby);
        }
        return MESSAGE_TEMPLATE.formatted(this.name, this.age) + hobbyMessage;
    }
}
