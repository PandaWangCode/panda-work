package com.nx.ood.factory.method;

public class DesktopFactory extends AbstractComputerFactor {

    @Override
    public Calculation create() {
        return new DesktopComputer();
    }

}
