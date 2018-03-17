/**
 * Implement a person class that holds information such as name, and date of birth.
 * The following list describes the attributes and methods to be implemented:

 - name:String
 - age:int
 + Person()
 + Person(String, int)
 + setName(String):void
 + getName():String
 + setAge(int):void
 + getAge():int
 + toString():String
 + equals(Person):boolean

 */


class Person
{
    private String name;
    private int age;

    // accessors and mutators
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }


    public Person()
    {
        this.name = null;
        this.age = 0;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }


    public String toString()
    {
        // look at unit test for format
        return "Person(name=" + name + ", age=" + age + ")";
    }

    public boolean equals(Person other)
    {
        if (this.name.equals(other.getName()))
        {
            return this.age == other.getAge();
        }
        return false;
    }
}
