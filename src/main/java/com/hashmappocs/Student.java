package com.hashmappocs;

public class Student {
	private int rollno;
    private String name;

    // Constructor
    public Student(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    public String getname()
    {
        return this.name;
    }

    public int getmarks()
    {
        return this.rollno;
    }

    public void setname(String name)
    {
        this.name = name;
    }

    public void setmarks(int rollno)
    {
        this.rollno = rollno;
    }

    // Overriding the hashcode() function
    @Override
    public int hashCode()
    {
        final int temp = 14;
        int ans = 1;
        ans = temp * ans + rollno;
        return ans;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Student other = (Student)o;
        if (this.rollno != other.rollno) {
            return false;
        }
        return true;
    }
}

