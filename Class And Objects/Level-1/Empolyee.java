class Employee {
    private String name;
    private int ID;
    private double salary;
 
    Employee(String var1, int var2, double var3) {
       this.name = var1;
       this.ID = var2;
       this.salary = var3;
    } 
    public void Display() {
       System.out.println(this.name);
       System.out.println(this.ID);
       System.out.println(this.salary);
    }
    public static void main(String[] var0) {
       Employee var1 = new Employee("Rithik", 21, 40000.0);
       var1.Display();
    }
 }
 