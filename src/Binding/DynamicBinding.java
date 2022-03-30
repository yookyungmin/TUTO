package Binding;
//동적바인딩
class Schooll
{
    public void ringBell()
    {
        System.out.println("Ringing the school bell...");
    }
}
class Classroomm extends Schooll
{
    @Override
    public void ringBell() //오버라이딩
    {
        System.out.println("Ringing the classroom bell...");
    }
}
public class DynamicBinding
{
    public static void main(String[] args)
    {
        Schooll s1 = new Schooll(); //Type is School and object is of School
        s1.ringBell();
        Classroomm c1 = new Classroomm(); //Type is Classroom and object is of Classroom
        c1.ringBell();
        Schooll s2 = new Classroomm(); //Type is School and object is of Classroom
        s2.ringBell();
    }
}

/*
 * /*
Ringing the school bell..
Ringing the classroom bell...
Ringing the classroom bell...
*/
