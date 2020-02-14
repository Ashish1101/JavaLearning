
class demo {
    public static void main(String[] args) {
        singleton s = singleton.getinstance();
        singleton s1 = singleton.getinstance();
        s.show();
        s1.doSomething(); 
    }
}