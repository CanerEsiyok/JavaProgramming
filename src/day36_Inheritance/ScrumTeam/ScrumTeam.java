package day36_Inheritance.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public ArrayList<Tester>testers;
    public ArrayList<Developer>developers;

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void ddTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void removeTester(int id){
        testers.removeIf(p->p.id==id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "testers=" + testers +
                ", developers=" + developers +
                '}';
    }
}
