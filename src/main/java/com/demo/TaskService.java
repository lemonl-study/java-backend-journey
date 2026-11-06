package com.demo;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new Task(title));
        System.out.println("✅ 任务已添加: " + title);
    }

    public void listTasks() {
        System.out.println("--- 当前任务列表 ---");
        if (tasks.isEmpty()) {
            System.out.println("(空)");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i).getTitle());
            }
        }
        System.out.println("------------------");
    }
}