import java.util.HashMap;
import java.util.Map;

class Voter {
    private String username;
    private String password;

    public Voter(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters for username and password
}

class Candidate {
    private String name;
    private String party;

    public Candidate(String name, String party) {
        this.name = name;
        this.party = party;
    }

    public String getName() {
        return null;
    }

    // Getters for candidate name and party
}

class Election {
    private String title;
    private Map<Candidate, Integer> votes;

    public Election(String title) {
        this.title = title;
        this.votes = new HashMap<>();
    }

    public void addCandidate(Candidate candidate) {
        votes.put(candidate, 0);
    }

    public void voteForCandidate(Candidate candidate) {
        if (votes.containsKey(candidate)) {
            int currentVotes = votes.get(candidate);
            votes.put(candidate, currentVotes + 1);
        }
    }

    public Map<Candidate, Integer> getResults() {
        return votes;
    }
}

public class OnlineVotingSystem {
    public static void main(String[] args) {
        // Create voters
        Voter voter1 = new Voter("voter1", "password1");
        Voter voter2 = new Voter("voter2", "password2");

        // Create candidates
        Candidate candidate1 = new Candidate("Candidate A", "Party X");
        Candidate candidate2 = new Candidate("Candidate B", "Party Y");

        // Create an election
        Election election = new Election("Presidential Election");

        // Add candidates to the election
        election.addCandidate(candidate1);
        election.addCandidate(candidate2);

        // Simulate voting
        election.voteForCandidate(candidate1);
        election.voteForCandidate(candidate1);
        election.voteForCandidate(candidate2);

        // Get election results
        Map<Candidate, Integer> results = election.getResults();

        System.out.println("Election Results:");
        for (Map.Entry<Candidate, Integer> entry : results.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue() + " votes");
        }
    }
}
