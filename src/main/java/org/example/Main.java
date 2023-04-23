package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int start_money, years;
        String name;
        float rate, annualIncome, finish_money;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter your name:");
            name = br.readLine();
            System.out.println("Enter start money :");
            start_money = Integer.parseInt(br.readLine());
            System.out.println("Enter years for savings account :");
            years = Integer.parseInt(br.readLine());
            System.out.println("Enter savings account rate in percent :");
            rate = Float.parseFloat(br.readLine());
            annualIncome = (float)start_money / 100 * rate;
            finish_money = annualIncome * years + start_money;
            System.out.println("Hello " + name + ". Your final balance: " + finish_money + " rubles.");
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}