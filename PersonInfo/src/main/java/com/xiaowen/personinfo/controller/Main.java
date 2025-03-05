package com.xiaowen.personinfo.controller;

// 必须导入的IO包
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputs = new ArrayList<>(); // 存储所有输入行
        String line;

        System.out.println("请输入多行内容，按 Ctrl+D (Unix/Mac) 或 Ctrl+Z (Windows) 结束输入：");

        // 持续读取输入，直到EOF
        while ((line = br.readLine()) != null) {
            inputs.add(line.trim()); // 存储每一行
        }

        // 所有输入结束后，统一处理
        System.out.println("\n处理结果：");
        for (String inputLine : inputs) {
            if (inputLine.isEmpty()) continue; // 跳过空行
            String[] numbers = inputLine.split("\\s+");
            int sum = 0;
            for (String numStr : numbers) {
                sum += Integer.parseInt(numStr);
            }
            System.out.println(sum);
        }
    }
}