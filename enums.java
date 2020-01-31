class enums {
    enum color {red, blue, pink}


    //enum inside enums class
    //it will create two classes enums and enum$color
    public static void main(String[] args) {
        for (color d : color.values()) {
            System.out.println(d);
        }
    }
}