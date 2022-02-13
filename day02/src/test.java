import java.util.Scanner;

/**
 * @description: dsad
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/13 14:32
 */
public class test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入三位数：");
        int a = input.nextInt();

        int ge = a % 10;
        int shi = a / 10 % 10;
        int bai = a / 100;

        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);

    }

}
