package com.designpattern.structural.facadepattern;

public class FacadePatternTest {
    public static void main(String[] args) {
        String test = "CheckElementPresent";
        WebExplorerHelperFacade.generateReports("Firefox", "html", test);
        WebExplorerHelperFacade.generateReports("Firefox", "junit", test);
        WebExplorerHelperFacade.generateReports("Chrome", "html", test);
        WebExplorerHelperFacade.generateReports("Chrome", "junit", test);
    }
}
