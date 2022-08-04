class student
{
    int roll;
    void exam()
    {
        System.out.println(roll);
    }
}
class test{
    public static void main(String args[])
    {
        student Abhi= new student();
        student Semonti=new student();
        Abhi.roll=31;
        Semonti.roll=56;
        Abhi.exam();
        Semonti.exam();
    }

}