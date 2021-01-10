package mian.xiang.dui.xiang;
/*
匿名对象只能调用一次
再调用是另一个对象
 */
public class Instance {
    public static void main(String[] args) {
        phone p = new phone();
       // p.playGame();//有名对象
       // new phone().playGame();//匿名对象
        new phone().price = 999;
        new phone().showPrice();
        man m = new man();
        m.show(new phone());//把匿名对象变成有名对象

    }

}
class man{
    public void show(phone phone){
        phone.playGame();
    }

}

class phone{
    double price;
    public void playGame(){
        System.out.println("玩游戏");
    }
    public void showPrice(){
        System.out.println("price = " + price);

    }
}
