package OOPs;
class bank{
    private int acc_no;
    private double balance;
    bank(int i,double j){
        this.acc_no=i;
        this.balance=j;
    }
    void setAcc_no(int i){
        acc_no=i;
    }
    void setBalance(double i){
        balance=i;
    }
    int getacc_no(){
        return acc_no;
    }
    double getbalance(){
        return balance;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        bank b=new bank(124,300);
//        b.setAcc_no(123);
//        b.setBalance(30.00);
        System.out.println("account no of b: "+b.getacc_no());
        System.out.println("balance in account b : "+b.getbalance());
        bank b1 = new bank(125,400);
//        b1.setAcc_no(1234);
//        b1.setBalance(3000.00);
        System.out.println("account no b1 : "+b1.getacc_no());
        System.out.println("balance in account b1 : "+b1.getbalance());
    }
}
