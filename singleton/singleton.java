class singleton {
    private static singleton instance;
    private singleton() {} //private const
    public static singleton getinstance() {
        if(instance == null) {
            //lazy method
         instance = new singleton();
    }
   return instance;
 }

 void show() {
     System.out.println("hello");
     System.out.println(instance);
 }

 void doSomething() {
     System.out.println("hello java");
 }
}