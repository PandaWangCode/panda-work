package com.nx.ood.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        CheckDto checkDto = new CheckDto();
        checkDto.setWashFace(true);
        checkDto.setWashHair(false);
        checkDto.setHaveBreakfast(true);

        Study study = new Study();
        IStudyPrepareFilter washFace = new WashFaceFilter();
        IStudyPrepareFilter washHair = new WashHairFilter();
        IStudyPrepareFilter haveBreakFast = new HaveBreakfastFilter();

        FilterChain filterChain = new FilterChain(study);
        filterChain.addFilter(washFace);
        filterChain.addFilter(washHair);
        filterChain.addFilter(haveBreakFast);
        try {
            filterChain.doFilter(checkDto, filterChain);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
