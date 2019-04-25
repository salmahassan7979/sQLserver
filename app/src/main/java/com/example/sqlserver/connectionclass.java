package com.example.sqlserver;



import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connectionclass {
    // Your IP address must be static otherwise this will not work. You //can get your Ip address
//From Network and security in Windows.
    String ip = "192.168.18.21";
    // This is default if you are using JTDS driver.
    String classs = "net.sourceforge.jtds.jdbc.Driver";
    // Name Of your database.
    String db = "ServiceProvider";

    String un = "abc";
    String password = "123";

    @SuppressLint("NewApi")
    public Connection CONN() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();

        StrictMode.setThreadPolicy(policy);
        Connection conn = null;
        String ConnURL="jdbc:sqlserver://(192.168.18.21):1433;databaseNameServiceProvider;user=abc;password=123";
        try {
            Class.forName(classs);

            conn = DriverManager.getConnection(ConnURL);
        }
        catch (SQLException se)
        {
            Log.e("safiya", se.getMessage());
        }
        catch (ClassNotFoundException e) {
        }
        catch (Exception e) {
            Log.e("error", e.getMessage());
        }
        return conn;
    }


}
