package org.cyb.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Colleage extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public Colleage(String name) {
        super(name);
    }

    public void add(OrganizationComponent depart) {
        organizationComponents.add(depart);
    }

    public void remove(OrganizationComponent depart) {
        organizationComponents.remove(depart);
    }

    @Override
    public void print() {
        System.out.println("学院： " + getName());
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
