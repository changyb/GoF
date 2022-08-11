package org.cyb.compositepattern;

public class Demo {
    public static void main(String[] args) {
        OrganizationComponent math = new Department("数学系");
        OrganizationComponent computer = new Department("计算机系");
        OrganizationComponent information = new Department("信息管理系");

        Colleage colleage = new Colleage("计算机与信息学院");
        colleage.add(math);
        colleage.add(computer);
        colleage.add(information);

        colleage.print();
    }
}
