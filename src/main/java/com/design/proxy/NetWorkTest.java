package com.design.proxy;

public class NetWorkTest {
    public static void main(String[] args) {
        Sever s = new Sever();
        ProxySever sever = new ProxySever(s);
        sever.browse();

    }
}
interface NetWork{
    public void browse();
}
//被代理类
class Sever implements NetWork{

    @Override
    public void browse() {
        System.out.println(" 真实服务器访问网络 ");
    }
}
//代理类
class ProxySever implements NetWork{
    private NetWork work;
    public ProxySever(NetWork work){
        this.work = work;
    }
    public void check(){
        System.out.println(" 联网之前检查工作 ");
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }
}