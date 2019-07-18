package Muyuxi;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @author: Muyuxi
 * @Date 2019-07-15 10:25
 */
public class Extend extends SuperClass{

    private String value;

    public Extend(Integer goodId, String name) {
        super(goodId,name);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Extend{" +
                "value='" + value + '\'' +
                '}';
    }

    public static void main(String[] args) {
/*        Extend extend = new Extend(147258,"Muyuxi");
        System.out.println(extend);*/
        BigDecimal bd = new BigDecimal("100.2");
        System.out.println(bd);
        System.out.println(bd);

        List<String> muyuxi = Arrays.asList("Muyuxi");
        for (String str : muyuxi) {
            System.out.println(str);
        }








    }
}
