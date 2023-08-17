class Sample{
    private Integer num = 0;
    private String key ;
    public static String word;

    public Sample(){
        this.num = 200055;
        this.key = "keyword";
        word = (Integer.toString(this.num) + this.key);
    }

    public static void main(String args[]){
        System.out.println(word);
    }
}