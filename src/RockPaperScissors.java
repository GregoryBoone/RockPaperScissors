public class RockPaperScissors {
    public String rps(String p1, String p2) {



        String result = "";

        //rock wins
        if(p1.equals("rock") && p2.equals("scissors")){
            result = "Player 1 won!";
        }

        else if(p2.equals("rock") && p1.equals("scissors")){
            result = "Player 2 won!";
        }
        //scissors wins

        else if(p1.equals("paper") && p2.equals("scissors")){
            result = "Player 2 won!";
        }

        else if(p2.equals("paper") && p1.equals("scissors")){
            result = "Player 1 won!";
        }

        //paper wins
        else if(p2.equals("paper") && p1.equals("rock")){
            result = "Player 2 won!";
        }

        else if (p1.equals("paper") && p2.equals("rock")){
            result = "Player 1 won!";
        }

        else if (p1.equals(p2) || p2.equals(p1) ){
            result = "Draw!";
        }

        return result;

    }
}
