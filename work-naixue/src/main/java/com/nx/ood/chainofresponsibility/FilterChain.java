package com.nx.ood.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements StudyPrepareFilter {

    private int pos = 0;

    private Study study;

    private List<StudyPrepareFilter> studyPrepareFilterList;

    public FilterChain(Study study) {
        this.study = study;
    }

    public void addFilter(StudyPrepareFilter studyPrepareFilter) {
        if (studyPrepareFilterList == null) {
            studyPrepareFilterList = new ArrayList<>();
        }
        studyPrepareFilterList.add(studyPrepareFilter);
    }

    @Override
    public void doFilter(PreparationList thingList, FilterChain filterChain) {
        // 所有过滤器执行完毕，所做的事情
        if (pos == studyPrepareFilterList.size()) {
            study.study();
            return;
        }
        // 即这里有一个计数器，假设所有的StudyPrepareFilter没有调用完毕，那么调用下一个，否则执行Study的study()方法。
        studyPrepareFilterList.get(pos++).doFilter(thingList, filterChain);
    }

}
