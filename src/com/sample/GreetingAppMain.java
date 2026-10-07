package com.sample;

import java.util.List;

/**
 * 社員の挨拶アプリケーション
 */
public class GreetingAppMain {

    public static void main(String[] args) {
        /** 社員情報を取得 */
        List<Employee> employees = generateEmployes();

        /** 社員分挨拶をします */
        for (Employee employee : employees) {
            /** 社員ごとの挨拶文を取得 */
            String greetingMessage = employee.greet();
            /** 挨拶文をコンソールに出力 */
            System.out.println(greetingMessage);
        }
    }

    /**
     * 社員オブジェクトリストを生成します
     * @return 社員情報
     */
    private static List<Employee> generateEmployes() {

        /** 田中太郎 */
        Employee taro = new Employee("田中太郎", 28);
        /** 山田花子 */
        Employee hanako = new Employee("山田花子", 20);

        return List.of(taro, hanako);
    }
}
