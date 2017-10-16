public class ProjectTest {

    public static void main(String[] args) {
        Project p1 = new Project();
        Project p2 = new Project("name");
        Project p3 = new Project("JJ","des1");
        p3.setInitialCost(100);
        p2.setInitialCost(1100);
        p1.setInitialCost(1030);
        p1.elevatorPitch();
        p2.elevatorPitch();
        p3.elevatorPitch();

        Portfolio port = new Portfolio();
        port.addToPortfolio(p1);
        port.addToPortfolio(p2);
        port.addToPortfolio(p3);

        System.out.println(port.getPortfolioCost());
        port.showPortfolio();



    }
}
