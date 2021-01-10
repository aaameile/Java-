package Constructor.bank;

public class Bank {
    private  Customer[] customers;//存放客户的数组
    private int noc;//记录客户的个数

    public Bank(){
        customers = new Customer[10];
    }

    public void addCustomer(String f,String l){
        Customer customer = new Customer(f,l);
//        customers[noc] = customer;
//        noc++;
        customers[noc++] = customer;
    }

    //获取指定位置客户
    public Customer getCustomers(int index) {
            //return customers[index];
            if (index >= 0 && index < noc){
                return customers[index];
            }
            return null;
    }

    //获取客户个数
    public int getNoc() {
        return noc;
    }


}
