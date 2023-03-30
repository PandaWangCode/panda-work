package com.nx.ood.chainofresponsibility;

public class WashHairFilter implements IStudyPrepareFilter {

    @Override
    public void doFilter(CheckDto checkDto, FilterChain filterChain) {
        if (checkDto.isWashHair()){
            System.out.println("洗完头发");
        }
        filterChain.doFilter(checkDto, filterChain);
    }

}
