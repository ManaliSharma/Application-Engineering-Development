package Business.Boston;

import Business.Enterprise.EnterpriseDirectory;

public class Boston {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Boston(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
