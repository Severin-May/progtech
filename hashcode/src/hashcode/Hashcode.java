package hashcode;
import java.io.*;
import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


/**
 *
 * @author aichu
 */

public class Hashcode {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        ArrayList<Contributor> contribs = new ArrayList<>();
        ArrayList<Project> projects = new ArrayList<>();
        File file = new File("input.txt");
        int numContrib;
        int numProject;
    try
    {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String fLine = br.readLine();
        numContrib = Integer.parseInt(fLine.split(" ")[0]); 
        numProject = Integer.parseInt(fLine.split(" ")[1]); 
        String line;
           
        while ((line = br.readLine()) != null) {
            
            for(int k = 0; k < numContrib; k++) {
                String[] inputs = br.readLine().split(" ");
                //System.out.println(inputs[0]);
                Contributor contrib = new Contributor(inputs[0]);
                for(int j = 0; j < Integer.parseInt(inputs[1]); j++) {
                    String sLine = br.readLine();
                    String[] sInputs = sLine.split(" ");
                    contrib.addSkills(sInputs[0], Integer.parseInt(sInputs[1]));
                }
                contribs.add(contrib);
            }
            System.out.println(br.readLine());
            for(int k = 0; k < numProject; k++) {
                String pLine = br.readLine();
                String[] pInputs = pLine.split(" ");
                //System.out.println(pLine);
                Project project = new Project(pInputs[0], Integer.parseInt(pInputs[1]), Integer.parseInt(pInputs[1]), Integer.parseInt(pInputs[1]), Integer.parseInt(pInputs[1]) );
                
                for(int j = 0; j < Integer.parseInt(pInputs[1]); j++) {
                    String sLine = br.readLine();
                    String[] sInputs = sLine.split(" ");
                    project.addRole(sInputs[0], Integer.parseInt(sInputs[1]));
                }
                projects.add(project);
            }
        }
        br.close();
    }
    catch (FileNotFoundException e) 
    {
      System.out.println("Unable to access file!");
    }
    catch (IOException e) 
    {
      System.out.println("IO error");
    }
    
    
    }
}
