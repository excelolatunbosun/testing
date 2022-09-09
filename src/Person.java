public class Person {
   private String name;
   private int age;
   private String occupation;
   private Gender gender;

    public Person(String name, int age, String occupation, Gender gender){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getOccupation(){
        return occupation;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public Gender getGender(){
        return gender;
    }
}
