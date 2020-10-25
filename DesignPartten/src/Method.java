import easyFactory.LightWeaponFactory;
import easyFactory.Pistol;
import easyFactory.Weapon;
import sun.rmi.transport.ObjectTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author 杨栋
 * @Date 2020/10/21 22:52
 */

public class Method {
    Weapon weapon;
   
    
    public void show(){
        
        System.out.println("展示");
    }
    
    
    public void search(){
        System.out.println("查找");
        
    }
    public void create(){
        weapon= LightWeaponFactory.getWeapon("Pistol");
        weapon.create();
    }
    
}
