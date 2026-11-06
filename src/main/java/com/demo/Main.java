package com.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskService service = new TaskService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎使用 TODO v1");

        while (true) {
            System.out.println("\n请选择操作: 1.添加任务  2.查看任务  0.退出");
            System.out.print("输入指令: ");
            String choice = scanner.nextLine();

            if ("1".equals(choice)) {
                System.out.print("请输入任务名称: ");
                String title = scanner.nextLine();
                service.addTask(title);
            } else if ("2".equals(choice)) {
                service.listTasks();
            } else if ("0".equals(choice)) {
                System.out.println("退出程序。");
                break;
            } else {
                System.out.println("❌ 输入无效，请重新输入。");
            }
        }
    }
}