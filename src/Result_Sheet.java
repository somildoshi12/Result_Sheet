import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
public class Result_Sheet
{
    Scanner sc = new Scanner(System.in);
    Scanner br = new Scanner(System.in);
    String name[];
    int roll[];
    String dob[];
    int std[];
    char div[];
    char division[];

    double eng1[];
    double eng2[];
    double hindi[];
    double maths[];
    double phy[];
    double chem[];
    double bio[];
    double hist[];
    double geo[];
    double comp[];
    double total[];
    double percent[];
    int new_std[];
    char new_div[];
    String grade[];
    String id[];

    double e1[];
    double e2[];
    double m[];
    double h[];
    double p[];
    double c[];
    double b[];
    double his[];
    double g[];
    double com[];

    String school;
    String address;

    double teng1[];
    double teng2[];
    double tmaths[];
    double thindi[];
    double tphy[];
    double tchem[];
    double tbio[];
    double thist[];
    double tgeo[];
    double tcomp[];

    int att[];
    public Result_Sheet(int n)
    {
        // initializing array variables
        roll = new int[n];
        name = new String[n];
        dob = new String[n];
        div = new char[n];
        division = new char[n];
        std = new int[n];

        eng1 = new double[n];
        eng2 = new double[n];
        hindi = new double[n];
        maths = new double[n];
        phy = new double[n];
        chem = new double[n];
        bio = new double[n];
        hist = new double[n];
        geo = new double[n];
        comp = new double[n];
        total = new double[n];
        percent = new double[n];
        new_std = new int[n];
        new_div = new char[n];
        grade = new String[n];
        id = new String[n];

        e1 = new double[n];
        e2 = new double[n];
        m = new double[n];
        h = new double[n];
        p = new double[n];
        c = new double[n];
        b = new double[n];
        his = new double[n];
        g = new double[n];
        com = new double[n];

        teng1 = new double[n];
        teng2 = new double[n];
        tmaths = new double[n];
        thindi = new double[n];
        tphy = new double[n];
        tchem = new double[n];
        tbio = new double[n];
        thist = new double[n];
        tgeo = new double[n];
        tcomp = new double[n];

        att = new int[n];
    }

    public void input_1(int a)
    {
        // inputing the values
        System.out.println();
        System.out.print("Enter name of student : ");
        name[a] = br.nextLine();

        System.out.print("Enter standard : ");
        std[a] = sc.nextInt();
        while(std[a]<1 || std[a]>10)
        {
            System.out.println("\nInvalid input");
            System.out.print("Enter standard : ");
            std[a] = sc.nextInt();
        }

        System.out.print("Enter division : ");
        division[a] = sc.next().charAt(0);
        div[a] = Character.toUpperCase(division[a]);
        while(div[a]<'A' || div[a]>'D')
        {
            System.out.println("\nInvalid input");
            System.out.print("Enter division : ");
            division[a] = sc.next().charAt(0);
            div[a] = Character.toUpperCase(division[a]);
        }

        System.out.print("Enter Roll Number : ");
        roll[a] = sc.nextInt();
        while(roll[a]<0 || roll[a]>60)
        {
            System.out.println("\nInvalid input");
            System.out.print("Enter Roll Number : ");
            roll[a] = sc.nextInt();
        }

        System.out.print("Enter Date Of Birth : ");
        dob[a] = br.nextLine();
        System.out.print("Enter ID number : ");
        id[a] = br.nextLine();
        System.out.print("Enter attendance of 250 days : ");
        att[a] = sc.nextInt();
        while(att[a]<0 || att[a]>250)
        {
            System.out.println("\nInvalid input");
            System.out.print("Enter attendance of 250 days : ");
            att[a] = sc.nextInt();
        }
        System.out.println("\n\n");
    }

    public void input_2(int t)
    {
        // inputing marks of internal exam
        System.out.println("\n\t\t\t\tMARKS OF INTERNAL EXAM\n");
        System.out.println("For Roll number :- "+roll[t]);

        System.out.print("Marks of English I out of 20 : ");
        e1[t] = sc.nextDouble();
        while(e1[t]<0 || e1[t]>20)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of English I out of 20 : ");
            e1[t] = sc.nextDouble();
        }

        System.out.print("Marks of English II out of 20 : ");
        e2[t] = sc.nextDouble();
        while(e2[t]<0 || e2[t]>20)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of English II out of 20 : ");
            e2[t] = sc.nextDouble();
        }

        System.out.print("Marks of Hindi out of 20 : ");
        h[t] = sc.nextDouble();
        while(h[t]<0 || h[t]>20)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Hindi out of 20 : ");
            h[t] = sc.nextDouble();
        }

        System.out.print("Marks of Maths out of 20 : ");
        m[t] = sc.nextDouble();
        while(m[t]<0 || m[t]>20)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Maths out of 20 : ");
            m[t] = sc.nextDouble();
        }

        System.out.print("Marks of Physics out of 20 : ");
        p[t] = sc.nextDouble();
        while(p[t]<0 || p[t]>20)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Physics out of 20 : ");
            p[t] = sc.nextDouble();
        }

        System.out.print("Marks of Chemistry out of 20 : ");
        c[t] = sc.nextDouble();
        while(c[t]<0 || c[t]>20)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Chemistry out of 20 : ");
            c[t] = sc.nextDouble();
        }

        System.out.print("Marks of Biology out of 20 : ");
        b[t] = sc.nextDouble();
        while(b[t]<0 || b[t]>20)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Biology out of 20 : ");
            b[t] = sc.nextDouble();
        }

        System.out.print("Marks of History out of 20 : ");
        his[t] = sc.nextDouble();
        while(his[t]<0 || his[t]>20)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of History out of 20 : ");
            his[t] = sc.nextDouble();
        }

        System.out.print("Marks of Geography out of 20 : ");
        g[t] = sc.nextDouble();
        while(g[t]<0 || g[t]>20)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Geography out of 20 : ");
            g[t] = sc.nextDouble();
        }

        System.out.print("Marks of Computer out of 20 : ");
        com[t] = sc.nextDouble();
        while(com[t]<0 || com[t]>20)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Computer out of 20 : ");
            com[t] = sc.nextDouble();
        }
        System.out.println();


        // inputing marks of semester exam
        System.out.println("\n\t\t\t\tMARKS OF SEMESTER EXAM\n");
        System.out.println("For Roll number :- "+roll[t]);

        System.out.print("Marks of English I out of 80 : ");
        eng1[t] = sc.nextDouble();
        while(eng1[t]<0 || eng1[t]>80)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of English I out of 80 : ");
            eng1[t] = sc.nextDouble();
        }

        System.out.print("Marks of English II out of 80 : ");
        eng2[t] = sc.nextDouble();
        while(eng2[t]<0 || eng2[t]>80)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of English II out of 80 : ");
            eng2[t] = sc.nextDouble();
        }

        System.out.print("Marks of Hindi out of 80 : ");
        hindi[t] = sc.nextDouble();
        while(hindi[t]<0 || hindi[t]>80)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Hindi out of 80 : ");
            hindi[t] = sc.nextDouble();
        }

        System.out.print("Marks of Maths out of 80 : ");
        maths[t] = sc.nextDouble();
        while(maths[t]<0 || maths[t]>80)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Maths out of 80 : ");
            maths[t] = sc.nextDouble();
        }

        System.out.print("Marks of Physics out of 80 : ");
        phy[t] = sc.nextDouble();
        while(phy[t]<0 || phy[t]>80)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Physics out of 80 : ");
            phy[t] = sc.nextDouble();
        }

        System.out.print("Marks of Chemistry out of 80 : ");
        chem[t] = sc.nextDouble();
        while(chem[t]<0 || chem[t]>80)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Chemistry out of 80 : ");
            chem[t] = sc.nextDouble();
        }

        System.out.print("Marks of Biology out of 80 : ");
        bio[t] = sc.nextDouble();
        while(bio[t]<0 || bio[t]>80)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Biology out of 80 : ");
            bio[t] = sc.nextDouble();
        }

        System.out.print("Marks of History out of 80 : ");
        hist[t] = sc.nextDouble();
        while(hist[t]<0 || hist[t]>80)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of History out of 80 : ");
            hist[t] = sc.nextDouble();
        }

        System.out.print("Marks of Geography out of 80 : ");
        geo[t] = sc.nextDouble();
        while(geo[t]<0 || geo[t]>80)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Geography out of 80 : ");
            geo[t] = sc.nextDouble();
        }

        System.out.print("Marks of Computer out of 80 : ");
        comp[t] = sc.nextDouble();
        while(comp[t]<0 || comp[t]>80)
        {
            System.out.println("\nInvalid input");
            System.out.print("Marks of Computer out of 80 : ");
            comp[t] = sc.nextDouble();
        }
        System.out.println();
    }

    public void total(int r)
    {
        teng1[r]=eng1[r]+e1[r];
        teng2[r]=eng2[r]+e2[r];
        tmaths[r]=maths[r]+m[r];
        thindi[r]=hindi[r]+h[r];
        tphy[r]=phy[r]+p[r];
        tchem[r]=chem[r]+c[r];
        tbio[r]=bio[r]+b[r];
        thist[r]=hist[r]+his[r];
        tgeo[r]=geo[r]+g[r];
        tcomp[r]=comp[r]+com[r];

        total[r]=teng1[r]+teng2[r]+tmaths[r]+thindi[r]+tphy[r]+tchem[r]+tbio[r]+thist[r]+tgeo[r]+tcomp[r];
        percent[r]=Math.rint((total[r]/1000)*100);
    }

    public void display_1(int m)
    {
        for(int i=0;i<=90;i++)
        {
            System.out.print("_");
        }

        // displaying headings
        school = "Children's Academy,Malad \u2122";
        System.out.println("\n\t\t\t\t\t\t\t\t"+school);
        System.out.print("\t\t\t\t\t");
        for(int i=0;i<=school.length()+19;i++)
        {
            System.out.print("*");
        }
        address = "Bachani Nagar, Malad(E), Mumbai-400097";
        System.out.println("\n\t\t\t\t\t\t"+address);
        for(int i=0;i<=90;i++)
        {
            System.out.print("_");
        }
        System.out.println();
        for(int i=0;i<=90;i++)
        {
            System.out.print("¯");
        }

        // using date method for printing date
        Date date = new Date();
        SimpleDateFormat d = new SimpleDateFormat("dd/MMMMMMMMM/YYYY");
        SimpleDateFormat timeForm = new SimpleDateFormat("hh : mm a");
        System.out.println("\nDate :- "+d.format(date)+"\t\t\t\t\t\t\t\tTime - "+timeForm.format(date)+"");
        System.out.println("-------------------------\t\t\t\t\t\t\t\t-----------------");

        System.out.println();
        System.out.println("Name\t\tStandard\tDivision\tRoll no.\t   Date of Birth\t   ID no.");
        System.out.println();
        System.out.println(name[m]+"\t\t"+std[m]+"\t\t\t"+div[m]+"\t\t\t"+roll[m]+"\t\t\t"+dob[m]+"\t\t\t"+id[m]);
        System.out.println();
        for(int i=0;i<=90;i++)
        {
            System.out.print("_");
        }
        System.out.println();
        for(int i=0;i<=45;i++)
        {
            System.out.print("_ ");
        }
        System.out.println();
    }

    public void display_2(int j)
    {
        System.out.println("\n\t\t\t\t\t\t\t\u272a MARKS SHEET \u272a");
        for(int i=0;i<=75;i++)
        {
            System.out.print("_");
        }
        System.out.println("\nSubject\t\t|Internal Marks\t|\tSemester Marks\t|\tTotal\t    |");
        for(int i=0;i<=75;i++)
        {
            System.out.print("¯");
        }
        System.out.println();
        System.out.println("English I\t|     "+e1[j]+"\t\t|\t     "+eng1[j]+"\t\t|\t "+teng1[j]+"\t    |");
        System.out.println("English II\t|     "+e2[j]+"\t\t|\t     "+eng2[j]+"\t\t|\t "+teng2[j]+"\t    |");
        System.out.println("Maths\t\t|     "+m[j]+"\t\t|\t     "+maths[j]+"\t\t|\t "+tmaths[j]+"\t    |");
        System.out.println("Hindi\t\t|     "+h[j]+"\t\t|\t     "+hindi[j]+"\t\t|\t "+thindi[j]+"\t    |");
        System.out.println("Physics\t\t|     "+p[j]+"\t\t|\t     "+phy[j]+"\t\t|\t "+tphy[j]+"\t    |");
        System.out.println("Chemistry\t|     "+c[j]+"\t\t|\t     "+chem[j]+"\t\t|\t "+tchem[j]+"\t    |");
        System.out.println("Biology\t\t|     "+b[j]+"\t\t|\t     "+bio[j]+"\t\t|\t "+tbio[j]+"\t    |");
        System.out.println("History\t\t|     "+his[j]+"\t\t|\t     "+hist[j]+"\t\t|\t "+thist[j]+"\t    |");
        System.out.println("Geography\t|     "+g[j]+"\t\t|\t     "+geo[j]+"\t\t|\t "+tgeo[j]+"\t    |");
        System.out.println("Computer\t|     "+com[j]+"\t\t|\t     "+comp[j]+"\t\t|\t "+tcomp[j]+"\t    |");
        for(int i=0;i<=75;i++)
        {
            System.out.print("¯");
        }
        System.out.println();
    }

    public void promotion(int l)     //for grade
    {
        if(percent[l]>90)
        {
            new_std[l] = std[l]+1;
            new_div[l] ='A';
        }
        else if(percent[l]>80 && percent[l]<=90)
        {
            new_std[l] = std[l]+1;
            new_div[l] ='B';
        }
        else if(percent[l]>70 && percent[l]<=80)
        {
            new_std[l] = std[l]+1;
            new_div[l] ='C';
        }
        else if(percent[l]>40 && percent[l]<=70)
        {
            new_std[l] = std[l]+1;
            new_div[l] ='D';
        }
        else if(percent[l]<=40)
        {
            new_std[l] = std[l];
            new_div[l] = div[l];
        }

        if(percent[l]>90)
        {
            grade[l] = "A+";
        }
        else if(percent[l]>80 && percent[l]<=90)
        {{ }
            grade[l] = "A";
        }
        else if(percent[l]>70 && percent[l]<=80)
        {
            grade[l] = "B+";
        }
        else if(percent[l]>60 && percent[l]<=70)
        {
            grade[l] = "B";
        }
        else if(percent[l]>50 && percent[l]<=60)
        {
            grade[l] = "C+";
        }
        else if(percent[l]>40 && percent[l]<=50)
        {
            grade[l] = "C";
        }
        else if(percent[l]<=40)
        {
            grade[l] = "FAIL";
        }
    }

    public void display_3(int k)
    {
        System.out.println();
        for(int i=0;i<=75;i++)
        {
            System.out.print("_");
        }
        System.out.println("\n\t\t\t\t\t\t\tPROMOTION LIST\n");
        System.out.println("Percentage \tNew Standard \tNew Division \tGrade \t\tAttendance");
        for(int i=0;i<=75;i++)
        {
            System.out.print("¯");
        }
        System.out.println();
        if(new_std[k]>10)
        {
            System.out.println(percent[k]+"%\t\tPASS\t\t---\t\t"+grade[k]+"\t\t"+att[k]+"/250");
        }
        else
        {
            System.out.println(percent[k]+"%\t\t\t"+new_std[k]+"\t\t\t\t"+new_div[k]+"\t\t\t"+grade[k]+"\t\t\t"+att[k]+"/250\t");
        }
        System.out.println();
        for(int i=0;i<=90;i++)
        {
            System.out.print("_");
        }
        System.out.println("\n    Teacher's signature\t\tPrincipal's signature\t\tParent's signature");
        System.out.println("\n    _ _ _ _ _ _ _ _ _ _\t\t_ _ _ _ _ _ _ _ _ _ _\t\t_ _ _ _ _ _ _ _ _ _");
        for(int i=0;i<=90;i++)
        {
            System.out.print("_");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int x = s.nextInt();

        Result_Sheet obj = new Result_Sheet(x);
        for(int i=0;i<x;i++)
        {
            obj.input_1(i);
            obj.input_2(i);
            System.out.println("\n\n");
        }
        System.out.print('\u000c');
        for(int i=0;i<x;i++)
        {
            obj.total(i);
            obj.promotion(i);
            obj.display_1(i);
            obj.display_2(i);
            obj.display_3(i);
            System.out.println("\n\n\n\n\n");

        }

        int temp=157;
        int i;
        char ch = (char)temp;
        for(i=0;i<=30;i++)
        {
            System.out.print(ch);
        }
        System.out.println("\n"+ch+"   Kailash Ahir     -   02   "+ch);
        System.out.println(ch+"   Somil Doshi      -   15   "+ch);

        for(i=0;i<=30;i++)
        {
            System.out.print(ch);
        }

        System.out.println("\n");
    }
}