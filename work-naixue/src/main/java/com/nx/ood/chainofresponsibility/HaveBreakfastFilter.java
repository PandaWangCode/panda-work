package com.nx.ood.chainofresponsibility;

public class HaveBreakfastFilter implements IStudyPrepareFilter {
    @Override
    public void doFilter(CheckDto checkDto, FilterChain filterChain) {
        if (checkDto.isHaveBreakfast()){
            System.out.println("吃完早饭");
            // throw new RuntimeException("报错");
        }
        filterChain.doFilter(checkDto, filterChain);
    }
}
