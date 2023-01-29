package com.nx.ood.chainofresponsibility;

public class WashHairFilter implements IStudyPrepareFilter {

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if (preparationList.isWashHair()){
            System.out.println("洗完头发");
        }
        filterChain.doFilter(preparationList, filterChain);
    }

}
