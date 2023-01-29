package com.nx.ood.chainofresponsibility;

import lombok.Data;

import java.io.Serializable;

@Data
public class PreparationList implements Serializable {

    /**
     * 是否洗脸
     */
    private boolean washFace;

    /**
     * 是否洗头
     */
    private boolean washHair;

    /**
     * 是否吃早餐
     */
    private boolean haveBreakfast;

    public boolean isWashFace() {
        return washFace;
    }

    public boolean isWashHair() {
        return washHair;
    }

    public boolean isHaveBreakfast() {
        return haveBreakfast;
    }

    @Override
    public String toString() {
        return "ThingList [washFace=" + washFace + ", washHair=" + washHair + ", haveBreakfast=" + haveBreakfast + "]";
    }

}
