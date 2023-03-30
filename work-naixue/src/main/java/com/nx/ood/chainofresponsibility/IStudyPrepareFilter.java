package com.nx.ood.chainofresponsibility;

public interface IStudyPrepareFilter {

    public void doFilter(CheckDto checkDto, FilterChain filterChain);

}
