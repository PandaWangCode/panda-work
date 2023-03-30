package com.nx.ood.chainofresponsibility;

public class WashFaceFilter implements IStudyPrepareFilter {

    @Override
    public void doFilter(CheckDto checkDto, FilterChain filterChain) {
        if (checkDto.isWashFace()){
            System.out.println("洗脸");
        }
        filterChain.doFilter(checkDto, filterChain);
    }
}
