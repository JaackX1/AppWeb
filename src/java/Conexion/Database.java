
package Conexion;

public class Database {
    private String us;
    private String pas;
    private String url;
    private String driver;

    public Database() {
        this.us = "nma";
        this.pas = "nma";
        this.url = "jdbc:oracle:thin:"+us+"/"+pas+"@localhost:1521:xe";
        this.driver = "oracle.jdbc.driver.OracleDriver";
    }

    public String getUs() {
        return us;
    }

    public String getPas() {
        return pas;
    }

    public String getUrl() {
        return url;
    }

    public String getDriver() {
        return driver;
    }
    
}
