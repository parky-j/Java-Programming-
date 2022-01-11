class Business implements Cloneable {
    private String company;
    private String work;
    
    public Business(String company, String work) {
        this.company = company;
        this.work = work;
    }
    
    public void showBusinessInfo() {
        System.out.println("ȸ��: " + company);
        System.out.println("����: " + work);
    }
    
public Object clone() throws CloneNotSupportedException{
	return super.clone();
}
}

class PersonalInfo implements Cloneable {
    private String name;
    private int age;
    private Business bz;
    
    public PersonalInfo(String name, int age, String company, String work) {
        this.name = name;
        this.age = age;
        bz = new Business(company, work);
    }	
    
    public void showPersonalInfo() {
        System.out.println("�̸�: " + name);
        System.out.println("����: " + age);
        bz.showBusinessInfo();
    }
    public Object clone() throws CloneNotSupportedException{
	PersonalInfo p = (PersonalInfo)super.clone();
	
	p.bz = (Business)bz.clone();
	return p;
}
}

class DeepCopyTest2 {
    public static void main(String[] args) {
        try {
            PersonalInfo org =
                      	new PersonalInfo("James", 22, "SimpeSound", "encoding");

            PersonalInfo cpy = (PersonalInfo)org.clone();
			
	    org.showPersonalInfo();
            cpy.showPersonalInfo();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
