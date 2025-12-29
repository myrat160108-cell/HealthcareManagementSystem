public class Main {
    public static void main(String[] args) {


        JobListing job1 = new JobListing("Web Developer",
                "Need a website created in Java", 500);
        JobListing job2 = new JobListing("Logo Designer",
                "Need a modern logo for a startup", 150);

        Freelancer freelancer1 = new Freelancer("Alex", "Java, Spring", 25);
        Freelancer freelancer2 = new Freelancer("Maria", "Photoshop, Illustrator", 18);

        Portal portal = new Portal("FreelanceHub", 12000);

        portal.displayPortalInfo();
        System.out.println("\n--- Job Listings ---");
        job1.displayInfo();
        job2.displayInfo();

        System.out.println("\n--- Freelancer Profiles ---");
        freelancer1.showProfile();
        freelancer2.showProfile();

        System.out.println("\n--- Comparison ---");
        if (job1.getBudget() > job2.getBudget()) {
            System.out.println(job1.getTitle() + " has a higher budget than " + job2.getTitle());
        } else {
            System.out.println(job2.getTitle() + " has a higher budget than " + job1.getTitle());
        }
    }
}
