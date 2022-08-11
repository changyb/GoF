package org.cyb.compositepattern;

public class Department extends OrganizationComponent {
    public Department(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("系名称： " + getName());
    }
}
