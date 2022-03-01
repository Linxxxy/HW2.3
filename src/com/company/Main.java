package com.company;

public class Main {

    public static void main(String[] args) {
	BankAccount bankAccount = new BankAccount();
    bankAccount.deposit(20000);
    while (true){
        System.out.println("Ваш общий баланс:"+ bankAccount.getAmount());
        try{
            bankAccount.withDraw(6000);
        }catch (LimitException a){
            System.out.println(a.getMessage()+"Снято:"+ a.getRemainingAmount());
            try{
                bankAccount.withDraw(2000);}catch (LimitException b){
            }
        }
    }
    }
}
