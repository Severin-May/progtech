package hashcode;
import java.util.ArrayList;

/**
 *
 * @author aichu
 */
public class Contributor {
    String name;
    ArrayList<Skill> skills;
    
    Contributor(String name) {
        this.name = name;
        skills = new ArrayList<>();
    }
    Contributor(String name, ArrayList<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }
    
    public void addSkills(String sName, int sLevel) {
        skills.add(new Skill(sName, sLevel));
    }
    
}
