package Muyuxi;

/**
 * @Description
 * @author: Muyuxi
 * @Date 2019-07-15 10:26
 */
public class SuperClass {

    private Integer goodsId;
    private String  name;

    public SuperClass() {

    }

    public SuperClass(Integer goodsId, String name) {
        setGoodsId(goodsId);
        setName(name);
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
