package hashcode;

import java.util.ArrayList;

public class Project {
    String name;
    int duration;
    int score;
    int deadline;
    int contributors;
    ArrayList<Skill> skills;
    
    Project(String name, int duration, int score, int deadline, int contributors){
      this.name = name;
      this.duration = duration;
      this.score = score;
      this.deadline = deadline;
      this.contributors = contributors;
      skills = new ArrayList<>();
    }
    
    public void addRole(String sName, int sLevel) {
        skills.add(new Skill(sName, sLevel));
    }

}