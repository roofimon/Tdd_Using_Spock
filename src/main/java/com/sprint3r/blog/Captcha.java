package com.sprint3r.blog;

/**
 * Created by roofimon on 5/14/2016 AD.
 */
public class Captcha {
    private int left;
    private int pattern;
    private int right;
    private int operator;
    String[] arr = {"one","two","three","four","five","six","seven","eight","nine"};

    public Captcha(int pattern, int left, int operator, int right){
        this.left = left;
        this.pattern = pattern;
        this.right = right;
        this.operator = operator;
    }
    public String left(){
        if (pattern == 1) {
            return String.valueOf(left);
        }
        return arr[left - 1];
    }

    public String right(){
        if (pattern == 1) {
            return arr[right - 1];
        }
        return String.valueOf(right);
    }

    public String operator() {
        if (operator == 1) {
            return "+";
        }
        if (operator == 2) {
            return "*";
        }
        return "-";
    }

    public String toString() {
        return left() + " " + operator() + " " + right();
    }

}
