public class Freelancer {
    private String name;
    private String skills;
    private double hourlyRate;

    public Freelancer(String name, String skills, double hourlyRate) {
        this.name = name;
        this.skills = skills;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void showProfile() {
        System.out.println("Freelancer: " + name);
        System.out.println("Skills: " + skills + " | Rate: $" + hourlyRate + "/hour");
    }
}
