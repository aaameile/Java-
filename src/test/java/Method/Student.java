package Method;
//[a - b]  (int) (Math.random() * (b - a + 1) + a) ;
public class Student {
    int num;
    int state;
    int score;
    public String info(){
        return "学号 " + num +" 年级 " + state +" 分数 "+ score;
    }
}
