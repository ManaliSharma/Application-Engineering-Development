package Business;

import Business.Boston.Boston;
import Business.Organisation.Organisation;
import Business.Role.Role;
import Business.Role.SysAdmin;
import java.util.ArrayList;

public class Disaster extends Organisation {
    
    private static Disaster business;
    private ArrayList<Boston> networkList;
    public static Disaster getInstance(){
        if(business==null){
            business=new Disaster();
        }
        return business;
    }
    
    public Boston createAndAddNetwork(){
        Boston boston_area=new Boston();
        networkList.add(boston_area);
        return boston_area;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SysAdmin());
        return roleList;
    }
    
    private Disaster(){
        super(null);
        networkList=new ArrayList<Boston>();
    }

    public ArrayList<Boston> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Boston> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Boston boston_area:networkList){    
        }
        return true;
    }
}
