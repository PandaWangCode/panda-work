package com.nx.ood.chainofresponsibility;

public class HaveBreakfastFilter implements IStudyPrepareFilter {
    @Override
    public void doFilter(checkDto preparationList, FilterChain filterChain) {
        if (preparationList.isHaveBreakfast()){
            System.out.println("吃完早饭");
        }
        filterChain.doFilter(preparationList, filterChain);
    }
}
