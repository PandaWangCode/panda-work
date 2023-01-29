package com.nx.ood.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        PreparationList preparationList = new PreparationList();
        preparationList.setWashFace(true);
        preparationList.setWashHair(false);
        preparationList.setHaveBreakfast(true);

        Study study = new Study();
        StudyPrepareFilter washFace = new WashFaceFilter();
        StudyPrepareFilter washHair = new WashHairFilter();
        StudyPrepareFilter haveBreakFast = new HaveBreakfastFilter();

        FilterChain filterChain = new FilterChain(study);
        filterChain.addFilter(washFace);
        filterChain.addFilter(washHair);
        filterChain.addFilter(haveBreakFast);

        filterChain.doFilter(preparationList, filterChain);
    }
}
