package com.nx.ood.chainofresponsibility;

public class HaveBreakfastFilter implements IStudyPrepareFilter {
    @Override
    public void doFilter(CheckDto checkDto, FilterChain filterChain) {
        if (checkDto.isHaveBreakfast()){
            System.out.println("吃完早饭");
        }
        filterChain.doFilter(checkDto, filterChain);
    }
}
