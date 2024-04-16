package com.interview.string;


class VoterException extends Exception{
    public VoterException(String msg){
        super(msg);
    }
}


class ElectionCommision{

    public void registerVoter(int age) throws VoterException {
        if(age < 18){
            throw new VoterException("you are not eligible for voting because your age is less than 18 years");
        }else{
            System.out.println("Voter Registration Successfull");
        }

    }

}

public class Test67 {
    public static void main(String[] args) {

        ElectionCommision electionCommision = new ElectionCommision();
        try{
            electionCommision.registerVoter(20);
            electionCommision.registerVoter(16);
        }catch(VoterException voterException){
            System.out.println(voterException.getMessage());
        }
    }
}
