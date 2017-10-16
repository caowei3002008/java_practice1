class Project {
    private String name;
    private String description;
    private double initialCost;

    public double getInitialCost() {
        return initialCost;
    }

    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Project(){

        System.out.println("No parameter.");
    }
    public Project(String name){
        this.name = name;
        System.out.println("Name is "+ this.name);
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
        System.out.println("Name is "+ this.name);
        System.out.println("Description is "+ this.description);
    }
    public String elevatorPitch(){
        return name + "("+initialCost+"): "+description;
    }
}
