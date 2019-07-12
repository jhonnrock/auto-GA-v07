package testingui.diplomadoumss.org.core;

import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import java.util.HashMap;
import java.util.Map;

public class FirstExample {
    public static void main(String[] args) {

        BroserType browserType = BroserType.valueOf(PropertyAccesor.getInstance().getBrowser());
        Browser browser = DriverFactory.getInstance().getBrowser(browserType);
        browser.getWebDriver().get(PropertyAccesor.getInstance().getURL());
        browser.getWebDriver().quit();

//        exampleMap();
    }

    public static void exampleMap(){
        Map<String, String> students = new HashMap<>();
        students.put("101", "nombre 1");
        students.put("102", "nombre 2");
        students.put("103", "nombre 3");

        System.out.println(students.get("102"));
    }
}
