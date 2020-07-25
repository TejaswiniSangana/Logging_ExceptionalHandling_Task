package com.epam;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App extends Simple_CompoundInterest_HouseRent
{
    private static final Logger LOGGER = LogManager.getLogger(App.class);

    public App(float principalAmount, float term_of_loan_years, float rate_of_interest, float no_of_times_compounded, int materialStandard, float total_area_of_house) {
        super(principalAmount,term_of_loan_years,rate_of_interest,no_of_times_compounded,materialStandard,total_area_of_house);
        LOGGER.info("Simple And Compound Interest Calculation");
        LOGGER.info("Simple Interest : Rs."+calculateSimpleInterest());
        LOGGER.info("Compound Interest : Rs."+calculateCompoundInterest());
        LOGGER.info("House Construction Cost Calculation");
        LOGGER.info("Construction cost of House : Rs."+calculateHouseConstructionCost());
    }

    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        LOGGER.info("Simple And Compound Interest Calculation Details");
        float principalAmount,rate_of_interest,term_of_loan_years,no_of_times_compounded;
        LOGGER.info("Principal Amount:");
        principalAmount=scanner.nextFloat();
        LOGGER.info("Rate of Interest:");
        rate_of_interest=scanner.nextFloat();
        LOGGER.info("Term of loan in years:");
        term_of_loan_years=scanner.nextFloat();
        LOGGER.info("Number of times that interest is compounded:");
        no_of_times_compounded=scanner.nextFloat();
        LOGGER.info("House Construction Cost Calculation Details");
        float total_area_of_house;
        int materialStandard;
        LOGGER.info("Materials to be used for House construction:");
        LOGGER.info("1.Standard Materials\n2.Above Standard Materials\n3.High Standard Materials\n4.High Standard Materials and Fully Automated Home");
        materialStandard=scanner.nextInt();
        LOGGER.info("Total Area of the House:");
        total_area_of_house=scanner.nextFloat();
        App obj=new App(principalAmount,term_of_loan_years,rate_of_interest,no_of_times_compounded,materialStandard,total_area_of_house);
    }
}

