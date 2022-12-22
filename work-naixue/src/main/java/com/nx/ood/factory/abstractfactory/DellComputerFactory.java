package com.nx.ood.factory.abstractfactory;

public class DellComputerFactory implements ComputerFactory{

    @Override
    public Cpu madeCpu() {
        return new DellCpu();
    }

    @Override
    public HardDisk madeHardDisk() {
        return new DellHardDisk();
    }

    @Override
    public Memory madeMemory() {
        return new DellMemory();
    }

}
