import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords() {
        logininfo.put("rod", "rodrigo");
        logininfo.put("diday", "hadijah");
        logininfo.put("pusa", "pspsps");
    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }

}
