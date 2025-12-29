import model.Freelancer;
import model.JobListing;
import service.Portal;

public class Main {
    public static void main(String[] args) {

        Portal portal = new Portal();

        portal.addFreelancer(new Freelancer(1, "Alex", "Java", 3));
        portal.addFreelancer(new Freelancer(2, "Maria", "Web Design", 5));

        portal.addJob(new JobListing(1, "Website Development", "IT", 1200));
        portal.addJob(new JobListing(2, "Logo Design", "Design", 400));
        portal.addJob(new JobListing(3, "Backend API", "IT", 2000));

        System.out.println("=== All Jobs ===");
        portal.showAllJobs();

        System.out.println("\n=== IT Jobs ===");
        portal.findJobsByCategory("IT").forEach(System.out::println);

        System.out.println("\n=== Jobs with budget >= 1000 ===");
        portal.filterJobsByBudget(1000).forEach(System.out::println);

        System.out.println("\n=== Sorted by budget ===");
        portal.sortJobsByBudget();
        portal.showAllJobs();
    }
}
