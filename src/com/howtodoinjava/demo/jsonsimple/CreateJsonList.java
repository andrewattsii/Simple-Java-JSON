  package com.howtodoinjava.demo.jsonsimple;
 
import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class CreateJsonList
{
    @SuppressWarnings({ "unchecked", "deprecation" })
    public static void main( String[] args ) {
    
        //First Employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("Brand", "Nabisco");
        employeeDetails.put("Type", "Regular");
        employeeDetails.put("Category", "Desert");
        employeeDetails.put("Nutrition", "/Images/oreonutrition.jpg");
        employeeDetails.put("Price", 6.99);
        employeeDetails.put("Picture", "/Images/oreo.jpg");
         
        JSONObject employeeObject = new JSONObject(); 
        employeeObject.put("Oreo", employeeDetails);
         
        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Brian");
        employeeDetails2.put("lastName", "Schultz");
        employeeDetails2.put("website", "example.com");
         
        JSONObject employeeObject2 = new JSONObject(); 
        employeeObject2.put("employee", employeeDetails2);
         
        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
         
        //Write JSON file
        try (FileWriter file = new FileWriter("employees.json")) {
 
            file.write(employeeList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}