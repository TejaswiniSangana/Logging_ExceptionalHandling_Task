package com.epam;

public class Simple_CompoundInterest_HouseRent {
    private float principalAmount;
    private float term_of_loan_years;
    private float rate_of_interest;
    private float no_of_times_compounded;
    private int materialStandard;
    private float total_area_of_house;
    Simple_CompoundInterest_HouseRent(float principalAmt,float term_of_loan_yrs,float rateOfInterest,float n_compounded,int m_standard,float area){
        principalAmount=principalAmt;
        term_of_loan_years=term_of_loan_yrs;
        rate_of_interest=rateOfInterest;
        no_of_times_compounded=n_compounded;
        materialStandard=m_standard;
        total_area_of_house=area;
    }
    public float calculateSimpleInterest(){
        float sInterest;
        sInterest=(principalAmount*term_of_loan_years*rate_of_interest)/100;
        return (float) sInterest;
    }
    public float calculateCompoundInterest(){
        float cInterest;
        cInterest= (float) (principalAmount*(Math.pow(rate_of_interest/no_of_times_compounded,no_of_times_compounded*term_of_loan_years)));
        return (float) cInterest;
    }
    public float calculateHouseConstructionCost(){
        float construction_cost = 0;
        float cost_per_square_feet;
        if(materialStandard == 1){
            cost_per_square_feet= (float) 1200.0;
            construction_cost=cost_per_square_feet*total_area_of_house;
        }
        else if(materialStandard== 2){
            cost_per_square_feet= (float) 1500.0;
            construction_cost=cost_per_square_feet*total_area_of_house;
        }
        else if(materialStandard==3) {
            cost_per_square_feet = (float) 1800.0;
            construction_cost = cost_per_square_feet * total_area_of_house;
        }
        else if(materialStandard==4){
            cost_per_square_feet = (float) 2500.0;
            construction_cost = cost_per_square_feet * total_area_of_house;
        }
        return (float)construction_cost;
    }
}
