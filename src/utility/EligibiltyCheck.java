package utility;
import model.*;


public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		if((user.getAge()>=18 && user.getAge()<=35) &&(user.getHeight()>=155 && user.getHeight()<=170)&&(user.getWeight()>=55 && user.getWeight()<=90)
				&& (user.getCountry()=="ProGrad")) 
			return true;
		
		else
		return false;
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		int point;
		point=Integer.parseInt(points);
		if(point>80) 
			return true;
		
		else
		return false;
	}

	@Override
	boolean basiceligibilitycheck(User user) {
		// TODO Auto-generated method stub
		if(checkUser(user))
			return true;
		else
		return false;
		
	}
	
}






