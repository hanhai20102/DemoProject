/**
 * @Description
 * @author: Muyuxi
 * @Date 2019-07-13 20:48
 */
public class TestTemplate {

    public static void main(String[] args) {
        StringBuffer sb  = new StringBuffer("Muyuxi");
        System.out.println(sb);
        Integer num = 100;
        String str = new String("l10啦");

        String var = "onlinejd";
        if(!var.equals("onlinejd")) {
            System.out.println("测试环境");
        } else {
            System.out.println("线上环境");
        }

    }
}
