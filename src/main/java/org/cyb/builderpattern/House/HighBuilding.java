package org.cyb.builderpattern.House;

public class HighBuilding  extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼的墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
