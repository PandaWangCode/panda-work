package com.nx.ood.factory.abstractfactory;

public interface ComputerFactory {

    Cpu madeCpu();

    HardDisk madeHardDisk();

    Memory madeMemory();

}
