public class Person
{
	private String firstName;
	private String surName;
	private int age;

	public Person()
	{
		this.firstName = "DEFAULT";
		this.surName = "DEFAULT";
		this.age = 0;
	}

	public Person(String firstName, String surName)
	{
		this.firstName = firstName;
		this.surName = surName;
		this.age = 0;
	}

	public void setFirstName(String newFirstName)
	{
		this.firstName = newFirstName;
	}

	public void setSurName(String newSurName)
	{
		this.surName = newSurname;
	}

	public String getFirstName()
	{
		return this.firstName;
	}

	public String getSurName()
	{
		return this.surName;
	}

	public int getAge()
	{
		return this.age;
	}

	public void printFullName()
	{
		System.out.println(this.firstName + " " + this.surName);
	}

	public String toString()
	{
		return this.FirstName + " " + this.surName + " " + this.age;
	}

}

