class Main3 {

    Main3(int f,int s)
    {
        System.out.println(f);
      System.out.println(s);
    }
    Main3()
    {this(2,3);}

    Main3 print(){
        return this;
    }

    public static void main(String[] args)
    {
        Main3 f=new Main3();

        f.print().print();
    }
}
