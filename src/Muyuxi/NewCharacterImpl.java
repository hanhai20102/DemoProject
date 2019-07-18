package Muyuxi;

/**
 * @Description
 * @author: Muyuxi
 * @Date 2019-07-15 11:38
 */
public class NewCharacterImpl implements NewCharacter{


    @Override
    public void testDefault() {
        System.out.println("this is a default Method in implClass");
    }


    public static void main(String[] args) {
        NewCharacter newCharacter = new NewCharacterImpl();
        newCharacter.testDefault();

    }
}
