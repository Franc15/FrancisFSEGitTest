public class Person
{
	String firstName;
	String surName;

	public Person()
	{
		this.firstName = "DEFAULT";
		this.surName = "DEFAULT";
	}

	public Person(String firstName, String surName)
	{
		this.firstName = firstName;
		this.surName = surName;
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

}

