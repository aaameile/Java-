package com.design.proxy;
/*
静态代理
 */
public class StaticProxy {

        public static void main(String[] args) {
            com.design.proxy.Sever s = new com.design.proxy.Sever();
            com.design.proxy.ProxySever sever = new com.design.proxy.ProxySever(s);
            sever.browse();

        }

    interface NetWork{
        public void browse();
    }
    //被代理类
    class Sever implements com.design.proxy.NetWork {

        @Override
        public void browse() {
            System.out.println(" 真实服务器访问网络 ");
        }
    }
    //代理类
    class ProxySever implements com.design.proxy.NetWork {
        private com.design.proxy.NetWork work;
        public ProxySever(com.design.proxy.NetWork work){
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
}
