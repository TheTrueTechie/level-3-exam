import java.util.ArrayList;

public class VoteProcessor {


	
	public String calculateElectionWinner(ArrayList<String> votes) {
		for (int i = 0; i < votes.size(); i++) {
			votes.set(i, votes.get(i).toLowerCase());
			//System.out.println("a");
			//System.out.println(votes.get(i));
			int ed = 0;
			int pf = 0;
			if (votes.equals("edward snowden")) {
				ed++; 
				
			}
			
			if (votes.equals("pope francis")) {
				pf++;
			}
			if (pf>ed) {
				return "pope francis";
			}
			
			if (ed>pf) {
				return "edward snowden";
			}
			
			if (ed==pf) {
				return "TIE";
			}
		}
		return null;
	}

}
