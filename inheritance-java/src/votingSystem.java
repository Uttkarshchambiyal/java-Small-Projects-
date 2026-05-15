import java.util.Scanner;

class Candidates{
    private String name;
    Candidates(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}






public class votingSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of candidates : ");
        int totalCandidates = scan.nextInt();

        Candidates[] totalCandidatesArray = new Candidates[totalCandidates];

        for(int i =0; i<totalCandidates; i++){
            System.out.println("enter the name of "+(i+1)+" Candidate");
            String name = scan.next();
            totalCandidatesArray[i] = new Candidates(name);
        }
        System.out.println("so the Candidates are : ");
        for(int i =0; i<totalCandidates; i++){
            System.out.println(i+1+" : "+totalCandidatesArray[i].getName());
        }


    }
}
