package com.sample;

import java.util.List;

/**
 * 社員の挨拶アプリケーション
 */
public class GreetingAppMain {

	public static void main(String[] args) {
	    /** 社員情報を取得 */
	    List<Employee> employees = generateEmployes();

	    /** 趣味を変更する前の挨拶 */
	    printGreetings(employees);

	    /** 趣味を変更 */
	    employees.get(0).setHobby("スノーボード");
	    employees.get(1).setHobby("手芸");

	    /** 趣味を変更した後の挨拶 */
	    printGreetings(employees);
	}

	/**
	 * 社員全員分の挨拶をコンソールに出力します
	 * @param employees 社員情報
	 */
	private static void printGreetings(List<Employee> employees) {
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
	    Employee taro = new Employee("田中太郎", 28, "野球");

	    /** 山田花子 */
	    Employee hanako = new Employee("山田花子", 20, "料理");

        return List.of(taro, hanako);
    }
}