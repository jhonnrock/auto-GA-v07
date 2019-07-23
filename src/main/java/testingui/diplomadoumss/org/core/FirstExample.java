package testingui.diplomadoumss.org.core;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import java.util.HashMap;
import java.util.Map;

public class FirstExample {
    public static void main(String[] args) {

//first method
//        Login login= PageFactory.initElements(webDriver,Login.class);
//        login.setEmail(PropertyAccesor.getInstance().getUserName());
//        login.setPassword(PropertyAccesor.getInstance().getPassword());
//        login.checkbox();
//        login.inicializateWeb();
////second Methods

//        Login login=new Login();
//        login.initBrowser();
//        login.setEmail(PropertyAccesor.getInstance().getEmail());
//        login.setPassword("demoadmin");
//       //  login.checkbox();
//        login.inicializateWeb();
//       //login.quit2();

        Login login=new Login();
        login.setCredentials();

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
