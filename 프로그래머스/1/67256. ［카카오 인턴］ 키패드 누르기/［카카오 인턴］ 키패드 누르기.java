class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int count=0;
		Hand h1;
		h1 = new Hand(hand);
		for(int i=0; i<numbers.length; i++)
		{
			
			switch (numbers[count++]) {
			case 1: {
				answer = answer + "L";
				h1.setlocation("1");
				break;
			}
			case 4:{
				answer = answer + "L";
				h1.setlocation("4");
				break;
			}
			case 7:{
				answer = answer + "L";
				h1.setlocation("7");
				break;
			}
			
			case 3:{
				answer = answer + "R";
				h1.setlocation("3");
				break;
			}
			case 6:{
				answer = answer + "R";
				h1.setlocation("6");
				break;
			}
			case 9:{
				answer = answer + "R";
				h1.setlocation("9");
				break;
			}
			case 2:{
				if(h1.midpadnumber("2").equals("left"))
				{
					answer = answer + "L";
				}
				else
				{
					answer = answer + "R";
				}
				break;
			}
			case 5:{
				if(h1.midpadnumber("5").equals("left"))
				{
					answer = answer + "L";
				}
				else
				{
					answer = answer + "R";
				}
				break;
			}
			case 8:{
				if(h1.midpadnumber("8").equals("left"))
				{
					answer = answer + "L";
				}
				else
				{
					answer = answer + "R";
				}
				break;
			}
			case 0:{
				if(h1.midpadnumber("0").equals("left"))
				{
					answer = answer + "L";
				}
				else
				{
					answer = answer + "R";
				}
				break;
			}
			default:
				break;
			}
		}
        return answer;
	}
	
	static class Hand
	{
		String hand;
		int lx=0, ly=0, rx=2, ry=0;
	
		public Hand(String hand) {
			// TODO Auto-generated constructor stub
			this.hand = hand;
		}

		void setlocation(String number)
		{	
			if(number.equals("1"))
			{
				lx = 0;
				ly = 3;
			}
			
			else if(number.equals("4"))
			{
				lx = 0;
				ly = 2;
			}
			
			else if(number.equals("7"))
			{
				lx = 0;
				ly = 1;
			}
			
			else if(number.equals("3"))
			{
				rx = 2;
				ry = 3;
			}
			
			else if(number.equals("6"))
			{
				rx = 2;
				ry = 2;
			}
			
			else if(number.equals("9"))
			{
				rx = 2;
				ry = 1;
			}
		}
		
		String midpadnumber(String padnumber)
		{
			if(padnumber.equals("2"))
			{
				if(getDistance(1, 3, lx, ly) < getDistance(1, 3, rx, ry))
				{
					lx = 1;
					ly = 3;
					return "left";
				}
				
				else if(getDistance(1, 3, lx, ly) > getDistance(1, 3, rx, ry))
				{
					rx = 1;
					ry = 3;
					return "right";
				}
				else
				{
					if(hand.equals("left"))
					{
						lx = 1;
						ly = 3;
						return "left";
					}
					else
					{
						rx = 1;
						ry = 3;
						return "right";
					}
				}
			}
			
			else if(padnumber.equals("5"))
			{
				if(getDistance(1, 2, lx, ly) < getDistance(1, 2, rx, ry))
				{
					lx = 1;
					ly = 2;
					return "left";
				}
				
				else if(getDistance(1, 2, lx, ly) > getDistance(1, 2, rx, ry))
				{
					rx = 1;
					ry = 2;
					return "right";
				}
				else
				{
					if(hand.equals("left"))
					{
						lx = 1;
						ly = 2;
						return "left";
					}
					else
					{
						rx = 1;
						ry = 2;
						return "right";
					}
				}
			}
			
			else if(padnumber.equals("8"))
			{
				if(getDistance(1, 1, lx, ly) < getDistance(1, 1, rx, ry))
				{
					lx = 1;
					ly = 1;
					return "left";
				}
				
				else if(getDistance(1, 1, lx, ly) > getDistance(1, 1, rx, ry))
				{
					rx = 1;
					ry = 1;
					return "right";
				}
				else
				{
					if(hand.equals("left"))
					{
						lx = 1;
						ly = 1;
						return "left";
					}
					else
					{
						rx = 1;
						ry = 1;
						return "right";
					}
				}
			}
			
			if(padnumber.equals("0"))
			{
				if(getDistance(1, 0, lx, ly) < getDistance(1, 0, rx, ry))
				{
					lx = 1;
					ly = 0;
					return "left";
				}
				
				else if(getDistance(1, 0, lx, ly) > getDistance(1, 0, rx, ry))
				{
					rx = 1;
					ry = 0;
					return "right";
				}
				else
				{
					if(hand.equals("left"))
					{
						lx = 1;
						ly = 0;
						return "left";
					}
					else
					{
						rx = 1;
						ry = 0;
						return "right";
					}
				}
			}
			return "여기까지 안와";
		}
		
		static int getDistance(int x, int y, int x1, int y1) {
			// Math.pow() <- 제곱
			// Math.sqrt() <- 루트
			int distance;
			int xd, yd;
			yd = Math.abs(x- x1);
			xd = Math.abs(y - y1);
			distance = yd + xd;
			return distance;
		}
	}
}