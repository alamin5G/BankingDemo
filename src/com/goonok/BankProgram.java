package com.goonok;

import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BankProgram {
    private HashMap<Integer, Integer> accounts = new HashMap<>();
    private double rate = 0.01 ;
    private int nextacct = 0;
    private int current =-1;
    private Scanner scanner;
    private boolean done = false;

    public static void main(String[] args) {
            BankProgram program = new BankProgram();

            program.run();




        }

    private void run() {
        scanner = new Scanner(System.in);
        while(!done){
            System.out.print("Enter command (0=quit, 1=new, 2=select, 3=deposit, 4=loan, 5=show, 6=interest): ");
            int cmd = scanner.nextInt();
            processCommand(cmd);
        }
    }

    private void processCommand(int cmd) {
        if(cmd==0) quit();
        else if (cmd==1) {

        } else if (cmd==2) {

        } else if (cmd==3) {

        } else if (cmd==4) {

        }else if(cmd==5){

        }
    }

}