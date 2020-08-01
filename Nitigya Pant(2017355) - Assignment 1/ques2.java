// Nitigya Pant
// 2017355
// Assignment 1 - Question 2
// Advance Programming

class ques2
{
	String st;

	public ques2(String s)
	{
		st = s;
	}	

	public ques2()
	{
		st = "";
	}

	public int Vowel()
	{
		int count = 0;

		for(int i = 0; i < this.st.length(); i++)
		{
			if(this.st.charAt(i) == 'a' || this.st.charAt(i) == 'e' || this.st.charAt(i) == 'i' || this.st.charAt(i) == 'o' || this.st.charAt(i) == 'u' || this.st.charAt(i) == 'A' || this.st.charAt(i) == 'E' || this.st.charAt(i) == 'I' || this.st.charAt(i) == 'O' || this.st.charAt(i) == 'U')
				count++;
 		}
 		return count;
	}

	public static void main(String[] args)
	{
		String s = "AAA";
		ques2 q = new ques2(s);
		System.out.println("Number of vowels are: " + q.Vowel());

	}

}