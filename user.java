import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;

public class user implements ActionListener{
		JFrame f;
		JPanel[] p=new JPanel[5];
		JTextField HPtext[],APtext[],FStext[],GPtext[];
	user(){
		f=new JFrame("Sequence Printing");
		p[0]=new JPanel();p[1]=new JPanel();p[2]=new JPanel();p[3]=new JPanel();p[4]=new JPanel();

		JButton[] APbutton=new JButton[5];
		APbutton[0]=new JButton("Find Sequence");APbutton[0].setActionCommand("APFind Sequence");APbutton[0].addActionListener(this);
		APbutton[1]=new JButton("Nth Term-beginnig");APbutton[1].setActionCommand("AP Term from beginning");APbutton[1].addActionListener(this);
		APbutton[2]=new JButton("Nth Term-end");APbutton[2].setActionCommand("AP Term from end");APbutton[2].addActionListener(this);
		APbutton[3]=new JButton("Sum of Term");APbutton[3].setActionCommand("APSum");APbutton[3].addActionListener(this);
		APbutton[4]=new JButton("Arithmetic Mean");APbutton[4].setActionCommand("APArithmetic Mean");APbutton[4].addActionListener(this);
		JLabel[] APlabel=new JLabel[6];
		APlabel[0]=new JLabel("First Term");APlabel[1]=new JLabel("Last Term");
		APlabel[2]=new JLabel("Number of Term");APlabel[3]=new JLabel("Common Difference");
		APlabel[4]=new JLabel("Term to be Found");APlabel[5]=new JLabel("Result");
		APtext=new JTextField[6];
		APtext[0]=new JTextField(58);APtext[0].setEditable(true);
		APtext[1]=new JTextField(58);APtext[1].setEditable(true);
		APtext[2]=new JTextField(54);APtext[2].setEditable(true);
		APtext[3]=new JTextField(51);APtext[3].setEditable(true);
		APtext[4]=new JTextField(55);APtext[4].setEditable(true);
		APtext[5]=new JTextField(56);APtext[5].setEditable(false);
		APtext[0].setBounds(300,50,250,100);APtext[1].setBounds(300,100,250,100);APtext[2].setBounds(300,150,250,100);
		APtext[3].setBounds(300,200,250,100);APtext[4].setBounds(300,250,250,100);APtext[5].setBounds(300,300,250,100);
		p[0].add(APlabel[0]);p[0].add(APtext[0]);
		p[0].add(APlabel[1]);p[0].add(APtext[1]);
		p[0].add(APlabel[2]);p[0].add(APtext[2]);
		p[0].add(APlabel[3]);p[0].add(APtext[3]);
		p[0].add(APlabel[4]);p[0].add(APtext[4]);
		p[0].add(APlabel[5]);p[0].add(APtext[5]);
		p[0].add(APbutton[0]);
		p[0].add(APbutton[1]);
		p[0].add(APbutton[2]);
		p[0].add(APbutton[3]);
		p[0].add(APbutton[4]);

		JButton[] GPbutton=new JButton[6];
		GPbutton[0]=new JButton("Sum-First-n-Term");GPbutton[0].setActionCommand("GPSum First n term");GPbutton[0].addActionListener(this);
		GPbutton[1]=new JButton("Sum-infinite");GPbutton[1].setActionCommand("GPSum-infinite");GPbutton[1].addActionListener(this);
		GPbutton[2]=new JButton("Total-Number-of-Terms");GPbutton[2].setActionCommand("GPTotal-Number-of-Terms");GPbutton[2].addActionListener(this);
		GPbutton[3]=new JButton("Nth-Term");GPbutton[3].setActionCommand("GPNth-Term");GPbutton[3].addActionListener(this);
		GPbutton[4]=new JButton("Print Sequence");GPbutton[4].setActionCommand("GPPrint Sequence");GPbutton[4].addActionListener(this);
		GPbutton[5]=new JButton("Common Ratio");GPbutton[5].setActionCommand("GPCommon Ratio");GPbutton[5].addActionListener(this);
		JLabel[] GPlabel=new JLabel[7];
		GPlabel[0]=new JLabel("Number 1");GPlabel[1]=new JLabel("Number 2");GPlabel[2]=new JLabel("Number 3");
		GPlabel[3]=new JLabel("Total Number of Terms");GPlabel[4]=new JLabel("Nth Term");
		GPlabel[5]=new JLabel("Last Term");GPlabel[6]=new JLabel("Result");
		GPtext=new JTextField[7];
		GPtext[0]=new JTextField(58);GPtext[0].setEditable(true);
		GPtext[1]=new JTextField(58);GPtext[1].setEditable(true);
		GPtext[2]=new JTextField(54);GPtext[2].setEditable(true);
		GPtext[3]=new JTextField(51);GPtext[3].setEditable(true);
		GPtext[4]=new JTextField(60);GPtext[4].setEditable(true);
		GPtext[5]=new JTextField(60);GPtext[5].setEditable(true);
		GPtext[6]=new JTextField(56);GPtext[6].setEditable(false);
		GPtext[0].setBounds(300,50,250,100);GPtext[1].setBounds(300,100,250,100);GPtext[2].setBounds(300,150,250,100);
		GPtext[3].setBounds(300,200,250,100);GPtext[4].setBounds(300,250,250,100);GPtext[5].setBounds(300,300,250,100);GPtext[6].setBounds(300,350,250,100);
		p[1].add(GPlabel[0]);p[1].add(GPtext[0]);
		p[1].add(GPlabel[1]);p[1].add(GPtext[1]);
		p[1].add(GPlabel[2]);p[1].add(GPtext[2]);
		p[1].add(GPlabel[3]);p[1].add(GPtext[3]);
		p[1].add(GPlabel[4]);p[1].add(GPtext[4]);
		p[1].add(GPlabel[5]);p[1].add(GPtext[5]);
		p[1].add(GPlabel[6]);p[1].add(GPtext[6]);
		p[1].add(GPbutton[0]);
		p[1].add(GPbutton[1]);
		p[1].add(GPbutton[2]);
		p[1].add(GPbutton[3]);
		p[1].add(GPbutton[4]);
		p[1].add(GPbutton[5]);
		
		JButton[] HPbutton=new JButton[5];
		HPbutton[0]=new JButton("Number Of terms");HPbutton[0].setActionCommand("HP Number Of terms");HPbutton[0].addActionListener(this);
		HPbutton[1]=new JButton("Sum- last n terms");HPbutton[1].setActionCommand("HP Sum of last n number");HPbutton[1].addActionListener(this);
		HPbutton[2]=new JButton("Sum- first n terms");HPbutton[2].setActionCommand("HPSum");HPbutton[2].addActionListener(this);
		HPbutton[3]=new JButton("nth Term");HPbutton[3].setActionCommand("HPTerm");HPbutton[3].addActionListener(this);
		HPbutton[4]=new JButton("Print Sequence");HPbutton[4].setActionCommand("HPPrint Sequence");HPbutton[4].addActionListener(this);
		JLabel[] HPlabel=new JLabel[6];
		HPlabel[0]=new JLabel("First Term");HPlabel[1]=new JLabel("Last Term");
		HPlabel[2]=new JLabel("Number of Term");HPlabel[3]=new JLabel("Common Difference");
		HPlabel[4]=new JLabel("Term to be Found");HPlabel[5]=new JLabel("Result");
		HPtext=new JTextField[6];
		HPtext[0]=new JTextField(58);HPtext[0].setEditable(true);
		HPtext[1]=new JTextField(58);HPtext[1].setEditable(true);
		HPtext[2]=new JTextField(54);HPtext[2].setEditable(true);
		HPtext[3]=new JTextField(51);HPtext[3].setEditable(true);
		HPtext[4]=new JTextField(55);HPtext[4].setEditable(true);
		HPtext[5]=new JTextField(56);HPtext[5].setEditable(false);
		HPtext[0].setBounds(300,50,250,100);HPtext[1].setBounds(300,100,250,100);HPtext[2].setBounds(300,150,250,100);
		HPtext[3].setBounds(300,200,250,100);HPtext[4].setBounds(300,250,250,100);HPtext[5].setBounds(300,300,250,100);
		p[2].add(HPlabel[0]);p[2].add(HPtext[0]);
		p[2].add(HPlabel[1]);p[2].add(HPtext[1]);
		p[2].add(HPlabel[2]);p[2].add(HPtext[2]);
		p[2].add(HPlabel[3]);p[2].add(HPtext[3]);
		p[2].add(HPlabel[4]);p[2].add(HPtext[4]);
		p[2].add(HPlabel[5]);p[2].add(HPtext[5]);
		p[2].add(HPbutton[0]);
		p[2].add(HPbutton[1]);
		p[2].add(HPbutton[2]);
		p[2].add(HPbutton[3]);
		p[2].add(HPbutton[4]);


		JButton[] FSbutton=new JButton[3];
		FSbutton[0]=new JButton("Print");FSbutton[0].setActionCommand("FSPrint");FSbutton[0].addActionListener(this);
		FSbutton[1]=new JButton("Sum");FSbutton[1].setActionCommand("FSSum");FSbutton[1].addActionListener(this);
		FSbutton[2]=new JButton("Print");FSbutton[2].setActionCommand("FS Special Print");FSbutton[2].addActionListener(this);
		JLabel[] FSlabel=new JLabel[6];
		FSlabel[0]=new JLabel("Number of Terms");FSlabel[1]=new JLabel("Result");
		FSlabel[2]=new JLabel("First Term");FSlabel[3]=new JLabel("Second Term");FSlabel[4]=new JLabel("Number of term");FSlabel[5]=new JLabel("Result");
		FStext=new JTextField[6];
		FStext[0]=new JTextField(55);FStext[0].setEditable(true);
		FStext[1]=new JTextField(60);FStext[1].setEditable(false);
		FStext[2]=new JTextField(60);FStext[2].setEditable(true);
		FStext[3]=new JTextField(60);FStext[3].setEditable(true);
		FStext[4]=new JTextField(58);FStext[4].setEditable(true);
		FStext[5]=new JTextField(60);FStext[5].setEditable(false);
		p[3].add(FSlabel[0]);p[3].add(FStext[0]);
		p[3].add(FSlabel[1]);p[3].add(FStext[1]);
		p[3].add(FSbutton[0]);p[3].add(FSbutton[1]);
		p[4].add(FSlabel[2]);p[4].add(FStext[2]);
		p[4].add(FSlabel[3]);p[4].add(FStext[3]);
		p[4].add(FSlabel[4]);p[4].add(FStext[4]);
		p[4].add(FSlabel[5]);p[4].add(FStext[5]);
		p[4].add(FSbutton[2]);
		

		JTabbedPane tp=new JTabbedPane();
		tp.setBounds(10,10,700,500);
		tp.add("Arithmetic Sequence",p[0]);
		tp.add("Geometric progression",p[1]);
		tp.add("Harmonic Sequence",p[2]);
		tp.add("Fibonacci Sequence 1",p[3]);
		tp.add("Fibonacci Sequencec2",p[4]);
		f.add(tp);
		f.setSize(800,800);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new user();
	}
	public void actionPerformed(ActionEvent e){
		String series=e.getActionCommand();
		if(series.indexOf("HP")==0){
			hp object=new hp();
			Double Ft=Double.parseDouble(HPtext[0].getText());
			Double Lt=Double.parseDouble(HPtext[1].getText());
			Integer n= Integer.parseInt(HPtext[2].getText());
			Integer cd=Integer.parseInt(HPtext[3].getText());
			Integer nthterm=Integer.parseInt(HPtext[4].getText());
			if(series.equals("HP Number Of terms")){
				Double ans=(Double)object.numberOfTerms(Ft,cd,Lt);
				HPtext[5].setText(Double.toString(ans));
			}
			else if(series.equals("HP Sum of last n number")){
				Double sum=(Double)object.findSumLast(Lt,cd,nthterm);
				HPtext[5].setText(Double.toString(sum));
			}
			else if(series.equals("HPSum")){
				Double sum=(Double)object.findSum(Ft,cd,nthterm);
				HPtext[5].setText(Double.toString(sum));
			}
			else if(series.equals("HPTerm")){
				String ans=object.findTerm(Ft,cd,nthterm);
				HPtext[5].setText(ans);
			}
			else if(series.equals("HPPrint Sequence")){
				String ans=object.printSeq(Ft,n,cd);
				HPtext[5].setText(ans);
			}
			else{
				System.exit(0);
			}
		}
		if(series.indexOf("AP")==0){
			ap object=new ap();
			Double Ft=Double.parseDouble(APtext[0].getText());
			Double Lt=Double.parseDouble(APtext[1].getText());
			Integer n=Integer.parseInt(APtext[2].getText());
			Double cd=Double.parseDouble(APtext[3].getText());
			Integer term=Integer.parseInt(APtext[4].getText());
			if(series.equals("APFind Sequence")){
				String ans=object.findseq(cd,Ft,n);
				APtext[5].setText(ans);
			}
			else if(series.equals("AP Term from beginning")){
				Double ans=(Double)object.findterm(term,cd,Ft);
				APtext[5].setText(Double.toString(ans));
			}
			else if(series.equals("AP Term from end")){
				Double ans=(Double)object.endterm(term,cd,Lt);
				APtext[5].setText(Double.toString(ans));
			}
			else if(series.equals("APSum")){
				Double ans=(Double)object.sumofterms(n,cd,Ft);
				APtext[5].setText(Double.toString(ans));
			}
			else if(series.equals("APArithmetic Mean")){
				Double ans=(Double)object.am(Ft,cd,n);
				APtext[5].setText(Double.toString(ans));
			}
			else{
				System.exit(0);
			}
		}
		if(series.indexOf("FS")==0){
			fp object=new fp();
			if(series.equals("FSPrint")){
				Integer n=Integer.parseInt(FStext[0].getText());
				String ans=object.fibonacci(n);
				FStext[1].setText(ans);
			}
			else if(series.equals("FS Special Print")){
				Integer Ft=Integer.parseInt(FStext[2].getText());
				Integer St=Integer.parseInt(FStext[3].getText());
				Integer n=Integer.parseInt(FStext[4].getText());
				String ans=object.fib(Ft,St,n);
				FStext[5].setText(ans);
			}
			else if(series.equals("FSSum")){
				Integer n=Integer.parseInt(FStext[0].getText());
				Integer ans=(Integer)object.sumfibo(n);
				FStext[1].setText(Integer.toString(ans));
			}
			else{
				System.exit(0);
			}
		}
		if(series.indexOf("GP")==0){
			gp object=new gp();
			Double n1=Double.parseDouble(GPtext[0].getText());
			Double n2=Double.parseDouble(GPtext[1].getText());
			Double n3=Double.parseDouble(GPtext[2].getText());
			Integer Totalterms=Integer.parseInt(GPtext[3].getText());
			Integer nthterm=Integer.parseInt(GPtext[4].getText());
			Double Lt=Double.parseDouble(GPtext[5].getText());
			Double cr=object.commonRatio(n1,n2,n3);
			if(series.equals("GPSum First n term")){
				Double ans=(Double)object.sumFirstTerms(n1,cr,nthterm);
				GPtext[6].setText(Double.toString(ans));
			}
			else if(series.equals("GPSum-infinite")){
				Double ans=(Double)object.infinite(n1,cr);
				GPtext[6].setText(Double.toString(ans));
			}
			else if(series.equals("GPTotal-Number-of-Terms")){
				Integer ans=(Integer)object.last(Lt,cr,n1);
				GPtext[6].setText(Integer.toString(ans));
			}
			else if(series.equals("GPNth-Term")){
				Double ans=(Double)object.nterms(n1,cr,nthterm);
				GPtext[6].setText(Double.toString(ans));
			}
			else if(series.equals("GPPrint Sequence")){
				String ans=object.printSeq(n1,Totalterms);
				GPtext[6].setText(ans);
			}
			else if(series.equals("GPCommon Ratio")){
				GPtext[6].setText(Double.toString(cr));
			}
			else{
				System.exit(0);
			}
		}
				
			
	}			
}

class gp
{
	public static double sumFirstTerms(double number1, double cr, double nthterm)
	{
		double ans = Math.pow(cr,nthterm) - 1;
		double ans1 =(double) (number1*ans)/(double)(cr-1);
		return ans;
	}
	public static double infinite(double number1, double cr)
	{
		double ans =(double) number1/(double)(cr-1);
		return ans;
	}
	public static int last(double lastTerm, double cr, double number1)
	{
		double ans = (lastTerm/number1)*cr;
		int key=0;
		for(int i=1; i<=100; i++)
		{
			if(Math.pow(5,i)==ans)
			{
				key=i;
				break;
			}
		}
		return key;
	}
	public static double nterms(double number1, double cr, double nthterm)
	{
		double ans;
		ans= number1*(Math.pow(cr, nthterm-1));
		return ans;
	}
	public static String printSeq(double number1, int numberInSequence)
	{
		double ans;
		String s="";
		for(int i=1; i<=numberInSequence; i++)
		{
			ans =Math.pow(number1, i);
			s=s+Double.toString(ans)+" ";
		}
		return s;
	}
	public static double commonRatio(double number1, double number2, double number3)
	{
		double ans = number2/number1;
		return ans;
	}
}

class fp{
	//To find Fibonacci Series upto n terms
    public static String fibonacci(int n) {
        int f1 = 0, f2 = 1;
        String s = Integer.toString(f1) + " " + Integer.toString(f2);
        while ((n-2) > 0) {
            int temp = f2;
            f2 = f2 + f1;
            s = s + " " + Integer.toString(f2);
            f1 = temp;
            n--;
        }
        return s;

    }
//To find fibonacci series from given first two terms upto n terms
    public static String fib(int f1, int f2, int n) {
        String s = Integer.toString(f1) + " " + Integer.toString(f2);
        while ((n-2) > 0) {
            int temp = f2;
            f2 = f2 + f1;
            s = s + " " + Integer.toString(f2);
            f1 = temp;
            n--;
        }
        return s;
    }
    public static int sumfibo(int n)
    {
        int f1 = 0, f2 = 1,sum=1;
        while (n-2 != 0) {
            int temp = f2;
            f2 = f2 + f1;
            f1 = temp;
            sum=sum+f2;
            n--;
        }

        return sum;
    }
}

class ap {
//To find sequence by given first term and common difference
    public static String findseq(double cd, double firstterm,int n) {
        double next;
	String s ="";
	for(int i=0;i<n;i++){
		next=firstterm+i*cd;
		s=s+Double.toString(next)+" ";
	}
        return s;
        
    }
//To analyze the given sequence and find first term common difference and nth term
    public static void anlayseseq(double[] arr) {
        double a1 = arr[0];
        double cd = arr[1] - arr[0];
        String an = a1 + " + (n-1)" + cd;
        System.out.println("First term:" + a1);
        System.out.println("Common Difference:" + cd);
        System.out.println("nth term:" + an);
    }
//To find the nth term from beginning
    public static double findterm(int n, double cd, double firstterm) {
        double result;
        double p = n - 1;
        result = firstterm+ p * cd;
        return result;
    }
//To find nth term from end
    public static double endterm(int n, double cd, double lastterm) {
        double result;
        double p = n - 1;
        result = lastterm - p * cd;
        return result;
    }
//Sum of n terms
    public static double sumofterms(int n, double cd, double firstterm) {
        double sum;
        double p = n;
        sum = p / 2 * (2 * firstterm + (n - 1) * cd);
        return sum;
    }
//To find Arithmetic Mean
    public static double am(double firstterm,double cd,int n) {
        double sum = sumofterms(n,cd,firstterm);
        double result = sum / n;
        return result;
    }
}

class hp
{
	public static double numberOfTerms(double firstTerm, int cd, double lastTerm)
	{
		double a = 1/firstTerm;
		double b = 1/lastTerm;
		double ans = ((b - a)/cd)+1;
		return ans;
	}
	public static double findSumLast(double lastTerm, int cd, int term)
	{
		double sum=0;
		double a = 1/lastTerm;
		for(int i=0; i<term; i++)
		{
			double ans= a - i*cd;
			sum+=(double)1/(double)(ans);
		}
		return sum;

	}
	public static double findSum(double firstTerm, int cd, int term)
	{
		double a = 1/firstTerm;
		double sum=0;
		for(int i=1; i<=term; i++)
		{
			sum+=(double)1/(double)(a*i);
		}
		return sum;
	}
	public static String findTerm(double firstTerm, int cd, int term)
	{
		double a = 1/firstTerm;
		double ans = a + (term-1)*cd;
		double ans1 = (double)1/(double)ans;
		String t=Double.toString(ans1);
		return t;

	}
	public static String printSeq(double firstTerm, int n, int cd)
	{
		String a,seq="";
		double ans;
		double ab = 1/firstTerm;
		for(int i=1; i<=n; i++)
		{
			 ans = (double)1/(double)(ab*i);
			 a=Double.toString(ans);
			seq=seq+a+" ";

		}

		return seq;
	}
}

