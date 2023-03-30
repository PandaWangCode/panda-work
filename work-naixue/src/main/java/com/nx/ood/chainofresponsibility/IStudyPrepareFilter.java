package com.nx.ood.chainofresponsibility;

public interface IStudyPrepareFilter {

    public void doFilter(checkDto preparationList, FilterChain filterChain);

}
