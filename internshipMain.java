import java.util.Scanner;
abstract class internship
{
    public String[] typeofInternship = {"no data","Front-end Developer","Backend Developer","Full stack Developer","Cloud Engineer","Software Tester"};
    public String[] qualifications = {"no data","BTech","MTech","PG"};
    abstract void accept();
    abstract void display();
    abstract int internshipDetails();
//    public static boolean isValidEmail();


}
class InternshipProvider extends internship
{
    Scanner sc = new Scanner(System.in);
    public int id;
    InternshipProvider(int id)
    {
        this.id = id;
    }
        private String companyName;
        private String companyAddress;
        private int companyRequirment;
        private String companyMail;
        private int internshipDuration;
        private int qualificationRequirment;
        
        public void accept()
        {
            System.out.println("==================================================================");
            System.out.println("ENTER YOUR COMPANY NAME    :\t");
            companyName = sc.nextLine();
            System.out.println("ENTER YOUR COMPANY ADDRESS :\t");
            companyAddress = sc.nextLine();
            System.out.println("ENTER COMPANY EMAIL ID     :\t");
            companyMail = sc.nextLine();
        
            
            
            System.out.println("ENTER TYPE OF INTERNSHIP OFFERED(number Assigned)");
            
            for(int i = 1; i<this.typeofInternship.length;i++)
            {
                System.out.println(i+" - "+typeofInternship[i]);
            }
            companyRequirment = sc.nextInt();
            
            System.out.println("SELECT QUALIFICATION(number Assigned):");
            for(int i = 1; i<qualifications.length;i++)
            {
                System.out.println(i+"-"+qualifications[i]);
            }
            
            qualificationRequirment = sc.nextInt();

            System.out.println("ENTER INTERNSHIP DURATION");
            internshipDuration = sc.nextInt();
        }
        public void display()
        {
            System.out.println();
            System.out.println("==================================================================");
            System.out.println("COMPANY NAME        \t: " +companyName);
            System.out.println("COMPANY ADDRESS     \t: " +companyAddress);
            System.out.println("COMPANY EMAIL ID    \t: " +companyMail);
            System.out.println("QUALIFICATION       \t: "+qualifications[qualificationRequirment]);
            System.out.println("INTERNSHIP OFFERED  \t: " +typeofInternship[ companyRequirment ]);
            System.out.println("INTERNSHIP DURATION \t: " +internshipDuration+" MONTH'S ");
            System.out.println();
            System.out.println("==================================================================");

        }
        public int internshipDetails()
        {
            return companyRequirment;
        }
        
    }

    class InternshipSeeker extends internship
    {
        
        
        public int id;
        InternshipSeeker(int id)
        {
            this.id = id;
        }
        private String studentName="no data";
        private static String studemail = "no data";
        private int qualification;
        private long contactNumber;
        private int typeOfInternship= 0;

        Scanner sc = new Scanner(System.in);
        
        public void accept()
        {
            


            System.out.println("ENTER YOUR NAME:");
            studentName = sc.nextLine();
            System.out.println("ENTER YOUR MAIL ID:");
            studemail = sc.nextLine();
        
            System.out.println("SELECT QUALIFICATION : [Number Assigned]");
            for(int i = 1; i<qualifications.length;i++)
            {
                System.out.println(i+ " - "+qualifications[i]);
            }
            qualification = sc.nextInt();
            System.out.println("SELECT TYPE OF INTERNSHIP:(number Assigned)");
            for(int i = 1; i<typeofInternship.length;i++)
            {
                System.out.println(i+" - "+typeofInternship[i]);
            }
            typeOfInternship = sc.nextInt();
            System.out.println("ENTER YOUR CONTACT NUMBER:");
            contactNumber = sc.nextLong();
        }
        public void display()
        {
            System.out.println();
            System.out.println("STUDENT NAME             \t: "+studentName);
            System.out.println("STUDENT EMAIL            \t: "+studemail);
            System.out.println("QUALIFICATION OF STUDENT \t: "+this.qualifications[qualification]);
            System.out.println("TYPE OF INTERNSHIP DESIRE\t: "+this.typeofInternship[typeOfInternship]);
            System.out.println("STUDENT CONTACT NUMBER   \t: "+contactNumber);

        }
        public int internshipDetails()
        {
            return typeOfInternship;
        }
        

    }
    class login
    {
    private int id;
    private int pass;
    login(int id, int pass)
    {
    this.id = id;
    this.pass = pass;
    }
    public boolean loginMethod(int myID, int myPass) // 4 4 
    {
    if(id == myID && pass != myPass)
    {
        return false;
    }
    else if(id == myID && pass != myPass)
    {
    return false;
    }
    else if(id != myID && pass != myPass)
    {
    return false;
    }
    else
    {
    return true;
    }
    }
    }

    public class internshipMain {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int ch;
            int id = 0;
            int count = 0;
            int pass = 0;
            boolean loginStatus = false;
            int arrLocation = 0;
            int loginNumber = 0;

            int type[] = new int[10];
            login l[] = new login[10];
            
            InternshipProvider ip[] = new InternshipProvider[10];
            InternshipSeeker is[] = new InternshipSeeker[10];

            System.out.println("========== WELCOME TO INTERNSHIP MANAGMENT SYSTEM =========");
            
            
            while(true)
            {
            System.out.println();
            System.out.println("==================================================================");
            System.out.println("1 - REGISTER NEW USER");
            System.out.println("2 - LOGIN");
            System.out.println("3 - ENTER YOUR DETAILS");
            System.out.println("4 - DISPLAY DETAILS");
            System.out.println("5 - LOOK FOR INTERNS");
            System.out.println("6 - EXIT ");
            
            System.out.println("==================================================================");
            System.out.println("ENTER YOUR CHOICE ");
            ch = sc.nextInt();
            System.out.println("==================================================");
            
            switch(ch)
            {
                case 1:
                System.out.println("ENTER YOUR ID :");
                id = sc.nextInt();
                System.out.println("ENTER YOUR PASSWORD :");
                pass = sc.nextInt();

                System.out.println("WHO ARE YOU -?");
                System.out.println("1 - INTERNSHIP PROVIDER");
                System.out.println("2 - INTERNSHIP SEEKER");
                type[loginNumber] = sc.nextInt();//it will store the value which we have provided earlier in type array 0th position

                l[loginNumber] = new login(id, pass);//it will store id and pass to 0th postion in login arrayl[]
                loginNumber++;//increment by 1
                break;

                case 2:
                System.out.println("ENTER YOUR ID:");
                id = sc.nextInt();
                System.out.println("ENTER YOUR PASSWORD:");
                pass = sc.nextInt();

                for(int i = 0; i<loginNumber;i++)
                {
                    loginStatus = l[i].loginMethod(id, pass);
                if(loginStatus)
                {
                    System.out.println("==================================================");
                    System.out.println("LOGIN SUCESSFULL .......!!!!");
                    System.out.println("==================================================");
                    arrLocation = i;
                }
            
                else 
                {
                    count++;
                }
                if(count == loginNumber)
                {
                    System.out.println("LOGIN NOT FOUND");
                }
            }
            break;
                case 3:
                if(type[arrLocation] == 1)//if type[1] == 1 then data will added in internship Provider ip[] array
                {
                    ip[arrLocation] = new InternshipProvider(id);
                    ip[arrLocation].accept();//
                }
                else 
                {
                    is[arrLocation] = new InternshipSeeker(id);
                    is[arrLocation].accept();
                }
                break;
                case 4:
                if(type[arrLocation] == 1)
                {
                    ip[arrLocation].display();
                }
                else 
                {
                    is[arrLocation].display();
                }
                break;
                case 5:
                if(loginStatus)
                {
                    
                    if(type[arrLocation] == 1) 
                    {
                        for(int i = 0; i < loginNumber; i++) 
                        {
                            if(type[i] != 1) 
                            {
                                System.out.println(arrLocation);
                                if(is[i].internshipDetails() == ip[arrLocation].internshipDetails())
                                is[i].display();
                            }
                        }
                    }
            else
                {
                for(int i = 0; i < loginNumber; i++){
                if(type[i] == 1)
                {
                    if(is[arrLocation].internshipDetails() == ip[i].internshipDetails())
                    ip[i].display();
                }
            }   
        }
        }
        else
        {
            System.out.println("You are not Logged In..!!");
            System.out.println("---------------------------------------------------------------------------");
            sc.close();
        }
        break;
        case 6:
            System.out.println();
            System.out.println("================== THANK YOU =====================");
            System.out.println("==================================================");
            System.exit(1);
        break;
        }
        }
        }
        }