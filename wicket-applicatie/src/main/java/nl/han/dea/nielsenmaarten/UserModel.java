package nl.han.dea.nielsenmaarten;


import com.github.openjson.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class UserModel implements Serializable {

    private String username;
    private String password;
    private String token;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {
        String jsonInputString = "{\"user\": \"" + username + "\", \"password\": \"" + password + "\" }";
        try {
            URL url = new URL("http://localhost:8081/login");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json;");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            JSONObject myResponse = new JSONObject(response.toString());
            this.token = myResponse.getString("token");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getToken() {
        return token;
    }
}
