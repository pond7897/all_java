import java.util.Scanner;
class test_lab2 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter Salary: "); int Salary = kbd.nextInt();
        System.out.print("Enter Year cost: "); int Year_cost = kbd.nextInt();
        System.out.print("Enter Tax deduction: "); int Tax_deduction = kbd.nextInt();
        System.out.println();

        int amount = (Salary*12)-Year_cost-Tax_deduction;

        Scanner sc = new Scanner(System.in);
        System.out.print("You have other income? "); String choise = sc.nextLine();
        if(choise.equals("Yes") || choise.equals("Y")) {
            System.out.print("Input other income: "); int income = sc.nextInt();
            amount = amount+income;
            System.out.println(); System.out.printf("Income : %,d\n",amount);
        }
        else if(choise.equals("No") || choise.equals("N")) {
            System.out.println(); System.out.printf("Income : %,d\n",amount);
        }
        
        double tax = 0.0/100.0;
        if(amount >= 0 && amount <= 150000) tax = 0.0/100.0;
        else if(amount >= 150001 && amount <= 300000) tax = 5.0/100.0;
        else if(amount >= 300001 && amount <= 500000) tax = 10.0/100.0;
        else if(amount >= 500001 && amount <= 750000) tax = 15.0/100.0;
        else if(amount >= 750001 && amount <= 1000000) tax = 20.0/100.0;
        else if(amount >= 1000001 && amount <= 2000000) tax = 25.0/100.0;
        else if(amount >= 2000001 && amount <= 5000000) tax = 30.0/100.0;
        else if(amount >= 5000001) tax = 35.0/100.0;
        System.out.printf("Tax is %.0f%s\n",(tax*100),"%");

        double step7,step6,step5,step4,step3,step2,step1;

        if(tax == 5.0/100.0) System.out.printf("Cal Tax %,.0f \n",((amount-150000)*5.0/100.0)); // 150,000 - 300,000
        else if(tax == 10.0/100.0) { //300,000 - 500,000
            step1 = 150000*(5.0/100.0); //5% = 7,500
            step2 = (amount - 300000)*10.0/100.0;

            System.out.printf("step 2 \n Cal Tax %,.0f \n",step2);
            System.out.printf("step 1 \n Cal Tax %,.0f \n",step1);
            System.out.printf("Your Tax: %,.0f\n",(step1+step2));
        }else if(tax == 15.0/100.0) { //500,000 - 750,000
            step1 = 150000*(5.0/100.0); //5% = 7,500
            step2 = 200000*(10.0/100.0); //10% = 20,000
            step3 = (amount - (500000))*15.0/100.0;
            
            System.out.printf("step 3 \n Cal Tax %,.0f\n",step3);
            System.out.printf("step 2 \n Cal Tax %,.0f\n",step2);
            System.out.printf("step 1 \n Cal Tax %,.0f\n",step1);
            System.out.printf("Your Tax: %,.0f\n",(step1+step2+step3));
        }else if(tax == 20.0/100.0) { //750,000 - 1,000,000
            step1 = 150000*(5.0/100.0); //5% = 7500
            step2 = 200000*(10.0/100.0); //10% = 20,000
            step3 = 250000*(15.0/100.0); //15% = 37,500
            step4 = (amount - (750000))*20.0/100.0;
            
            System.out.printf("step 4 \n Cal Tax %,.0f\n",step4);
            System.out.printf("step 3 \n Cal Tax %,.0f\n",step3);
            System.out.printf("step 2 \n Cal Tax %,.0f\n",step2);
            System.out.printf("step 1 \n Cal Tax %,.0f\n",step1);
            System.out.printf("Your Tax: %,.0f\n",(step1+step2+step3+step4));
        }else if(tax == 25.0/100.0) { //1,000,000 - 2,000,000
            step1 = 150000*(5.0/100.0); //5% = 7500
            step2 = 200000*(10.0/100.0); //10% = 20,000
            step3 = 250000*(15.0/100.0); //15% = 37,500
            step4 = 250000*(20.0/100.0); //20% = 50,000
            step5 = (amount - (1000000))*25.0/100.0;

            System.out.printf("step 5 \n Cal Tax %,.0f\n",step5);
            System.out.printf("step 4 \n Cal Tax %,.0f\n",step4);
            System.out.printf("step 3 \n Cal Tax %,.0f\n",step3);
            System.out.printf("step 2 \n Cal Tax %,.0f\n",step2);
            System.out.printf("step 1 \n Cal Tax %,.0f\n",step1);
            System.out.printf("Your Tax: %,.0f\n",(step1+step2+step3+step4+step5));
        }else if(tax == 30.0/100.0) { //2,000,000 - 5,000,000
            step1 = 150000*(5.0/100.0);  //5% = 7,500
            step2 = 200000*(10.0/100.0); //10% = 20,000
            step3 = 250000*(15.0/100.0); //15% = 37,500
            step4 = 250000*(20.0/100.0); //20% = 50,000
            step5 = 1000000*(25.0/100.0); //25% = 250,000
            step6 = (amount - (2000000))*30.0/100.0;
            
            System.out.printf("step 6 \n Cal Tax %,.0f\n",step6);
            System.out.printf("step 5 \n Cal Tax %,.0f\n",step5);
            System.out.printf("step 4 \n Cal Tax %,.0f\n",step4);
            System.out.printf("step 3 \n Cal Tax %,.0f\n",step3);
            System.out.printf("step 2 \n Cal Tax %,.0f\n",step2);
            System.out.printf("step 1 \n Cal Tax %,.0f\n",step1);
            System.out.printf("Your Tax: %,.0f\n",(step1+step2+step3+step4+step5+step6));
        }else if(tax == 35.0/100.0) { //5,000,0000++
            step1 = 150000*(5.0/100.0); //5% = 7,500
            step2 = 200000*(10.0/100.0); //10% = 20,000
            step3 = 250000*(15.0/100.0); //15% = 37,500
            step4 = 250000*(20.0/100.0); //20% = 50,000
            step5 = 1000000*(25.0/100.0); //25% = 250,000
            step6 = 3000000*(30.0/100.0); //30% = 900,000
            step7 = (amount - (5000000))*35.0/100.0;
            
            System.out.printf("step 7 \n Cal Tax %,.0f\n",step7);
            System.out.printf("step 6 \n Cal Tax %,.0f\n",step6);
            System.out.printf("step 5 \n Cal Tax %,.0f\n",step5);
            System.out.printf("step 4 \n Cal Tax %,.0f\n",step4);
            System.out.printf("step 3 \n Cal Tax %,.0f\n",step3);
            System.out.printf("step 2 \n Cal Tax %,.0f\n",step2);
            System.out.printf("step 1 \n Cal Tax %,.0f\n",step1);
            System.out.printf("Your Tax: %,.0f\n",(step1+step2+step3+step4+step5+step6+step7));
        }else System.out.println("Your Tax = Free Tax");

        kbd.close();
        sc.close();
    }
    
}

