package org.cyb.builderpattern.House;

public abstract class HouseBuilder {
    protected House house = new House();
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House build() {
        return house;
    }
}
