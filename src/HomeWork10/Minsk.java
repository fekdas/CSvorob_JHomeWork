package HomeWork10;

public class Minsk extends City
	{
		public Minsk()
			{				
				Street st = new Street();
				st.setUli(new String[] {"str1", "str2"});
				this.st = st;
				Plosch pl = new Plosch();
				pl.setPls(new String[] {"pls1", "pls2"});
				this.pl = pl;			
			}
	}