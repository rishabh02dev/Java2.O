
    int acc_no ;
    String name;
    float amount;

    void insert(int a, String n, float amt){
        acc_no = a;
        name = n;
        amount = amt;
    }

    void deposit(float amt){
        amount = amount+amt;
        System.out.println(amt + " Deposit");
    }


    void withdraw(float amt){
        if(amount>amt){
            amount = amount -amt;
            System.out.println(amount + "Withdraw from your "+acc_no);
        }else{
            System.out.println("Insufficient Balance");
        }

    
    }

    void checkBalance(){
            System.out.println("Balance is "  + amount);
        }

    void display(){
        System.out.println(acc_no + " " + name+ " " + amount);
    }


}