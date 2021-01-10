package Interface;
/*
接口的多态性
 */
public class USBTest {
    public static void main(String[] args) {
        //创建了接口的非匿名实现类的非匿名对象
        Computer c = new Computer();
        Flash flash = new Flash();
        c.transferData(flash);

        //创建了接口的非匿名实现类的匿名对象
        c.transferData(new Printer());

        //创建了接口的匿名实现类的非匿名对象 相当于省略了手机类实现usb接口 手机连接usb的匿名实现类
        USB phone = new USB() {
            @Override
            public void star() {
                System.out.println(" 手机开机 ");
            }

            @Override
            public void stop() {
                System.out.println(" 手机关机 ");
            }
        };
        c.transferData(phone);

        //创建了接口的匿名实现类的匿名对象
        c.transferData(new USB() {
            @Override
            public void star() {
                System.out.println(" MP4开始下载 ");
            }

            @Override
            public void stop() {
                System.out.println(" MP4下载结束 ");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb){
        usb.star();
        System.out.println(" 传输细节 ");
        usb.stop();
    }
}
interface USB{
    //定义常量 长 宽 传输速率
    void star();
    void stop();

}
//u盘接入usb
class Flash implements USB{

    @Override
    public void star() {
        System.out.println(" u盘开始工作 ");
    }

    @Override
    public void stop() {
        System.out.println(" u盘结束工作 ");
    }
}
//打印机接入usb
class Printer implements USB{

    @Override
    public void star() {
        System.out.println(" 打印机开始工作 ");
    }

    @Override
    public void stop() {
        System.out.println(" 打印机结束工作 ");
    }
}

