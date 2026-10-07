package com.sample;

/**
 * 社員クラス
 */
public class Employee {

    /** 挨拶の定型文の定義 */
    private final String MESSAGE_TEMPLATE = "こんにちは、%sです。%d歳です。";

    /** 社員名 */
    private String name;
    /** 年齢 */
    private int age;

    /**
     * コンストラクタ
     * @param name 社員名
     * @param age 年齢
     */
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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
     * 挨拶の文章を返します
     * @return 挨拶文
     */
    public String greet() {
        return MESSAGE_TEMPLATE.formatted(this.name, this.age);
    }
}
