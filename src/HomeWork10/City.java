package HomeWork10;

import java.util.Arrays;

public class City
	{
		
		protected Street st;
		protected Plosch pl;

		

		class Street
			{
				private String[] str;

				@Override
				public String toString()
					{
						return Arrays.toString(getStr());
					}

				public String[] getStr()
					{
						return str;
					}

				public void setUli(String[] str)
					{
						this.str = str;
					}

			}

		class Plosch
			{
				private String[] pls;

				@Override
				public String toString()
					{
						return Arrays.toString(getPls());
					}

				public String[] getPls()
					{
						return pls;
					}

				public void setPls(String[] pls)
					{
						this.pls = pls;
					}

			}

		@Override
		public String toString()
			{
				return "City улицы:" + st.toString() + ", площади:" + pl.toString();
			}

	}