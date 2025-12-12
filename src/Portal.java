public class Portal {
    private String platformName;
    private int totalUsers;

    public Portal(String platformName, int totalUsers) {
        this.platformName = platformName;
        this.totalUsers = totalUsers;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }

    public void displayPortalInfo() {
        System.out.println("Portal: " + platformName + " | Users: " + totalUsers);
    }
}
