package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите кол-во элементов массива:");
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Массив:");
        for (int i=0; i<a; ++i){
            arrayList.add((int)(Math.random()*100));
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();
        System.out.println("Упорядоченный массив:");
        for (int i=0; i<a; ++i){
            for (int k=0; k<i; ++k) {
                if (arrayList.get(k)>arrayList.get(i)){
                    int j=arrayList.get(k);
                    arrayList.set(k, arrayList.get(i));
                    arrayList.set(i,j);
            }
            }
        }
        for (int i=0; i<a; i++){
            System.out.print(arrayList.get(i)+" ");
        }
    }
}
