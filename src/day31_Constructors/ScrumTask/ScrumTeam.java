package day31_Constructors.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO;
    public String SM;
    public String BA;
    public ArrayList<Tester> testersList=new ArrayList<>();
    public ArrayList<Developer> developersList=new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String SM, String BA, int daysOfSprint) {
        this.PO = PO;
        this.SM = SM;
        this.BA = BA;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }
    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        developersList.addAll(Arrays.asList(developers));
    }
    public void removeTester(int employeeID){
        testersList.removeIf(p-> p.employeeID== employeeID);
    }
    public void removeDeveloper(int employeeID){
        developersList.removeIf(p->p.employeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", SM='" + SM + '\'' +
                ", BA='" + BA + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + developersList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
