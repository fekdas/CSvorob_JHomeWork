package HomeWork9;

import java.util.Date;

public class Student	{

    private String name;
    private String sname;
    private Date birth;

    public Student(String name, String sname, Date birth)
    {
        this.name = name;
        this.sname = sname;
        this.birth = birth;
    }
    public String getName()
    {		return name;	}
    public void setName(String name)
    {		this.name = name;	}

    public String getSname()
    {		return sname;	}
    public void setSname(String sname)
    {		this.sname = sname;	}

    public Date getBirth()
    {		return birth;	}
    public void setBirth(Date birth)
    {		this.birth = birth;	}

    @Override
    public String toString()
    {		return "Student: name:" + name + " sname:" + sname + " birth:" + birth;}

}
