package HomeWork12;

public class FIO
	{
private String name;
private String sn;

public FIO(String name, String sn)
	{
		this.name = name;
		this.sn = sn;
		
	}
public String getName()
	{
		return name;
	}
public void setName(String name)
	{
		this.name = name;
	}
public String getSN()
	{
		return sn;
	}
public void setSN(String sn)
	{
		this.sn = sn;
	}


@Override
public String toString()
	{
		return "Name= " + name + " " + sn + "\n";
	}
@Override
public int hashCode()
	{
		final int code = 29;
		int rc = 1;
		rc = code * rc + ((name == null) ? 0 : name.hashCode());
		rc = code * rc + ((sn == null) ? 0 : sn.hashCode());
		return rc;
	}
@Override
public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FIO other = (FIO) obj;
		if (name == null)
			{
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
			return false;
		if (sn == null)
			{
				if (other.sn != null)
					return false;
			} else if (!sn.equals(other.sn))
			return false;
		return true;
	}

	}