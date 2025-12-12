public class JobListing {
    private String title;
    private String description;
    private double budget;

    public JobListing(String title, String description, double budget) {
        this.title = title;
        this.description = description;
        this.budget = budget;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void displayInfo() {
        System.out.println("Job: " + title + " | Budget: $" + budget);
        System.out.println("Description: " + description);
    }
}
