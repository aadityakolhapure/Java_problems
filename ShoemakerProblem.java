import java.util.Arrays;
import java.util.Scanner;

public class ShoemakerProblem {

    static class Job implements Comparable<Job> {
        int id;
        int processingTime;
        int weight;

        Job(int id, int processingTime, int weight) {
            this.id = id;
            this.processingTime = processingTime;
            this.weight = weight;
        }

        // Compare by weight to processing time ratio in descending order
        @Override
        public int compareTo(Job other) {
            double thisRatio = (double) this.weight / this.processingTime;
            double otherRatio = (double) other.weight / other.processingTime;
            return Double.compare(otherRatio, thisRatio);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of jobs:");
        int numJobs = scanner.nextInt();

        Job[] jobs = new Job[numJobs];
        System.out.println("Enter the processing time and weight for each job:");
        for (int i = 0; i < numJobs; i++) {
            int processingTime = scanner.nextInt();
            int weight = scanner.nextInt();
            jobs[i] = new Job(i + 1, processingTime, weight); // id starts from 1
        }

        // Sort jobs by weight to processing time ratio in descending order
        Arrays.sort(jobs);

        System.out.println("Optimal job order to minimize total weighted completion time:");
        for (Job job : jobs) {
            System.out.println("Job " + job.id + ": Processing Time = " + job.processingTime + ", Weight = " + job.weight);
        }

        scanner.close();
    }
}
 
