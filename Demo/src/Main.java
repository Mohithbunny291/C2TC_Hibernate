

class Main {
    public static void main(String[] args) {
       Dog d = new Dog(20, "Rohtih");
    //   System.out.println(d.name);
    //   System.out.println(d.age);
      // d.details(30, "Keerthi");
       System.out.println(d.name);
       
    }
}

class Dog{
    int age = 9;
    String name = "Mohith";
    
    public Dog(int age,String name){
    	this.age = age;
    	this.name = name;
        System.out.println(age+" "+name);
    }
    
    public void details(int age,String name){
         System.out.println(age+" "+name);
    }
}