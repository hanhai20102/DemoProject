package Muyuxi;

/**
 * @Description
 * @author: SGF
 * @Date 2019-07-15 11:34
 */
public interface NewCharacter {
    public static final String str = "Muyuxi";
    default void testDefault() {
        System.out.println("this is a default method");
    }

    static void showStatic() {
        System.out.println("this is a static Method!!!");
    }


    public static void main(String[] args) {
        NewCharacter.showStatic();
    }


}
