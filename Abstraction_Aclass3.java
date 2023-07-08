//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 
//'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an 
//object of each of the three classes.

abstract class Bank {
    public abstract int getBalance();
}

class BankA extends Bank {
    private int balance;

    public BankA() {
        balance = 100;
    }

    public int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    private int balance;

    public BankB() {
        balance = 150;
    }

    public int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private int balance;

    public BankC() {
        balance = 200;
    }

    public int getBalance() {
        return balance;
    }
}

public class Abstraction_Aclass3 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        System.out.println("Bank A balance: $" + bankA.getBalance()); // Output: Bank A balance: $100

        BankB bankB = new BankB();
        System.out.println("Bank B balance: $" + bankB.getBalance()); // Output: Bank B balance: $150

        BankC bankC = new BankC();
        System.out.println("Bank C balance: $" + bankC.getBalance()); // Output: Bank C balance: $200
    }
}