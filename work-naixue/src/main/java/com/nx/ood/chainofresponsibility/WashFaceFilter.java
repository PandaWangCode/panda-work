package com.nx.ood.chainofresponsibility;

public class WashFaceFilter implements IStudyPrepareFilter {

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if (preparationList.isWashFace()){
            System.out.println("洗脸");
        }
        filterChain.doFilter(preparationList, filterChain);
    }
}