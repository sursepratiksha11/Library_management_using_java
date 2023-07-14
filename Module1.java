package ref1;

public class Module1 {

  public String name,fname,surname,uni_id,uid;
    public int sem;

  public void Module1(String name,String fname,String surname,String uni_id,String uni,int sem)
  {
      this.name = name;
      this.fname = fname;
      this.surname = surname;
      this.uni_id = uni_id;
      this.uid = uni;
      this.sem = sem;
  }

    public void setdata()
    {
        System.out.println("------------------------------------------------------------------");
        System.out.println("  ***  STUDENT DETAILS  ***   ");
        System.out.println("STUDENT's NAME: "+name+" "+fname+" "+surname);
        System.out.println("UNIVERSITY ID: "+uni_id);
        System.out.println("USER ID: "+uid);
        System.out.println("SEMESTER: "+sem);
    }


}
