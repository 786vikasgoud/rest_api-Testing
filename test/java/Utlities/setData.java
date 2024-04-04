package Utlities;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class setData {
    public static List<Map<String, String>> dsf(DataTable dataTable, PostRequestData userData){

        List<Map<String, String>> userDetails = dataTable.asMaps(String.class, String.class);
        if (!userDetails.isEmpty()) {
            Map<String, String> userDetail = userDetails.get(0); // Assuming there's only one set of details
            userDetail.forEach((field, value) -> {
                switch (field) {
                    case "id":
                        userData.setId(Integer.parseInt(value));
                        break;
                    case "username":
                        userData.setUsername(value);
                        break;
                    case "firstName":
                        userData.setFirstName(value);
                        break;
                    case "lastName":
                        userData.setLastName(value);
                        break;
                    case "email":
                        userData.setEmail(value);
                        break;
                    case "password":
                        userData.setPassword(value);
                        break;
                    case "phone":
                        userData.setPhone(value);
                        break;
                    case "userStatus":
                        userData.setUserStatus(Integer.parseInt(value));
                        break;
                }
            });
        } else {
            throw new IllegalArgumentException("No user details found in DataTable.");
        }
        String u =userData.getUsername();
        String e = userData.getFirstName();


        return userDetails;
    }
}
