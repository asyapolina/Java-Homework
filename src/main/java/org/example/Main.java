package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int start_money, years;
        String name;
        float rate, annualIncome, finish_money;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name, start money, years, account rate:");
            String[] input = br.readLine().split(" ");
            name = input[0];
            start_money = Integer.parseInt(input[1]);
            years = Integer.parseInt(input[2]);
            rate = Float.parseFloat(input[3]);

            annualIncome = (float)start_money / 100 * rate;
            finish_money = annualIncome * years + start_money;
            System.out.println("Hello " + name + ". Your final balance: " + finish_money + " rubles.");
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}