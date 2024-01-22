class Solution {
    public String solution(String new_id) {
        String answer = "";
		char[] permit_char = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'
				, 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '-', '.', '_',
				'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		// 1단계
		new_id = new_id.toLowerCase();
		StringBuffer id = new StringBuffer(new_id);
		
		// 2단계
		for(int i=0; i < id.length(); i++)
		{
			boolean flag = false;
			for(int j=0; j< permit_char.length; j++)
			{
				if(id.charAt(i) == permit_char[j])
				{
					flag = true;
					break;
				}
			}
			if(flag == false)
			{
				id.deleteCharAt(i);
				i--;
			}
		}
		
		// 3단계
		for(int i=1; i< id.length(); i++)
		{
			if(id.charAt(i) == '.')
			{
				if(id.charAt(i-1) == '.')
				{
					id.deleteCharAt(i-1);
					i--;
				}
			}
		}
		
		//4단계
		if(id.length() == 0)
		{;
		}
		else if(id.charAt(0) == '.')
		{
			id.deleteCharAt(0);
		}
		if(id.length() == 0)
		{
			
		}
		else if(id.charAt(id.length()-1) == '.')
		{
			id.deleteCharAt(id.length()-1);
		}
		
		//5단계
		
		if(id.length() == 0)
		{
			id = new StringBuffer("a");
		}
		
		//6단계
		
		if(id.length() >= 16)
		{
			id.delete(15, id.length());
			
			if(id.charAt(id.length()-1) == '.')
			{
				id.deleteCharAt(id.length()-1);
			}
		}
		
		//7단계
		new_id = id.toString();
		if(new_id.length() <= 2)
		{
			while(new_id.length() < 3)
			{
				new_id = new_id + id.charAt(id.length()-1);
			}
		}
        return new_id;
    }
}