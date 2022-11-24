 interface printable{
    void print();
}


class A7 implements printable{
    public void print()
    {System.out.println("Hello");}

    public static void main(String args[]){
        A7 obj =new A7();
        obj.print();
    }
}
