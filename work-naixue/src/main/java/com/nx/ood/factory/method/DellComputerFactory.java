package com.nx.ood.factory.method;

public class DellComputerFactory extends AbstractComputerFactor{
    @Override
    public Calculation create() {
        return new DellComputer();
    }

}
