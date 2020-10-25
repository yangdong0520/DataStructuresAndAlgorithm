/**
 * @Author 杨栋
 * @Date 2020/10/21 22:42
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("请输入下面的序号进行操作");
        boolean flag = true;
        while (flag){
            System.out.println("[1]:展示产品的相关参数和功能");
            System.out.println("[2]:生产相关产品");
            System.out.println("[3]:查询产品的库存量");
            System.out.println("[4]：退出系统");
            System.out.println("--------------------------");
            Scanner s = new Scanner(System.in);
            Method client = new Method();
            int temp = s.nextInt();
            switch (temp){
                case 1:client.show();break;
                case 2:client.create();break;
                case 3:client.search();break;
                case 4: flag=false;break;
            }
        }
    }
    
}
