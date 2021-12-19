
package adapter_pattern;


public  class BigDecimal {

    BigDecimal(BigDecimal product) {
    }


    int product;
   float quotient;

    BigDecimal() {
       
    }

 
public int multiply(int num1, int num2){
    product = num1*num2;
    return product;
    
}

  public float divider(int num1,int num2){
       float qoutient =num1/num2;
  return quotient;

  }
  

        
}
    

