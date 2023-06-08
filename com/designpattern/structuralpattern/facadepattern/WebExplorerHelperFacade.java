package com.designpattern.structuralpattern.facadepattern;
import java.sql.Driver;

public class WebExplorerHelperFacade {

    public static void generateReports(String explorer, String report, String test){
        Driver driver = null;
        switch(explorer){
            case "Firefox":
                driver = Firefox.getFirefoxDriver();
                switch(report){
                    case "html":
                        Firefox.generateHTMLReport(test, driver);
                        break;
                    case "junit":
                        Firefox.generateJUnitReport(test, driver);
                        break;
                    }
                break;
            case "Chrome":
                    driver = Chrome.getChromeDriver();
                    switch(report){
                        case "html":
                            Chrome.generateHTMLReport(test, driver);
                            break;
                        case "junit":
                            Chrome.generateJUnitReport(test, driver);
                            break;
                    }
                break;
        }
    }
}
