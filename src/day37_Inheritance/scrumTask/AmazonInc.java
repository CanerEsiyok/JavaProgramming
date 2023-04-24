package day37_Inheritance.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {
        String company="Amazon Inc";
        ProductOwner po=new ProductOwner("Shelly",29,'F',1,160000, company);
        BusinessAnalyst ba=new BusinessAnalyst("Alice",47,'F',2,140000,company);
        ScrumMaster sm=new ScrumMaster("Boris",34,'M',3,145000,company);

        Tester tester1=new Tester("Okan",24,'M',"QA",1413,120000,company);
        Tester tester2=new Tester("Jane",21,'F',"QA",1414,105000,company);

        Tester[] testers={tester1,tester2};

        Developer developer1=new Developer("Mike",24,'M',"Java Developer",1415,125000,company);

        ScrumTeam team=new ScrumTeam(po,ba,sm);
        team.addTester(testers);
        team.addDeveloper(developer1);
        System.out.println(team);
        for (Tester tester : team.testers) {
            System.out.println(tester.name+" : "+tester.salary);
        }


    }
}
